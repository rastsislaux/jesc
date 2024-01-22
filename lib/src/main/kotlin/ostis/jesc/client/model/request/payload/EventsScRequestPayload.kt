package ostis.jesc.client.model.request.payload

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType

class EventsScRequestPayload(
    val create: List<Create>,
    val delete: List<Long>
) : ScRequestPayload {

    class Create(
        val type: ScEventType,
        val addr: ScAddr
    )

}