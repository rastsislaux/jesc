package ostis.jesc.client.model.request.payload.entry

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ostis.jesc.client.model.type.ScType

class KeynodesScRequestPayloadEntry private constructor(
    val command: Command,
    val idtf: String,

    @JsonProperty("elType")
    val elType: ScType?
): ScRequestPayloadEntry {

    companion object {
        fun find(idtf: String) = KeynodesScRequestPayloadEntry(Command.FIND, idtf, null)
        fun resolve(idtf: String, type: ScType) = KeynodesScRequestPayloadEntry(Command.RESOLVE, idtf, type)
    }

    enum class Command(
        @JsonValue
        private val jsonValue: String
    ) {
        FIND("find"),
        RESOLVE("resolve");
    }

}