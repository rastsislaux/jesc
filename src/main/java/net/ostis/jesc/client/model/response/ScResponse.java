package net.ostis.jesc.client.model.response;

import lombok.Data;
import net.ostis.jesc.client.model.response.payload.entry.ScReponsePayloadEntry;

import java.util.List;

@Data
public class ScResponse<T extends ScReponsePayloadEntry> {

    private Long id;

    private Boolean status;

    private Boolean event;

    private List<T> payload;

    private List<String> errors;

}
