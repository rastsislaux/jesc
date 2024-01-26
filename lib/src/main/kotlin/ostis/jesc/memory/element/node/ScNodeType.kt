package ostis.jesc.memory.element.node

import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.element.ScSpecificType

enum class ScNodeType(override val type: ScType): ScSpecificType {
    CONST(ScType.NODE_CONST),
    VAR(ScType.NODE_VAR),
    STRUCT(ScType.NODE_STRUCT),
    TUPLE(ScType.NODE_TUPLE),
    ROLE(ScType.NODE_ROLE),
    NOROLE(ScType.NODE_NOROLE),
    CLASS(ScType.NODE_CLASS),
    ABSTRACT(ScType.NODE_ABSTRACT),
    MATERIAL(ScType.NODE_MATERIAL),
    CONST_STRUCT(ScType.NODE_CONST_STRUCT),
    CONST_TUPLE(ScType.NODE_CONST_TUPLE),
    CONST_ROLE(ScType.NODE_CONST_ROLE),
    CONST_NOROLE(ScType.NODE_CONST_NOROLE),
    CONST_CLASS(ScType.NODE_CONST_CLASS),
    CONST_ABSTRACT(ScType.NODE_CONST_ABSTRACT),
    CONST_MATERIAL(ScType.NODE_CONST_MATERIAL),
    VAR_STRUCT(ScType.NODE_VAR_STRUCT),
    VAR_TUPLE(ScType.NODE_VAR_TUPLE),
    VAR_ROLE(ScType.NODE_VAR_ROLE),
    VAR_NOROLE(ScType.NODE_VAR_NOROLE),
    VAR_CLASS(ScType.NODE_VAR_CLASS),
    VAR_ABSTRACT(ScType.NODE_VAR_ABSTRACT),
    VAR_MATERIAL(ScType.NODE_VAR_MATERIAL)
}