package net.ostis.jesc.client.model.response;

import lombok.Data;
import net.ostis.jesc.client.model.response.payload.ScResponsePayload;

import java.util.List;

@Data
public class ScResponse<T extends ScResponsePayload> {

    private Long id;

    private Boolean status;

    private Boolean event;

    private T payload;

    private List<String> errors;

}
