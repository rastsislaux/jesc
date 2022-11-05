package net.ostis.jesc.model.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import net.ostis.jesc.ScClient;
import net.ostis.jesc.model.element.ScType;
import net.ostis.jesc.model.request.payload.ScCreateElementsPayload;
import org.junit.jupiter.api.Test;

import java.util.List;

class MyTests {

    @Test
    void test() throws JsonProcessingException {
        var scRequest = new ScRequest<>(1L, ScCommand.CREATE_ELEMENTS, List.of(
                ScCreateElementsPayload.node(ScType.NODE),
                ScCreateElementsPayload.node(ScType.NODE_ABSTRACT),
                ScCreateElementsPayload.node(ScType.NODE_CLASS)
        ));

        ScClient scClient = new ScClient("localhost", 8090);

        scClient.sendRequest(scRequest);
        scClient.close();
    }

}
