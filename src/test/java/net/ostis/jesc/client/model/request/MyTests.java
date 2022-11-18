package net.ostis.jesc.client.model.request;

import net.ostis.jesc.api.ScApi;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.element.ScEventType;
import net.ostis.jesc.context.ScContextCommon;
import org.junit.jupiter.api.Test;

class MyTests {

    @Test
    void isomorphicSubgraphSearchAgent() {

        try (ScClient client = new ScClient("localhost", 8090)) {
            var api = new ScApi(client);
            var context = new ScContextCommon(api);

            var ims = context.findBySystemIdentifier("knowledge_base_IMS").get();

            var response = api.events()
                    .create(ScEventType.ADD_OUTGOING_EDGE, ims)
                    .execute();

            System.out.println(response);
        }

    }

}
