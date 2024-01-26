package ostis.jesc.client.model.type

object ScTypeBitmasks {
    const val SC_TYPE_NODE = 0x1
    const val SC_TYPE_LINK = 0x2
    const val SC_TYPE_UEDGE_COMMON = 0x4
    const val SC_TYPE_DEDGE_COMMON = 0x8
    const val SC_TYPE_EDGE_ACCESS = 0x10
    const val SC_TYPE_CONST = 0x20
    const val SC_TYPE_VAR = 0x40
    const val SC_TYPE_EDGE_POS = 0x80
    const val SC_TYPE_EDGE_NEG = 0x100
    const val SC_TYPE_EDGE_FUZ = 0x200
    const val SC_TYPE_EDGE_TEMP = 0x400
    const val SC_TYPE_EDGE_PERM = 0x800
    const val SC_TYPE_NODE_TUPLE = 0x80
    const val SC_TYPE_NODE_STRUCT = 0x100
    const val SC_TYPE_NODE_ROLE = 0x200
    const val SC_TYPE_NODE_NOROLE = 0x400
    const val SC_TYPE_NODE_CLASS = 0x800
    const val SC_TYPE_NODE_ABSTRACT = 0x1000
    const val SC_TYPE_NODE_MATERIAL = 0x2000
    const val SC_TYPE_EDGE_MASK = SC_TYPE_EDGE_ACCESS or SC_TYPE_DEDGE_COMMON or SC_TYPE_UEDGE_COMMON
}