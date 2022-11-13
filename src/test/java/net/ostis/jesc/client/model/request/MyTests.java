package net.ostis.jesc.client.model.request;

import net.ostis.jesc.api.ScContext;
import net.ostis.jesc.api.ScContextCommon;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.element.ScType;
import net.ostis.jesc.client.model.request.payload.PayloadList;
import net.ostis.jesc.client.model.request.payload.entry.SearchByTemplatePayloadEntry;
import net.ostis.jesc.client.model.response.ScSearchByTemplateResponse;
import org.junit.jupiter.api.Test;

class MyTests {

    @Test
    void isomorphicSubgraphSearchAgent() {
        ScClient scClient = new ScClient("localhost", 8090);
        ScContext context = new ScContextCommon(scClient);

        var imsAddr = context.findBySystemIdentifier("knowledge_base_IMS").get();

        var req = new ScRequest<>(
                99L,
                ScRequestType.SEARCH_BY_TEMPLATE,
                PayloadList.of(
                        SearchByTemplatePayloadEntry.of(
                                ScReference.addr(imsAddr),
                                ScReference.type(ScType.DEDGE_COMMON),
                                ScReference.type(ScType.LINK)
                        )
                )
        );

        scClient.sendRequest(req, ScSearchByTemplateResponse.class);
    }

}
