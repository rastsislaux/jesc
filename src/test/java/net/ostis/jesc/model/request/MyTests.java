package net.ostis.jesc.model.request;

import net.ostis.jesc.ScClient;
import net.ostis.jesc.model.element.ScType;
import net.ostis.jesc.model.request.payload.ScCreateElementsPayload;
import org.junit.jupiter.api.Test;

import java.util.List;

class MyTests {

    @Test
    void test() {
        var scRequest = new ScRequest<>(1L, ScCommand.CREATE_ELEMENTS, List.of(
                ScCreateElementsPayload.node(ScType.NODE),
                ScCreateElementsPayload.node(ScType.NODE_ABSTRACT),
                ScCreateElementsPayload.node(ScType.NODE_CLASS)
        ));

        ScClient scClient = new ScClient("localhost", 8090);
        var msg = scClient.sendRequest(scRequest);
        System.out.println(msg);
        scClient.close();
    }

    @Test
    void test2() {
        ScClient scClient = new ScClient("localhost", 8090);
        var response = scClient.sendRequest(
                new ScRequest<>(2L, ScCommand.CREATE_ELEMENTS, List.of(
                        ScCreateElementsPayload.node(ScType.NODE_TUPLE),
                        ScCreateElementsPayload.node(ScType.NODE_CLASS)
                ))
        );
        System.out.println(response);
        scClient.close();
    }

}
