package net.ostis.jesc.client.model.request;

import net.ostis.jesc.api.ScContext;
import net.ostis.jesc.api.ScContextCommon;
import net.ostis.jesc.client.ScClient;
import org.junit.jupiter.api.Test;

class MyTests {

    @Test
    void isomorphicSubgraphSearchAgent() {
        ScClient scClient = new ScClient("localhost", 8090);
        ScContext context = new ScContextCommon(scClient);

        context.searchByScsTemplate("person _-> .._p (* _=> nrel_email:: _[] *);;");
    }

}
