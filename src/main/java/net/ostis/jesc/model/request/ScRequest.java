package net.ostis.jesc.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ScRequest {

    private Long id;

    private ScRequestType type;

    private List<ScRequestPayload> payload;

}
