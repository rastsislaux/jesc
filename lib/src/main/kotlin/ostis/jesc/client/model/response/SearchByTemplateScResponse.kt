package ostis.jesc.client.model.response

import ostis.jesc.client.model.response.payload.SearchByTemplateScResponsePayload

class SearchByTemplateScResponse(
    id: Long,
    status: Boolean,
    event: Boolean,
    payload: SearchByTemplateScResponsePayload,
) : ScResponseImpl<SearchByTemplateScResponsePayload>(
    id,
    status,
    event,
    payload,
)
