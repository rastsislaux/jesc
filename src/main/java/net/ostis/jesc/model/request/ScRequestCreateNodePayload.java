package net.ostis.jesc.model.request;

import lombok.Getter;
import lombok.Setter;
import net.ostis.jesc.model.element.ElementType;
import net.ostis.jesc.model.element.ScType;

@Getter
@Setter
public class ScRequestCreateNodePayload extends ScRequestPayload {

    private ScType type;

    public ScRequestCreateNodePayload(ScType scType) {
        super(ElementType.NODE);
        this.type = scType;
    }

}
