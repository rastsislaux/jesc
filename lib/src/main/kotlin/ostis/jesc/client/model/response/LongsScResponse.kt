package ostis.jesc.client.model.response

import ostis.jesc.client.model.addr.ScAddrImpl
import ostis.jesc.client.model.response.payload.ListScResponsePayload
import ostis.jesc.client.model.type.ScType

class LongsScResponse(
    id: Long,
    status: Boolean,
    event: Boolean,
    payload: ListScResponsePayload<Long>?,
): ScResponseImpl<ListScResponsePayload<Long>>(id,status, event, payload)
