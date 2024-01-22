package ostis.jesc.api.builder

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.request.ScRequestImpl
import ostis.jesc.client.model.request.ScRequestType
import ostis.jesc.client.model.request.payload.ListScRequestPayload
import ostis.jesc.client.model.request.payload.entry.KeynodesScRequestPayloadEntry
import ostis.jesc.client.model.response.AddrsScResponse
import ostis.jesc.client.model.type.ScType

class KeynodesBuilderImpl(private val api: ScApi) : KeynodesBuilder {

    private val entries: MutableList<KeynodesScRequestPayloadEntry> = mutableListOf()

    override fun find(idtf: String): KeynodesBuilder {
        entries.add(KeynodesScRequestPayloadEntry.find(idtf))
        return this
    }

    override fun resolve(idtf: String, type: ScType): KeynodesBuilder {
        entries.add(KeynodesScRequestPayloadEntry.resolve(idtf, type))
        return this
    }

    override fun execute(): AddrsScResponse {
        return api.client.sendRequest(ScRequestImpl(
            api.makeId(),
            ScRequestType.KEYNODES,
            ListScRequestPayload(entries)
        ), AddrsScResponse::class.java)
    }

}