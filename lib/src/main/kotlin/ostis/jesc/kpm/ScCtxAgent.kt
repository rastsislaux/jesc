package ostis.jesc.kpm

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.kpm.agent.FinalizedScAgent
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdge

abstract class ScCtxAgent(memory: ScMemory): FinalizedScAgent(memory) {

    protected val ctx = memory.ctx

    final override fun trigger(listenElement: ScElement, edge: ScEdge, otherElement: ScElement) =
        onEvent(listenElement.addr, edge.addr, otherElement.addr)

    abstract fun onEvent(listenAddr: ScAddr, edgeAddr: ScAddr, otherAddr: ScAddr): ScResult

}
