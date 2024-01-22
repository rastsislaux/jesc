package ostis.jesc.client.model.response

import com.fasterxml.jackson.databind.JsonNode
import ostis.jesc.client.model.addr.ScAddrImpl
import ostis.jesc.client.model.response.payload.ListScResponsePayload
import ostis.jesc.client.model.type.ScType

class ContentScResponse(
    id: Long,
    status: Boolean,
    event: Boolean,
    payload: ListScResponsePayload<JsonNode>,
): ScResponseImpl<ListScResponsePayload<JsonNode>>(id,status, event, payload)
