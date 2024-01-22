package ostis.jesc.client.ws

import org.java_websocket.client.WebSocketClient
import ostis.jesc.client.model.event.ScEvent
import java.net.URI

abstract class ScWebSocketClient(uri: URI): WebSocketClient(uri) {

    abstract fun getMessage(id: Long): String

    abstract fun addEventHandler(handler: (ScEvent) -> Unit)

    abstract fun removeEventHandler(handler: (ScEvent) -> Unit)

}