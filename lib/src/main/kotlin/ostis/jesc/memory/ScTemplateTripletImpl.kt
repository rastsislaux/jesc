package ostis.jesc.memory

import ostis.jesc.api.builder.SearchByTemplateBuilder
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.ScSpecificType
import java.util.stream.Stream
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

interface ScTemplateTriplet {
    fun apply(searchByTemplateBuilder: SearchByTemplateBuilder)
}

class ScTemplateTripletImpl(
    arg1: Any,
    arg2: Any,
    arg3: Any,
): ScTemplateTriplet {

    private val refs: List<ScRef>

    init {
        refs = listOf(arg1, arg2, arg3).map { arg ->
            val converter = converters.firstOrNull { arg::class.isSubclassOf(it.sourceClass) }
                ?: throw IllegalArgumentException("${arg::class.qualifiedName} is not allowed as ScTemplateTriplet argument")
            return@map converter.convert(arg)
        }
    }

    override fun apply(searchByTemplateBuilder: SearchByTemplateBuilder) {
        searchByTemplateBuilder.triplet(refs[0], refs[1], refs[2])
    }

    interface Converter {
        val sourceClass: KClass<*>
        fun convert(arg: Any): ScRef
    }

    companion object {

        val converters = setOf(

            object: Converter {
                override val sourceClass = ScType::class
                override fun convert(arg: Any) = ScRef.type(arg as ScType)
            },

            object: Converter {
                override val sourceClass = ScSpecificType::class
                override fun convert(arg: Any) = ScRef.type((arg as ScSpecificType).type)
            },

            object: Converter {
                override val sourceClass = ScAddr::class
                override fun convert(arg: Any) = ScRef.addr(arg as ScAddr)
            },

            object: Converter {
                override val sourceClass = ScElement::class
                override fun convert(arg: Any) = ScRef.addr((arg as ScElement).addr)
            },

            object: Converter {
                override val sourceClass = String::class
                override fun convert(arg: Any) = ScRef.alias(arg as String)
            },

            object: Converter {
                override val sourceClass = Long::class
                override fun convert(arg: Any) = ScRef.ref(arg as Long)
            },

            object: Converter {
                override val sourceClass = Int::class
                override fun convert(arg: Any) = ScRef.ref((arg as Int).toLong())
            },

            object: Converter {
                override val sourceClass = ScRef::class
                override fun convert(arg: Any) = arg as ScRef
            }

        )

    }

}
