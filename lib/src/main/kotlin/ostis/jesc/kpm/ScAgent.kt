package ostis.jesc.kpm

import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.ScMemory

fun interface ScAgentFactory {
    fun make(ctx: ScMemory): ScAgent
}

abstract class ScAgent(protected val memory: ScMemory) {
    open val name = this::class.qualifiedName
    abstract fun onEvent(listenElement: ScElement, edge: ScEdge, otherElement: ScElement): ScResult
}
