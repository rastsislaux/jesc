package ostis.jesc.ctx.etc

import com.fasterxml.jackson.databind.JsonNode

class ScLinkContent(private val value: JsonNode) {
    fun int() = value.asInt()
    fun float() = value.asDouble()
    fun string() = value.asText()!!
}
