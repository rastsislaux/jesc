package net.ostis.jesc.model.request;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

public record ScReference(
    RefType type,
    Long value
) {

    @RequiredArgsConstructor
    private enum RefType {
        ADDR("addr"),
        REF("ref"),
        ALIAS("alias");

        @JsonValue
        final String value;
    }

}
