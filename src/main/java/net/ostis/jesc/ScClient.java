package net.ostis.jesc;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import net.ostis.jesc.model.request.ScRequest;
import net.ostis.jesc.model.response.ScResponse;

import java.net.URI;

public class ScClient implements AutoCloseable {

    private ScMachineWebSocketClient wsc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    public ScClient(String host, int port) {
        var wsUrl = String.format("ws://%s:%d/ws_json", host, port);
        wsc = new ScMachineWebSocketClient(
                new URI(wsUrl)
        );
        wsc.connectBlocking();
    }

    @SneakyThrows
    public ScResponse sendRequest(ScRequest scRequest) {
        wsc.send(objectMapper.writeValueAsString(scRequest));
        return objectMapper.readValue(wsc.getMessage(), ScResponse.class);
    }

    @Override
    @SneakyThrows
    public void close() {
        wsc.close();
    }
}
