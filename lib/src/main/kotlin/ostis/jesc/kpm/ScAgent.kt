package ostis.jesc.kpm

import ostis.jesc.client.model.event.ScEvent
import ostis.jesc.ctx.ScCtx

interface ScAgentFactory {
    fun make(ctx: ScCtx): ScAgent
}

abstract class ScAgent(protected val ctx: ScCtx) {
    abstract fun onEvent(event: ScEvent): ScResult
}
