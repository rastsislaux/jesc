package ostis.jesc.client.model.response

import ostis.jesc.client.model.addr.ScAddrImpl
import ostis.jesc.client.model.response.payload.ListScResponsePayload

class AddrsScResponse(
    id: Long,
    status: Boolean,
    event: Boolean,
    payload: ListScResponsePayload<ScAddrImpl>,
): ScResponseImpl<ListScResponsePayload<ScAddrImpl>>(id,status, event, payload)
