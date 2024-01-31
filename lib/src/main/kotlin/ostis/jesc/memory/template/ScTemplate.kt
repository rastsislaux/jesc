package ostis.jesc.memory.template

import java.util.*

interface ScTemplate {
    val triplets: List<ScTemplateTriplet>

    fun triplet(arg1: Any, arg2: Any, arg3: Any): ScTemplate

    companion object {
        fun triplet(arg1: Any, arg2: Any, arg3: Any): ScTemplate = ScTemplateImpl().triplet(arg1, arg2, arg3)
    }
}

class ScTemplateImpl: ScTemplate {

    private val tripletsInternal: MutableList<ScTemplateTriplet> = mutableListOf()

    override val triplets: List<ScTemplateTriplet>
        get() = Collections.unmodifiableList(tripletsInternal)

    override fun triplet(arg1: Any, arg2: Any, arg3: Any): ScTemplate {
        tripletsInternal.add(ScTemplateTripletImpl(arg1, arg2, arg3))
        return this
    }

}
