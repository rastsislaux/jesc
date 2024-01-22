package ostis.jesc.client

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import mu.KotlinLogging
import ostis.jesc.client.model.event.ScEvent
import ostis.jesc.client.model.request.ScRequest
import ostis.jesc.client.model.request.payload.ScRequestPayload
import ostis.jesc.client.ws.ScWebSocketClient

class ScClientImpl(
    private val wsc: ScWebSocketClient
) : ScClient {

    private val logger = KotlinLogging.logger {  }

    private val objectMapper = jacksonObjectMapper()
        .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
        .setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    init {
        wsc.connectBlocking()
    }

    override fun <T> sendRequest(request: ScRequest<ScRequestPayload>, responseType: Class<T>): T {
        val rawRequest = objectMapper.writeValueAsString(request)

        logger.debug { "Sent message: $rawRequest" }
        wsc.send(rawRequest)

        val rawResponse = wsc.getMessage(request.id)
        return objectMapper.readValue(rawResponse, responseType)
    }

    override fun addEventHandler(handler: (ScEvent) -> Unit) {
        wsc.addEventHandler(handler)
    }

    override fun removeEventHandler(handler: (ScEvent) -> Unit) {
        wsc.removeEventHandler(handler)
    }

    override fun close() {
        wsc.closeBlocking()
    }

}