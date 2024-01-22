package ostis.jesc.client.model.response

import ostis.jesc.client.model.response.payload.ScResponsePayload

interface ScResponse<T: ScResponsePayload> {
    val id: Long
    val status: Boolean
    val event: Boolean
    val payload: T?
}