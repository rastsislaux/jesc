package ostis.jesc.client.model.response.payload

import ostis.jesc.client.model.addr.ScAddrImpl

class SearchByTemplateScResponsePayload(
    val addrs: List<List<ScAddrImpl>>,
    val aliases: Map<String, Long>
): ScResponsePayload