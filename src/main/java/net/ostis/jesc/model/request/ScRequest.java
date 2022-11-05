package net.ostis.jesc.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.ostis.jesc.model.request.payload.ScRequestPayload;

import java.util.List;

@Data
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScRequest<T extends ScRequestPayload> {

    private Long id;

    private ScCommand type;

    private List<T> payload;

}
