package ostis.jesc.memory

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.addr.ScAddrImpl
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.ctx.ScCtx
import ostis.jesc.memory.common.ScTriplet
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdgeImpl
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.link.ScLink
import ostis.jesc.memory.element.link.ScLinkImpl
import ostis.jesc.memory.element.link.ScLinkType
import ostis.jesc.memory.element.node.ScNodeImpl
import ostis.jesc.memory.element.node.ScNodeType
import ostis.jesc.memory.struct.ScElementSet
import ostis.jesc.memory.struct.ScElementSetImpl
import ostis.jesc.memory.template.ScTemplate

class ScMemoryImpl(override val ctx: ScCtx): ScMemory {

    override fun find(template: ScTemplate): List<List<ScElement>> {
        val search = ctx.api.searchByTemplate()
        template.triplets.forEach { it.apply(search) }
        return search.execute().payload!!.addrs.map { result ->
            result.map { get().element(it) }
        }
    }

    override fun new() = object: ScMemory.Constructors {

        override fun node(type: ScNodeType) =
            ScNodeImpl(this@ScMemoryImpl, this@ScMemoryImpl.ctx.createNode(type.type))

        override fun edge(type: ScEdgeType, source: ScElement, target: ScElement) =
            ScEdgeImpl(
                this@ScMemoryImpl, this@ScMemoryImpl.ctx.createEdge(
                    type.type, source.addr, target.addr
                )
            )

        override fun link(type: ScLinkType, content: String): ScLink {
            return ScLinkImpl(
                this@ScMemoryImpl, this@ScMemoryImpl.ctx.createLink(
                    type.type, content, ScContentType.STRING
                )
            )
        }

        override fun link(type: ScLinkType, content: Int): ScLink {
            return ScLinkImpl(
                this@ScMemoryImpl, this@ScMemoryImpl.ctx.createLink(
                    type.type, content, ScContentType.INT
                )
            )
        }

        override fun link(type: ScLinkType, content: Double): ScLink {
            return ScLinkImpl(
                this@ScMemoryImpl, this@ScMemoryImpl.ctx.createLink(
                    type.type, content, ScContentType.FLOAT
                )
            )
        }

    }

    override fun get() = object: ScMemory.Getters {

        override fun node(addr: ScAddr) = ScNodeImpl(this@ScMemoryImpl, addr)
        override fun node(sysIdtf: String) = node(this@ScMemoryImpl.ctx.findBySystemIdentifier(sysIdtf).get())

        override fun edge(addr: ScAddr) = ScEdgeImpl(this@ScMemoryImpl, addr)
        override fun edge(sysIdtf: String) = edge(this@ScMemoryImpl.ctx.findBySystemIdentifier(sysIdtf).get())

        override fun link(addr: ScAddr) = ScLinkImpl(this@ScMemoryImpl, addr)
        override fun link(sysIdtf: String) = link(this@ScMemoryImpl.ctx.findBySystemIdentifier(sysIdtf).get())

        override fun element(addr: ScAddr): ScElement {
            val type = ctx.getType(addr)
            return when {
                type.isNode -> node(addr)
                type.isEdge -> edge(addr)
                type.isLink -> link(addr)
                else -> throw IllegalStateException("This should never happen: $type is not a node, edge nor link")
            }
        }
        override fun element(sysIdtf: String) = element(this@ScMemoryImpl.ctx.findBySystemIdentifier(sysIdtf).get())

    }

    override fun structs() = object: ScMemory.Structs {

        override fun set(addr: ScAddr): ScElementSet = set(this@ScMemoryImpl.get().element(addr))
        override fun set(sysIdtf: String): ScElementSet = set(this@ScMemoryImpl.get().element(sysIdtf))
        override fun set(element: ScElement): ScElementSet = ScElementSetImpl(this@ScMemoryImpl, element)

    }

    override fun close() {
        ctx.close()
    }

}