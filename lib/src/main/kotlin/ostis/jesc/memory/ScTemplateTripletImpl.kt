package ostis.jesc.memory

import ostis.jesc.api.builder.SearchByTemplateBuilder
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.ScSpecificType
import java.util.stream.Stream
import kotlin.reflect.full.isSubclassOf

interface ScTemplateTriplet {
    fun apply(searchByTemplateBuilder: SearchByTemplateBuilder)
}

data class ScTemplateTripletImpl(
    val arg1: Any,
    val arg2: Any,
    val arg3: Any,
): ScTemplateTriplet {

    init {
        Stream.of(arg1, arg2, arg3).forEach { arg ->
            val isAllowed = allowedTypes.any { type -> arg::class.isSubclassOf(type) }
            if (!isAllowed) {
                throw IllegalArgumentException("${arg::class.qualifiedName} is not allowed as ScTemplateTriplet argument")
            }
        }
    }

    private fun convertToScRef(arg: Any) = when (arg) {
        is ScType -> ScRef.type(arg)
        is ScSpecificType -> ScRef.type(arg.type)
        is ScAddr -> ScRef.addr(arg)
        is ScElement -> ScRef.addr(arg.addr)
        is String -> ScRef.alias(arg)
        is Long -> ScRef.ref(arg)
        is Int -> ScRef.ref(arg.toLong())
        is ScRef -> arg
        else -> throw IllegalStateException("This should never happen: illegal arg type passed to ScTemplateTriplet")
    }

    override fun apply(searchByTemplateBuilder: SearchByTemplateBuilder) {
        val refs = listOf(arg1, arg2, arg3).map { convertToScRef(it) }
        searchByTemplateBuilder.triplet(refs[0], refs[1], refs[2])
    }

    companion object {

        val allowedTypes = setOf(
            // Types
            ScType::class,
            ScSpecificType::class,

            // Concrete elements
            ScAddr::class,
            ScElement::class,

            // Alias
            String::class,

            // Ref
            Long::class,
            Int::class,

            // ScRef
            ScRef::class,
        )

    }

}
