package ostis.jesc.api.builder

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.response.TypesScResponse

interface CheckElementsBuilder {
    fun addr(addr: ScAddr): CheckElementsBuilder
    fun execute(): TypesScResponse
}