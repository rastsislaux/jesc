package ostis.jesc.api.builder

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.client.model.response.ContentScResponse

interface ContentBuilder {
    fun get(addr: ScAddr): ContentBuilder
    fun set(addr: ScAddr, data: Any, type: ScContentType): ContentBuilder
    fun execute(): ContentScResponse
}
