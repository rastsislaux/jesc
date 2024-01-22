package ostis.jesc.client.model.ref

import com.fasterxml.jackson.annotation.JsonValue

enum class ScRefType(
    @JsonValue
    val value: String
) {
    ADDR("addr"),
    REF("ref"),
    ALIAS("alias"),
    TYPE("type")
}