package ostis.jesc.api.builder

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.client.model.request.ScRequestImpl
import ostis.jesc.client.model.request.ScRequestType
import ostis.jesc.client.model.request.payload.EventsScRequestPayload
import ostis.jesc.client.model.response.LongsScResponse

class EventsBuilderImpl(private val api: ScApi) : EventsBuilder {

    private val createEntries: MutableList<EventsScRequestPayload.Create> = mutableListOf()
    private val deleteEntries: MutableList<Long> = mutableListOf()

    override fun create(addr: ScAddr, eventType: ScEventType): EventsBuilder {
        createEntries.add(EventsScRequestPayload.Create(eventType, addr))
        return this
    }

    override fun delete(id: Long): EventsBuilder {
        deleteEntries.add(id)
        return this
    }

    override fun execute(): LongsScResponse {
        return api.client.sendRequest(ScRequestImpl(
            api.makeId(), ScRequestType.EVENTS,
            EventsScRequestPayload(createEntries, deleteEntries)
        ), LongsScResponse::class.java)
    }

}