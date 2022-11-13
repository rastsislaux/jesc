package net.ostis.jesc.client.model.element;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ScType {

    NODE(0x1),
    LINK(0x2),
    UEDGE_COMMON(0x4),
    DEDGE_COMMON(0x8),
    EDGE_ACCESS(0x10),
    CONST(0x20),
    VAR(0x40),
    EDGE_POS(0x80),
    EDGE_NEG(0x100),
    EDGE_FUZ(0x200),
    EDGE_TEMP(0x400),
    EDGE_PERM(0x800),
    NODE_TUPLE(0x80),
    NODE_STRUCT(0x100),
    NODE_ROLE(0x200),
    NODE_NOROLE(0x400),
    NODE_CLASS(0x800),
    NODE_ABSTRACT(0x1000),
    NODE_MATERIAL(0x2000);

    @JsonValue
    public final int numeric;

}
