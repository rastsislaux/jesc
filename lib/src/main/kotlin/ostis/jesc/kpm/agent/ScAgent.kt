package ostis.jesc.kpm.agent

import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdge

interface ScAgent {
    val name: String
    fun trigger(listenElement: ScElement, edge: ScEdge, otherElement: ScElement)
}
