package ostis.jesc.client.model.addr

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

class ScAddrImpl @JsonCreator constructor(
    @JsonValue override val raw: Long
) : ScAddr {

    @JsonCreator
    constructor(intValue: Int): this(intValue.toLong())

}