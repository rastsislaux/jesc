package ostis.jesc.api.builder

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.request.ScRequestImpl
import ostis.jesc.client.model.request.ScRequestType
import ostis.jesc.client.model.request.payload.ListScRequestPayload
import ostis.jesc.client.model.request.payload.entry.CreateElementsScRequestPayloadEntry
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.client.model.response.AddrsScResponse
import ostis.jesc.client.model.type.ScType

class CreateElementsBuilderImpl(private val api: ScApi) : CreateElementsBuilder {

    private val entries: MutableList<CreateElementsScRequestPayloadEntry> = mutableListOf()

    override fun node(type: ScType): CreateElementsBuilder {
        entries.add(CreateElementsScRequestPayloadEntry.node(type))
        return this
    }

    override fun edge(type: ScType, source: ScRef, target: ScRef): CreateElementsBuilder {
        entries.add(CreateElementsScRequestPayloadEntry.edge(type, source, target))
        return this
    }

    override fun link(type: ScType, content: Any, contentType: ScContentType): CreateElementsBuilder {
        entries.add(CreateElementsScRequestPayloadEntry.link(type, content, contentType))
        return this
    }

    override fun execute(): AddrsScResponse {
        return api.client.sendRequest(ScRequestImpl(
            api.makeId(), ScRequestType.CREATE_ELEMENTS,
            ListScRequestPayload(entries)
        ), AddrsScResponse::class.java)
    }

}