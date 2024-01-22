package ostis.jesc.api.builder

import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.client.model.response.AddrsScResponse
import ostis.jesc.client.model.type.ScType

interface CreateElementsBuilder {
    fun node(type: ScType): CreateElementsBuilder
    fun edge(type: ScType, source: ScRef, target: ScRef): CreateElementsBuilder
    fun link(type: ScType, content: Any, contentType: ScContentType): CreateElementsBuilder
    fun execute(): AddrsScResponse
}