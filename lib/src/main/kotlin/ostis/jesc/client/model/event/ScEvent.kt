package ostis.jesc.client.model.event

import ostis.jesc.client.model.addr.ScAddr

interface ScEvent {
    val id: Long
    val event: Boolean
    val status: Boolean
    val payload: List<ScAddr>
}