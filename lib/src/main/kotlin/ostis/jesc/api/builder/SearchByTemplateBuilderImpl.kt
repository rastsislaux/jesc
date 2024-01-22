package ostis.jesc.api.builder

import ostis.jesc.api.ScApiImpl
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.request.ScRequestImpl
import ostis.jesc.client.model.request.ScRequestType
import ostis.jesc.client.model.request.payload.ListScRequestPayload
import ostis.jesc.client.model.request.payload.entry.SearchByTemplateScRequestPayloadEntry
import ostis.jesc.client.model.response.SearchByTemplateScResponse

class SearchByTemplateBuilderImpl(private val api: ScApiImpl): SearchByTemplateBuilder {

    private val entries: MutableList<SearchByTemplateScRequestPayloadEntry> = mutableListOf()

    override fun triplet(ref1: ScRef, ref2: ScRef, ref3: ScRef): SearchByTemplateBuilderImpl {
        entries.add(SearchByTemplateScRequestPayloadEntry(listOf(ref1, ref2, ref3)))
        return this
    }

    override fun execute(): SearchByTemplateScResponse {
        return api.client.sendRequest(
            ScRequestImpl(
            api.makeId(), ScRequestType.SEARCH_BY_TEMPLATE,
            ListScRequestPayload(entries)
        ), SearchByTemplateScResponse::class.java)
    }

}