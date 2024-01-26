package ostis.jesc.memory

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.ctx.ScCtx
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeImpl
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.link.ScLink
import ostis.jesc.memory.element.link.ScLinkImpl
import ostis.jesc.memory.element.link.ScLinkType
import ostis.jesc.memory.element.node.ScNode
import ostis.jesc.memory.element.node.ScNodeImpl
import ostis.jesc.memory.element.node.ScNodeType
import java.io.Closeable

interface ScMemory: Closeable {
    val ctx: ScCtx

    fun new(): Constructors
    fun get(): Getters

    fun search(): Search

    interface Search {
        fun triplet(arg1: Any, arg2: Any, arg3: Any): Search
        fun result(): List<ScTriplet>
    }

    interface Constructors {
        fun node(type: ScNodeType): ScNode
        fun edge(type: ScEdgeType, source: ScElement, target: ScElement): ScEdge
        fun link(type: ScLinkType, content: String, contentType: ScContentType): ScLink
    }

    interface Getters {
        fun node(addr: ScAddr): ScNode
        fun node(sysIdtf: String): ScNode

        fun edge(addr: ScAddr): ScEdge
        fun edge(sysIdtf: String): ScEdge

        fun link(addr: ScAddr): ScLink
        fun link(sysIdtf: String): ScLink

        fun element(addr: ScAddr): ScElement
        fun element(sysIdtf: String): ScElement
    }

}

class ScMemoryImpl(override val ctx: ScCtx): ScMemory {

    override fun search() = object: ScMemory.Search {

        private val search = ctx.api.searchByTemplate()

        override fun triplet(arg1: Any, arg2: Any, arg3: Any): ScMemory.Search {
            ScTemplateTripletImpl(arg1, arg2, arg3).apply(search)
            return this
        }

        override fun result(): List<ScTriplet> {
            return search.execute().payload!!.addrs
                .map { ScTriplet(
                    this@ScMemoryImpl.get().element(it[0]),
                    this@ScMemoryImpl.get().edge(it[1]),
                    this@ScMemoryImpl.get().element(it[2])
                ) }
        }

    }

    override fun new() = object: ScMemory.Constructors {

        override fun node(type: ScNodeType) =
            ScNodeImpl(this@ScMemoryImpl, this@ScMemoryImpl.ctx.createNode(type.type))

        override fun edge(type: ScEdgeType, source: ScElement, target: ScElement) =
            ScEdgeImpl(this@ScMemoryImpl, this@ScMemoryImpl.ctx.createEdge(
                type.type, source.addr, target.addr
            ))

        override fun link(type: ScLinkType, content: String, contentType: ScContentType) =
            ScLinkImpl(this@ScMemoryImpl, this@ScMemoryImpl.ctx.createLink(
                type.type, content, contentType
            ))

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

    override fun close() {
        ctx.close()
    }

}