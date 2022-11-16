package net.ostis.jesc.client.model.request;

import net.ostis.jesc.api.ScApi;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.element.ScType;
import net.ostis.jesc.context.ScContextCommon;
import org.junit.jupiter.api.Test;

class MyTests {

    @Test
    void isomorphicSubgraphSearchAgent() {

        try (ScClient client = new ScClient("localhost", 8090)) {
            var api = new ScApi(client);
            var context = new ScContextCommon(api);

            var iterator = context.iterator3(
                    ScReference.addr(1342L),
                    ScReference.type(ScType.DEDGE_COMMON),
                    ScReference.type(ScType.LINK)
            );

            iterator.forEach(System.out::println);
        }

    }

}
