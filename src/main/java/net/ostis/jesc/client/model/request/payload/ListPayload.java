package net.ostis.jesc.client.model.request.payload;

import net.ostis.jesc.client.model.request.payload.entry.ScRequestPayloadEntry;

import java.util.ArrayList;
import java.util.List;

public class PayloadList extends ArrayList<ScRequestPayloadEntry> implements ScPayload {

    private PayloadList(List<ScRequestPayloadEntry> list) {
        super(list);
    }

    public static PayloadList of(ScRequestPayloadEntry... entries) {
        return new PayloadList(List.of(entries));
    }

}
