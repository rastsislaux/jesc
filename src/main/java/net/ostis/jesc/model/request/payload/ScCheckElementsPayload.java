package net.ostis.jesc.model.request.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@Getter
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScCheckElementsPayload implements ScRequestPayload {

    @JsonValue
    private final Long scAddr;

    public static ScCheckElementsPayload scAddr(Long scAddr) {
        return new ScCheckElementsPayload(scAddr);
    }

}
