package ostis.jesc.client.ws

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import mu.KotlinLogging
import org.java_websocket.handshake.ServerHandshake
import ostis.jesc.client.ScException
import ostis.jesc.client.model.event.ScEvent
import ostis.jesc.client.model.event.ScEventImpl
import java.lang.Exception
import java.net.URI
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentHashMap

class ScWebSocketClientImpl(uri: URI): ScWebSocketClient(uri) {

    private val logger = KotlinLogging.logger {  }

    private val objectMapper: ObjectMapper = jacksonObjectMapper()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    private val messages = ConcurrentHashMap<Long, Pair<String, String?>>()

    private val eventHandlers: MutableList<(ScEvent) -> Unit> = ArrayList()

    override fun getMessage(id: Long): String {
        var message = messages[id]
        while (message == null) {
            message = messages[id]
        }
        message.second?.let { throw ScException(it) }
        return message.first
    }

    override fun addEventHandler(handler: (ScEvent) -> Unit) {
        eventHandlers.add(handler)
    }

    override fun removeEventHandler(handler: (ScEvent) -> Unit) {
        eventHandlers.remove(handler)
    }

    override fun onOpen(handshakedata: ServerHandshake) {
        // NO OP
    }

    override fun onMessage(message: String) {
        logger.debug { "Received message: $message" }
        val messageTree = objectMapper.readTree(message)

        if (messageTree["event"].asInt() == 1) {
            eventHandlers.forEach { handler ->
                Thread { handler(objectMapper.readValue(message, ScEventImpl::class.java)) }.start()
            }
            return
        }

        val isErrorsEmptyArray = messageTree["errors"].isArray && messageTree["errors"].isEmpty
        val isErrorsEmptyObject = messageTree["errors"].isObject && messageTree["errors"].isEmpty
        val errors = if (!isErrorsEmptyArray && !isErrorsEmptyObject) messageTree["errors"].toPrettyString() else null

        messages[messageTree["id"].asLong()] = message to errors
    }

    override fun onClose(code: Int, reason: String?, remote: Boolean) {
        // TODO: Implement reconnect, maybe
    }

    override fun onError(ex: Exception) {
        // NO OP
    }

}