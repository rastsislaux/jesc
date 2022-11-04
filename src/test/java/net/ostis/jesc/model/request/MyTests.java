package net.ostis.jesc.model.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import net.ostis.jesc.ScMachine;
import net.ostis.jesc.model.element.ScType;
import org.junit.jupiter.api.Test;

import java.util.List;

class MyTests {

    @Test
    void test() throws JsonProcessingException {
        ScRequest scRequest = new ScRequest(1L, ScRequestType.CREATE_ELEMENTS, List.of(
                new ScRequestCreateNodePayload(ScType.NODE),
                new ScRequestCreateNodePayload(ScType.NODE_CLASS),
                new ScRequestCreateNodePayload(ScType.NODE_ABSTRACT)
        ));

        ScMachine scMachine = new ScMachine("localhost", 8090);
        scMachine.sendRequest(scRequest);
        scMachine.close();
    }

}
