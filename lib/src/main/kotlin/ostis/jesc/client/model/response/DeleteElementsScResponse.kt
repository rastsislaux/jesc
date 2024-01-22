package ostis.jesc.client.model.response

import ostis.jesc.client.model.response.payload.ListScResponsePayload

class DeleteElementsScResponse(
    id: Long,
    status: Boolean,
    event: Boolean,
    payload: ListScResponsePayload<Boolean>,
) : ScResponseImpl<ListScResponsePayload<Boolean>>(id, status, event, payload)
