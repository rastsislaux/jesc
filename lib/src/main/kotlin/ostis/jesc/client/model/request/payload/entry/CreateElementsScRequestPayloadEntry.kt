package ostis.jesc.client.model.request.payload.entry

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType

enum class ScElementType(@JsonValue val value: String) {
    NODE("NODE"), EDGE("edge"), LINK("LINK")
}

enum class ScContentType(@JsonValue val value: String) {
    INT("int"), FLOAT("float"), STRING("string"), BINARY("binary")
}

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonInclude(JsonInclude.Include.NON_NULL)
class CreateElementsScRequestPayloadEntry private constructor(
    val el: ScElementType,
    val type: ScType,
    val src: ScRef?,
    val trg: ScRef?,
    val content: Any?,
    val contentType: ScContentType?
): ScRequestPayloadEntry {

    companion object {

        fun node(type: ScType) = CreateElementsScRequestPayloadEntry(
            el = ScElementType.NODE,
            type = type,
            src = null, trg = null, content = null, contentType = null
        )

        fun edge(type: ScType, source: ScRef, target: ScRef) = CreateElementsScRequestPayloadEntry(
            el = ScElementType.EDGE,
            type = type,
            src = source,
            trg = target,
            content = null, contentType = null
        )

        fun link(type: ScType, content: Any, contentType: ScContentType) = CreateElementsScRequestPayloadEntry(
            el = ScElementType.LINK,
            type = type,
            content = content,
            contentType = contentType,
            src = null, trg = null
        )

    }

}