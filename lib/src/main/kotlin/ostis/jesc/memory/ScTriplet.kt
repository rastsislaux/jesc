package ostis.jesc.memory

import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.ScElement

data class ScTriplet(
    val source: ScElement,
    val edge: ScEdge,
    val target: ScElement
)
