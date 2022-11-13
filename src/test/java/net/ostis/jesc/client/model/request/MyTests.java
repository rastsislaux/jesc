package net.ostis.jesc.client.model.request;

import net.ostis.jesc.api.ScContext;
import net.ostis.jesc.api.ScContextCommon;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.element.ScType;
import org.junit.jupiter.api.Test;

class MyTests {

    @Test
    void isomorphicSubgraphSearchAgent() {
        ScClient scClient = new ScClient("localhost", 8090);
        ScContext context = new ScContextCommon(scClient);

        var imsAddr = context.findBySystemIdentifier("knowledge_base_IMS").get();

        var it = context.iterator3(
                ScReference.addr(imsAddr),
                ScReference.type(ScType.DEDGE_COMMON),
                ScReference.type(ScType.LINK)
        );

        for (var t : it) {
            System.out.println(t);
        }

    }

}
