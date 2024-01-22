package ostis.jesc.api.builder

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.request.ScRequestImpl
import ostis.jesc.client.model.request.ScRequestType
import ostis.jesc.client.model.request.payload.ListScRequestPayload
import ostis.jesc.client.model.response.DeleteElementsScResponse

class DeleteElementsBuilderImpl(private val api: ScApi) : DeleteElementsBuilder {

    private val entries: MutableList<ScAddr> = mutableListOf()

    override fun addr(addr: ScAddr): DeleteElementsBuilder {
        entries.add(addr)
        return this
    }

    override fun execute(): DeleteElementsScResponse {
        return api.client.sendRequest(ScRequestImpl(
            api.makeId(), ScRequestType.DELETE_ELEMENTS,
            ListScRequestPayload(entries)
        ), DeleteElementsScResponse::class.java)
    }

}