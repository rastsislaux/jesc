package ostis.jesc.kpm

import mu.KotlinLogging
import ostis.jesc.JESC
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.ctx.ScCtx
import java.io.Closeable
import kotlin.math.log
import kotlin.reflect.jvm.jvmName

interface ScServer: Closeable {
    fun registerAgent(addr: ScAddr, eventType: ScEventType, factory: ScAgentFactory): Long
    fun registerAgent(idtf: String, eventType: ScEventType, factory: ScAgentFactory): Long
}

class ScServerImpl(host: String, port: Int): ScServer {

    private val ctx: ScCtx

    private val agents: MutableMap<Long, ScAgent> = mutableMapOf()

    private var closed = false

    init {
        ctx = JESC.makeCtx(host, port)
        ctx.api.client.addEventHandler { event ->
            agents
                .filter { agent -> agent.key == event.id  }
                .forEach { it.value.onEvent(event.payload[0], event.payload[1], event.payload[2]) }
        }

        Runtime.getRuntime().addShutdownHook(Thread { close() })
    }

    override fun registerAgent(addr: ScAddr, eventType: ScEventType, factory: ScAgentFactory): Long {
        val eventId = ctx.createEvent(addr, eventType)
        val agent = factory.make(ctx)
        logger.info { "Registered agent ${agent.name}" }
        agents[eventId] = agent
        return eventId
    }

    override fun registerAgent(idtf: String, eventType: ScEventType, factory: ScAgentFactory): Long {
        val addr = ctx.findBySystemIdentifier(idtf).orElseThrow { IllegalStateException("Node ($idtf) not found.") }
        return registerAgent(addr, eventType, factory)
    }

    override fun close() {
        if (closed) return

        logger.info { "Closing SC server connection." }
        closed = true
        ctx.close()
    }

    companion object {
        private val logger = KotlinLogging.logger {  }
    }

}