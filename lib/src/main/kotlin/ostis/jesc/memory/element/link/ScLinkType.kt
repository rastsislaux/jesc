package ostis.jesc.memory.element.link

import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.element.ScSpecificType

enum class ScLinkType(override val type: ScType): ScSpecificType {
    LINK(ScType.LINK),
    CONST(ScType.LINK_CONST),
    VAR(ScType.LINK_VAR)
}