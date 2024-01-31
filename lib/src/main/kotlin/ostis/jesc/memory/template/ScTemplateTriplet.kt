package ostis.jesc.memory.template

import ostis.jesc.api.builder.SearchByTemplateBuilder

interface ScTemplateTriplet {
    fun apply(searchByTemplateBuilder: SearchByTemplateBuilder)
}