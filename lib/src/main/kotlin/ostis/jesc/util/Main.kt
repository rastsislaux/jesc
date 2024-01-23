package ostis.jesc.util

import ostis.jesc.JESC
import ostis.jesc.client.model.event.ScEvent
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.ctx.ScCtx
import ostis.jesc.kpm.ScAgent
import ostis.jesc.kpm.ScResult

class MyScAgent(ctx: ScCtx): ScAgent(ctx) {

    override fun onEvent(event: ScEvent): ScResult {
        TODO("Not yet implemented")
    }

}

fun main() {
    JESC.makeServer("localhost", 8090).apply {
        registerAgent ("nrel_main_idtf", ScEventType.ADD_OUTGOING_EDGE) { MyScAgent(it) }

        registerAgent("legal_knowledge_base", ScEventType.DELETE_ELEMENT) { object: ScAgent(it) {
            override fun onEvent(event: ScEvent): ScResult {
                TODO("Not yet implemented")
            }
        } }
    }
}