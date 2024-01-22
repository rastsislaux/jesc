package ostis.jesc.client.model.request

import ostis.jesc.client.model.request.payload.ScRequestPayload

interface ScRequest<T: ScRequestPayload> {
    val id: Long
    val type: ScRequestType
    val payload: T
}
