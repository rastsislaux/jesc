package ostis.jesc.api.builder

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.response.DeleteElementsScResponse

interface DeleteElementsBuilder {
    fun addr(addr: ScAddr): DeleteElementsBuilder
    fun execute(): DeleteElementsScResponse
}