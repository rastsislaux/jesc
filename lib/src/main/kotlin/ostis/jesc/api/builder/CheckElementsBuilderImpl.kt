package ostis.jesc.api.builder

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.request.ScRequestImpl
import ostis.jesc.client.model.request.ScRequestType
import ostis.jesc.client.model.request.payload.ListScRequestPayload
import ostis.jesc.client.model.response.TypesScResponse

class CheckElementsBuilderImpl(private val api: ScApi) : CheckElementsBuilder {

    private val entries: MutableList<ScAddr> = mutableListOf()

    override fun addr(addr: ScAddr): CheckElementsBuilder {
        entries.add(addr)
        return this
    }

    override fun execute(): TypesScResponse {
        return api.client.sendRequest(ScRequestImpl(
            api.makeId(), ScRequestType.CHECK_ELEMENTS,
            ListScRequestPayload(entries)
        ), TypesScResponse::class.java)
    }
}