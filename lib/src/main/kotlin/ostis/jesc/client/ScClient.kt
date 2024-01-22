package ostis.jesc.client

import ostis.jesc.client.model.event.ScEvent
import ostis.jesc.client.model.request.ScRequest
import ostis.jesc.client.model.request.payload.ScRequestPayload
import java.io.Closeable

interface ScClient: Closeable {
    fun <T> sendRequest(request: ScRequest<ScRequestPayload>, responseType: Class<T>): T
    fun addEventHandler(handler: (ScEvent) -> Unit)
    fun removeEventHandler(handler: (ScEvent) -> Unit)
}