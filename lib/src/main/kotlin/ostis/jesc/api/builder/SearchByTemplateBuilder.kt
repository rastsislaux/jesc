package ostis.jesc.api.builder

import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.response.SearchByTemplateScResponse

interface SearchByTemplateBuilder {
    fun triplet(ref1: ScRef, ref2: ScRef, ref3: ScRef): SearchByTemplateBuilder
    fun execute(): SearchByTemplateScResponse
}