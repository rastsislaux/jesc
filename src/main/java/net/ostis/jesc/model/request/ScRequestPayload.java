package net.ostis.jesc.model.request;

import lombok.Getter;
import lombok.Setter;
import net.ostis.jesc.model.element.ElementType;

@Getter
@Setter
public abstract class ScRequestPayload {

    protected ElementType el;

    public ScRequestPayload(ElementType elementType) {
        this.el = elementType;
    }

}
