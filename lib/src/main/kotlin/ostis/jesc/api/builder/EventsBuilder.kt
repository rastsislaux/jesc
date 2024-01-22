package ostis.jesc.api.builder

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.client.model.response.LongsScResponse

interface EventsBuilder {
    fun create(addr: ScAddr, eventType: ScEventType): EventsBuilder
    fun delete(id: Long): EventsBuilder
    fun execute(): LongsScResponse
}
