package ostis.jesc.client.model.request.payload.entry

import com.fasterxml.jackson.annotation.JsonValue
import ostis.jesc.client.model.addr.ScAddr

class ContentPayloadEntry private constructor(
    val command: Command,
    val type: ScContentType?,
    val data: Any?,
    val addr: ScAddr
): ScRequestPayloadEntry {

    companion object {

        fun get(addr: ScAddr) = ContentPayloadEntry(
            command = Command.GET,
            addr = addr,
            type = null,
            data = null
        )

        fun set(addr: ScAddr, data: Any, type: ScContentType) = ContentPayloadEntry(
            command = Command.SET,
            addr = addr,
            type = type,
            data = data
        )

    }


    enum class Command(@JsonValue val jsonValue: String) {
        SET("set"),
        GET("get")
    }

}