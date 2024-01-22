package ostis.jesc.client.model.addr

import ostis.jesc.client.model.request.payload.entry.ScRequestPayloadEntry

interface ScAddr: ScRequestPayloadEntry {
    val raw: Long

    companion object {
        fun raw(value: Long): ScAddr = ScAddrImpl(value)
    }
}