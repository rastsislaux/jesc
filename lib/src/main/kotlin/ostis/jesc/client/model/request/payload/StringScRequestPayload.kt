package ostis.jesc.client.model.request.payload

import com.fasterxml.jackson.annotation.JsonValue

class StringScRequestPayload(
    @JsonValue
    val value: String
) : ScRequestPayload
