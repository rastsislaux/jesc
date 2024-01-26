package ostis.jesc.memory.element

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeType

interface ScElement {
    val addr: ScAddr

    fun createEdgeTo(target: ScElement, edgeType: ScEdgeType): ScEdge
    fun createEdgeFrom(source: ScElement, edgeType: ScEdgeType): ScEdge

    fun delete()
}
