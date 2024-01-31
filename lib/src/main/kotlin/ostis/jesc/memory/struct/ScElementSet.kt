package ostis.jesc.memory.struct

import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.BaseScElement
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.template.ScTemplate

interface ScElementSet: ScElement, MutableSet<ScElement> {
    val element: ScElement
}

class ScElementSetImpl(memory: ScMemory, override val element: ScElement): BaseScElement(memory, element.addr), ScElementSet {

    override fun add(element: ScElement): Boolean {
        if (this.element.edges().find().targets(ScEdgeType.ACCESS_VAR_POS_PERM).contains(element)) {
            return false
        }

        this.element.edges().create().to(element, ScEdgeType.ACCESS_CONST_POS_PERM)
        return true
    }

    override fun addAll(elements: Collection<ScElement>): Boolean {
        val currentElements = element.edges().find().targets(ScEdgeType.ACCESS_VAR_POS_PERM)
        val toAdd = elements.filter { it !in currentElements }

        val create = memory.ctx.api.createElements()
        toAdd.forEach { create.edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(this.addr), ScRef.addr(it.addr)) }
        create.execute()

        return toAdd.isNotEmpty()
    }

    override fun clear() {
        val templ = ScTemplate.triplet(this, ScEdgeType.ACCESS_VAR_POS_PERM, ScType.VAR)
        memory.find(templ).forEach { it[1].delete() }
    }

    override fun iterator(): MutableIterator<ScElement> {
        TODO("Not yet implemented")
    }

    override fun remove(element: ScElement): Boolean {
        val templ = ScTemplate.triplet(this, ScEdgeType.ACCESS_VAR_POS_PERM, element)
        val triplet = memory.find(templ)
        triplet.map { it[1].delete() }
        return triplet.isNotEmpty()
    }

    override fun removeAll(elements: Collection<ScElement>): Boolean {
        val templ = ScTemplate.triplet(this, ScEdgeType.ACCESS_VAR_POS_PERM, ScType.VAR)
        val triplets = memory.find(templ)
        triplets.forEach { it[1].delete() }
        return triplets.isNotEmpty()
    }

    override fun retainAll(elements: Collection<ScElement>): Boolean {
        val templ = ScTemplate.triplet(this, ScEdgeType.ACCESS_VAR_POS_PERM, ScType.VAR)
        val toDelete = memory.find(templ)
            .filter { it[2] !in elements }
            .map { it[1] }
        toDelete.forEach { it.delete() }
        return toDelete.isNotEmpty()
    }

    override val size: Int
        get() {
            val templ = ScTemplate.triplet(this, ScEdgeType.ACCESS_VAR_POS_PERM, ScType.VAR)
            return memory.find(templ).size
        }

    override fun contains(element: ScElement): Boolean {
        val templ = ScTemplate.triplet(this, ScEdgeType.ACCESS_VAR_POS_PERM, element)
        return memory.find(templ).isNotEmpty()
    }

    override fun containsAll(elements: Collection<ScElement>): Boolean {
        val search = memory.ctx.api.searchByTemplate()
        elements.forEach { search.triplet(ScRef.addr(this.addr), ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM), ScRef.addr(it.addr)) }
        return search.execute().payload!!.addrs.isNotEmpty()
    }

    override fun isEmpty(): Boolean {
        val templ = ScTemplate.triplet(this, ScEdgeType.ACCESS_VAR_POS_PERM, ScType.VAR)
        return memory.find(templ).isEmpty()
    }

}
