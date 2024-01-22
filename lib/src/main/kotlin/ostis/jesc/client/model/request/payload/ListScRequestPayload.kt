package ostis.jesc.client.model.request.payload

import ostis.jesc.client.model.request.payload.entry.ScRequestPayloadEntry

class ListScRequestPayload(
    list: List<ScRequestPayloadEntry>
): ArrayList<ScRequestPayloadEntry>(list), ScRequestPayload {

    companion object {

        fun of(vararg entries: ScRequestPayloadEntry) = ListScRequestPayload(entries.toList())

    }

}