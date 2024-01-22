package ostis.jesc.client.model.request.payload.entry

import ostis.jesc.client.model.ref.ScRef

class SearchByTemplateScRequestPayloadEntry(
    list: List<ScRef>
): ArrayList<ScRef>(list), ScRequestPayloadEntry {

    companion object {

        fun of(vararg refs: ScRef) = SearchByTemplateScRequestPayloadEntry(refs.toList())

    }

}