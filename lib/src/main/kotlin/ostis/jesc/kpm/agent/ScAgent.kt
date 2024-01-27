package ostis.jesc.kpm.agent

import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdge

interface ScAgent {
    fun trigger(listenElement: ScElement, edge: ScEdge, otherElement: ScElement)
}