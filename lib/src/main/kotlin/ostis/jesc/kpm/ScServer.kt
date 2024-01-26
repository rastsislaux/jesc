package ostis.jesc.kpm

import mu.KotlinLogging
import ostis.jesc.JESC
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.memory.ScMemory
import java.io.Closeable

interface ScServer: Closeable {
    fun registerAgent(addr: ScAddr, eventType: ScEventType, factory: ScAgentFactory): Long
    fun registerAgent(idtf: String, eventType: ScEventType, factory: ScAgentFactory): Long
}

class ScServerImpl(private val memory: ScMemory): ScServer {

    private val agents: MutableMap<Long, ScAgent> = mutableMapOf()

    private var closed = false

    init {
        memory.ctx.api.client.addEventHandler { event ->
            agents
                .filter { agent -> agent.key == event.id  }
                .forEach { it.value.onEvent(
                    memory.get().element(event.payload[0]),
                    memory.get().edge(event.payload[1]),
                    memory.get().element(event.payload[2]))
                }
        }
        Runtime.getRuntime().addShutdownHook(Thread { close() })
    }

    override fun registerAgent(addr: ScAddr, eventType: ScEventType, factory: ScAgentFactory): Long {
        val eventId = memory.ctx.createEvent(addr, eventType)
        val agent = factory.make(memory)
        logger.info { "Registered agent ${agent.name}" }
        agents[eventId] = agent
        return eventId
    }

    override fun registerAgent(idtf: String, eventType: ScEventType, factory: ScAgentFactory): Long {
        val addr = memory.ctx.findBySystemIdentifier(idtf).orElseThrow { IllegalStateException("Node ($idtf) not found.") }
        return registerAgent(addr, eventType, factory)
    }

    override fun close() {
        if (closed) return

        logger.info { "Closing SC server connection." }
        closed = true
        memory.close()
    }

    companion object {
        private val logger = KotlinLogging.logger {  }
    }

}