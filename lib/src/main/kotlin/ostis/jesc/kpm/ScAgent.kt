package ostis.jesc.kpm

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEvent
import ostis.jesc.ctx.ScCtx

fun interface ScAgentFactory {
    fun make(ctx: ScCtx): ScAgent
}

abstract class ScAgent(protected val ctx: ScCtx) {
    open val name = this::class.qualifiedName
    abstract fun onEvent(listenAddr: ScAddr, edgeAddr: ScAddr, otherAddr: ScAddr): ScResult
}
