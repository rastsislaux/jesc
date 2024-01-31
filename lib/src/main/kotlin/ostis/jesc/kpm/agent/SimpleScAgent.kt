package ostis.jesc.kpm.agent

import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdge

abstract class SimpleScAgent(protected val memory: ScMemory): ScAgent {

    override val name = this::class.qualifiedName ?: "Unnamed Agent"

    override fun trigger(listenElement: ScElement, edge: ScEdge, otherElement: ScElement) {
        onEvent(listenElement, edge, otherElement)
    }

    abstract fun onEvent(listenElement: ScElement, edge: ScEdge, otherElement: ScElement)

}