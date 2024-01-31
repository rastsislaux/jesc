package ostis.jesc.memory

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.ctx.ScCtx
import ostis.jesc.memory.common.ScTriplet
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.link.ScLink
import ostis.jesc.memory.element.link.ScLinkType
import ostis.jesc.memory.element.node.ScNode
import ostis.jesc.memory.element.node.ScNodeType
import ostis.jesc.memory.struct.ScElementSet
import ostis.jesc.memory.struct.ScElementSetImpl
import ostis.jesc.memory.template.ScTemplate
import java.io.Closeable

interface ScMemory: Closeable {
    val ctx: ScCtx

    fun new(): Constructors
    fun get(): Getters

    fun find(template: ScTemplate): List<List<ScElement>>

    fun structs(): Structs

    interface Constructors {
        fun node(type: ScNodeType): ScNode
        fun edge(type: ScEdgeType, source: ScElement, target: ScElement): ScEdge
        fun link(type: ScLinkType, content: String): ScLink
        fun link(type: ScLinkType, content: Int): ScLink
        fun link(type: ScLinkType, content: Double): ScLink
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

    interface Structs {
        fun set(addr: ScAddr): ScElementSet
        fun set(sysIdtf: String): ScElementSet
        fun set(element: ScElement): ScElementSet
    }

}

