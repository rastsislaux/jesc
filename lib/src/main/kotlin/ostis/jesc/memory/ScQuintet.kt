package ostis.jesc.memory

import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.node.ScNode

data class ScQuintet(
    val source: ScElement,
    val edge: ScEdge,
    val target: ScElement,
    val relAccess: ScEdge,
    val rel: ScNode
)
