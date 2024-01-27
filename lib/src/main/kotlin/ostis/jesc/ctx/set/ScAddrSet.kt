package ostis.jesc.ctx.set

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.ctx.ScCtx

interface ScAddrSet: MutableSet<ScAddr> {
    val addr: ScAddr
}

class ScAddrSetImpl(val ctx: ScCtx, override val addr: ScAddr): ScAddrSet {

    override val size: Int
        get() = ctx.api.searchByTemplate()
            .triplet(ScRef.addr(addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.type(ScType.VAR))
            .execute().payload!!.addrs.size

    override fun add(element: ScAddr): Boolean {
        ctx.createEdge(ScType.EDGE_ACCESS_CONST_POS_PERM, addr, element)
        return true
    }

    override fun addAll(elements: Collection<ScAddr>): Boolean {
        val create = ctx.api.createElements()
        elements.map { create.edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(this.addr), ScRef.addr(it)) }
        create.execute()
        return true
    }

    override fun clear() {
        val delete = ctx.api.deleteElements()
        ctx.api.searchByTemplate()
            .triplet(ScRef.addr(addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.type(ScType.VAR))
            .execute().payload!!.addrs
            .forEach { delete.addr(it[1]) }
        delete.execute()
    }

    override fun contains(element: ScAddr): Boolean {
        return ctx.api.searchByTemplate()
            .triplet(ScRef.addr(this.addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.addr(element))
            .execute().payload!!.addrs.isNotEmpty()
    }

    override fun containsAll(elements: Collection<ScAddr>): Boolean {
        val search = ctx.api.searchByTemplate()
        elements.forEach { search.triplet(ScRef.addr(this.addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.addr(it)) }
        return search.execute().payload!!.addrs.isNotEmpty()
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun iterator(): MutableIterator<ScAddr> {
        return object : MutableIterator<ScAddr> {
            private val addrs = ctx.api.searchByTemplate()
                .triplet(ScRef.addr(this@ScAddrSetImpl.addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.type(ScType.VAR))
                .execute().payload!!.addrs.map { it[2] }

            private var idx = -1

            override fun hasNext(): Boolean {
                return idx != addrs.lastIndex
            }

            override fun next(): ScAddr {
                return addrs[++idx]
            }

            override fun remove() {
                this@ScAddrSetImpl.remove(addrs[idx])
            }
        }
    }

    override fun remove(element: ScAddr): Boolean {
        val tbd = ctx.api.searchByTemplate()
            .triplet(ScRef.addr(this.addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.addr(element))
            .execute().payload!!.addrs.map { it[1] }

        val delete = ctx.api.deleteElements()
        tbd.forEach { delete.addr(it) }
        delete.execute()

        return tbd.isNotEmpty()
    }

    override fun removeAll(elements: Collection<ScAddr>): Boolean {
        val tbd = elements
            .map { ctx.api.searchByTemplate()
                .triplet(ScRef.addr(addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.addr(it))
                .execute().payload!!.addrs.map { addrs -> addrs[1] }
            }
            .flatten()

        val delete = ctx.api.deleteElements()
        tbd.forEach { delete.addr(it) }
        delete.execute()

        return tbd.isNotEmpty()
    }

    override fun retainAll(elements: Collection<ScAddr>): Boolean {
        val tbd = filter { it !in elements }

        val delete = ctx.api.deleteElements()
        tbd.forEach { delete.addr(it) }
        delete.execute()

        return tbd.isNotEmpty()
    }

}