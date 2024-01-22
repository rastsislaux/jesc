package ostis.jesc.kpm

import ostis.jesc.JESC
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.ctx.ScCtx
import java.io.Closeable

interface ScServer: Closeable {
    fun registerAgent(addr: ScAddr, eventType: ScEventType, factory: ScAgentFactory): Long
    fun registerAgent(idtf: String, eventType: ScEventType, factory: ScAgentFactory): Long
}

class ScServerImpl(host: String, port: Int): ScServer {

    private val ctx: ScCtx

    private val agents: MutableMap<Long, ScAgent> = mutableMapOf()

    init {
        ctx = JESC.makeCtx(host, port)
        ctx.api.client.addEventHandler { event ->
            agents
                .filter { agent -> agent.key == event.id  }
                .forEach { it.value.onEvent(event) }
        }
    }

    override fun registerAgent(addr: ScAddr, eventType: ScEventType, factory: ScAgentFactory): Long {
        val eventId = ctx.createEvent(addr, eventType)
        agents[eventId] = factory.make(ctx)
        return eventId
    }

    override fun registerAgent(idtf: String, eventType: ScEventType, factory: ScAgentFactory): Long {
        val addr = ctx.findBySystemIdentifier(idtf).orElseThrow { IllegalStateException("Node ($idtf) not found.") }
        return registerAgent(addr, eventType, factory)
    }

    override fun close() {
        ctx.close()
    }

}