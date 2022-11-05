package net.ostis.jesc.model.request;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ScCommand {

    CREATE_ELEMENTS("create_elements"),
    CHECK_ELEMENTS("check_elements"),
    DELETE_ELEMENTS("delete_elements"),
    SEARCH_BY_TEMPLATE("search_template"),
    GENERATE_BY_TEMPLATE("generate_template");

    @JsonValue
    final String value;

}
