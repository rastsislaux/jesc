package net.ostis.jesc.model.request.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import net.ostis.jesc.model.element.ElementType;
import net.ostis.jesc.model.element.ScType;
import net.ostis.jesc.model.request.ScContentType;
import net.ostis.jesc.model.request.ScReference;

@Getter
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScCreateElementsPayload implements ScRequestPayload {

    private ElementType el;

    private ScType type;

    private ScReference src;

    private ScReference trg
            ;
    private Object content;

    private ScContentType contentType;

    public static ScCreateElementsPayload node(ScType nodeType) {
        return ScCreateElementsPayload.builder()
                .el(ElementType.NODE)
                .type(nodeType)
                .build();
    }

    public static ScCreateElementsPayload edge(ScType edgeType, ScReference source, ScReference target) {
        return ScCreateElementsPayload.builder()
                .el(ElementType.EDGE)
                .src(source)
                .trg(target)
                .type(edgeType)
                .build();
    }

    public static ScCreateElementsPayload link(ScType linkType, Object content, ScContentType contentType) {
        return ScCreateElementsPayload.builder()
                .el(ElementType.LINK)
                .type(linkType)
                .content(content)
                .contentType(contentType)
                .build();
    }

}
