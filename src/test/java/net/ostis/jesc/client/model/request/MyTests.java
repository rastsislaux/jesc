package net.ostis.jesc.client.model.request;

import net.ostis.jesc.api.ScApi;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.context.ScContext;
import net.ostis.jesc.context.ScContextCommon;
import org.junit.jupiter.api.Test;

class MyTests {

    @Test
    void isomorphicSubgraphSearchAgent() {
        ScClient scClient = new ScClient("localhost", 8090);
        ScApi scApi = new ScApi(scClient);
        ScContext context = new ScContextCommon(scApi);
    }

}
