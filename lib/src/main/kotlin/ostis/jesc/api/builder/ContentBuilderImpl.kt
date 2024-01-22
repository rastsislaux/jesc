package ostis.jesc.api.builder

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.request.ScRequestImpl
import ostis.jesc.client.model.request.ScRequestType
import ostis.jesc.client.model.request.payload.ListScRequestPayload
import ostis.jesc.client.model.request.payload.entry.ContentPayloadEntry
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.client.model.response.ContentScResponse

class ContentBuilderImpl(private val api: ScApi) : ContentBuilder {

    private val entries: MutableList<ContentPayloadEntry> = mutableListOf()

    override fun get(addr: ScAddr): ContentBuilder {
        entries.add(ContentPayloadEntry.get(addr))
        return this
    }

    override fun set(addr: ScAddr, data: Any, type: ScContentType): ContentBuilder {
        entries.add(ContentPayloadEntry.set(addr, data, type))
        return this
    }

    override fun execute(): ContentScResponse {
        return api.client.sendRequest(ScRequestImpl(
            api.makeId(), ScRequestType.CONTENT,
            ListScRequestPayload(entries)
        ), ContentScResponse::class.java)
    }

}