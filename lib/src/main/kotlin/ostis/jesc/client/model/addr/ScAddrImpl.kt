package ostis.jesc.client.model.addr

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

class ScAddrImpl @JsonCreator constructor(
    @JsonValue override val raw: Long
) : ScAddr {

    @JsonCreator
    constructor(intValue: Int): this(intValue.toLong())

    override fun toString(): String {
        return "ScAddrImpl[$raw]"
    }

    override fun hashCode() = raw.hashCode()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is ScAddrImpl) {
            return this.raw == other.raw
        }
        return false
    }

}