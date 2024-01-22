package ostis.jesc.client.model.response

import ostis.jesc.client.model.addr.ScAddrImpl
import ostis.jesc.client.model.response.payload.ListScResponsePayload
import ostis.jesc.client.model.type.ScType

class TypesScResponse(
    id: Long,
    status: Boolean,
    event: Boolean,
    payload: ListScResponsePayload<ScType>,
): ScResponseImpl<ListScResponsePayload<ScType>>(id,status, event, payload)
