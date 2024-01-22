package ostis.jesc.api.builder

import ostis.jesc.client.model.response.AddrsScResponse
import ostis.jesc.client.model.type.ScType

interface KeynodesBuilder {
    fun find(idtf: String): KeynodesBuilder
    fun resolve(idtf: String, type: ScType): KeynodesBuilder
    fun execute(): AddrsScResponse
}