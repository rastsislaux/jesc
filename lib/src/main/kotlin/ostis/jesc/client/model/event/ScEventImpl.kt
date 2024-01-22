package ostis.jesc.client.model.event

import ostis.jesc.client.model.addr.ScAddrImpl

data class ScEventImpl(
    override val id: Long,
    override val event: Boolean,
    override val status: Boolean,
    override val payload: List<ScAddrImpl>
) : ScEvent