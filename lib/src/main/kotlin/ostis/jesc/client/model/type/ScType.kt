package ostis.jesc.client.model.type

import com.fasterxml.jackson.annotation.JsonValue


enum class ScType(
    @JsonValue
    val raw: Int
) {
    EDGE_U_COMMON(RawScType.SC_TYPE_UEDGE_COMMON),
    EDGE_D_COMMON(RawScType.SC_TYPE_DEDGE_COMMON),
    EDGE_U_COMMON_CONST(RawScType.SC_TYPE_UEDGE_COMMON or RawScType.SC_TYPE_CONST),
    EDGE_D_COMMON_CONST(RawScType.SC_TYPE_DEDGE_COMMON or RawScType.SC_TYPE_CONST),
    EDGE_U_COMMON_VAR(RawScType.SC_TYPE_UEDGE_COMMON or RawScType.SC_TYPE_VAR),
    EDGE_D_COMMON_VAR(RawScType.SC_TYPE_DEDGE_COMMON or RawScType.SC_TYPE_VAR),
    EDGE_ACCESS(RawScType.SC_TYPE_EDGE_ACCESS),
    EDGE_ACCESS_CONST_POS_PERM(RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_PERM or RawScType.SC_TYPE_EDGE_POS),
    EDGE_ACCESS_CONST_NEG_PERM(RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_PERM or RawScType.SC_TYPE_EDGE_NEG),
    EDGE_ACCESS_CONST_FUZ_PERM(RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_PERM or RawScType.SC_TYPE_EDGE_FUZ),
    EDGE_ACCESS_CONST_POS_TEMP(RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_TEMP or RawScType.SC_TYPE_EDGE_POS),
    EDGE_ACCESS_CONST_NEG_TEMP(RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_TEMP or RawScType.SC_TYPE_EDGE_NEG),
    EDGE_ACCESS_CONST_FUZ_TEMP(RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_TEMP or RawScType.SC_TYPE_EDGE_FUZ),
    EDGE_ACCESS_VAR_POS_PERM(RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_PERM or RawScType.SC_TYPE_EDGE_POS),
    EDGE_ACCESS_VAR_NEG_PERM(RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_PERM or RawScType.SC_TYPE_EDGE_NEG),
    EDGE_ACCESS_VAR_FUZ_PERM(RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_PERM or RawScType.SC_TYPE_EDGE_FUZ),
    EDGE_ACCESS_VAR_POS_TEMP(RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_TEMP or RawScType.SC_TYPE_EDGE_POS),
    EDGE_ACCESS_VAR_NEG_TEMP(RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_TEMP or RawScType.SC_TYPE_EDGE_NEG),
    EDGE_ACCESS_VAR_FUZ_TEMP(RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_EDGE_ACCESS or RawScType.SC_TYPE_EDGE_TEMP or RawScType.SC_TYPE_EDGE_FUZ),
    CONST(RawScType.SC_TYPE_CONST),
    VAR(RawScType.SC_TYPE_VAR),
    NODE(RawScType.SC_TYPE_NODE),
    LINK(RawScType.SC_TYPE_LINK),
    NODE_CONST(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST),
    NODE_VAR(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR),
    LINK_CONST(RawScType.SC_TYPE_LINK or RawScType.SC_TYPE_CONST),
    LINK_VAR(RawScType.SC_TYPE_LINK or RawScType.SC_TYPE_VAR),
    NODE_STRUCT(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_NODE_STRUCT),
    NODE_TUPLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_NODE_TUPLE),
    NODE_ROLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_NODE_ROLE),
    NODE_NOROLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_NODE_NOROLE),
    NODE_CLASS(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_NODE_CLASS),
    NODE_ABSTRACT(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_NODE_ABSTRACT),
    NODE_MATERIAL(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_NODE_MATERIAL),
    NODE_CONST_STRUCT(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_NODE_STRUCT),
    NODE_CONST_TUPLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_NODE_TUPLE),
    NODE_CONST_ROLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_NODE_ROLE),
    NODE_CONST_NOROLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_NODE_NOROLE),
    NODE_CONST_CLASS(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_NODE_CLASS),
    NODE_CONST_ABSTRACT(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_NODE_ABSTRACT),
    NODE_CONST_MATERIAL(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_CONST or RawScType.SC_TYPE_NODE_MATERIAL),
    NODE_VAR_STRUCT(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_NODE_STRUCT),
    NODE_VAR_TUPLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_NODE_TUPLE),
    NODE_VAR_ROLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_NODE_ROLE),
    NODE_VAR_NOROLE(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_NODE_NOROLE),
    NODE_VAR_CLASS(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_NODE_CLASS),
    NODE_VAR_ABSTRACT(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_NODE_ABSTRACT),
    NODE_VAR_MATERIAL(RawScType.SC_TYPE_NODE or RawScType.SC_TYPE_VAR or RawScType.SC_TYPE_NODE_MATERIAL);

    val isNode = (this.raw and ScTypeBitmasks.SC_TYPE_NODE)      != 0
    val isEdge = (this.raw and ScTypeBitmasks.SC_TYPE_EDGE_MASK) != 0
    val isLink = (this.raw and ScTypeBitmasks.SC_TYPE_LINK)      != 0
}
