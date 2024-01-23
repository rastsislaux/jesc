package ostis.jesc.kpm

import ostis.jesc.client.model.event.ScEvent
import ostis.jesc.ctx.ScCtx

fun interface ScAgentFactory {
    fun make(ctx: ScCtx): ScAgent
}

abstract class ScAgent(protected val ctx: ScCtx) {
    open val name = this::class.qualifiedName
    abstract fun onEvent(event: ScEvent): ScResult
}
