package ostis.jesc.memory.element.node

import ostis.jesc.memory.element.ScElement

interface ScNode: ScElement {
    var systemIdentifier: String

    fun getMainIdentifier(langIdtf: String): String?
    fun setMainIdentifier(idtf: String, langIdtf: String)
}