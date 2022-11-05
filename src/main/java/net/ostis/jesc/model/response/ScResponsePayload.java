package net.ostis.jesc.model.response;

import com.fasterxml.jackson.annotation.JsonValue;

public class ScResponsePayload  {

    @JsonValue
    Long value;

    public ScResponsePayload(Long value) {
        this.value = value;
    }

}
