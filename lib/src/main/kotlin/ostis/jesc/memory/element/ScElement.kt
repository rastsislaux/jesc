package ostis.jesc.memory.element

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.node.ScNode

interface ScElement {
    val addr: ScAddr

    fun createEdgeTo(target: ScElement, edgeType: ScEdgeType): ScEdge
    fun createEdgeFrom(source: ScElement, edgeType: ScEdgeType): ScEdge

    fun edges(): Edges
    fun relations(): Relations

    fun delete()

    interface Edges {

        fun create(): Create
        fun find(): Find

        interface Create {
            fun to(target: ScElement, edgeType: ScEdgeType): ScEdge
            fun from(source: ScElement, edgeType: ScEdgeType): ScEdge
        }

        interface Find {
            fun target(edgeType: ScEdgeType)
            fun targets(edgeType: ScEdgeType)

            fun source(edgeType: ScEdgeType)
            fun sources(edgeType: ScEdgeType)
        }

    }

    interface Relations {

        fun create(): Create
        fun find(): Find

        interface Create {

            fun rrel(): Specific
            fun nrel(): Specific

            interface Specific {
                fun to(target: ScElement, rel: ScNode)
                fun from(target: ScElement, rel: ScNode)
            }

        }

        interface Find {

            fun rrel(): Specific
            fun nrel(): Specific

            interface Specific {
                fun target(rel: ScNode): ScElement
                fun targets(rel: ScNode): List<ScElement>
                fun source(rel: ScNode): ScElement
                fun sources(rel: ScNode): List<ScElement>
            }

        }

    }

}
