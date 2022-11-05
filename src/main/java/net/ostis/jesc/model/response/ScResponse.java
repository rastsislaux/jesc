package net.ostis.jesc.model.response;

import lombok.Data;

import java.util.List;

@Data
public class ScResponse {

    private Long id;

    private Boolean status;

    private Boolean event;

    private List<ScResponsePayload> payload;

    private List<String> errors;

}
