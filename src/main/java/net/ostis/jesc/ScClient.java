package net.ostis.jesc;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import net.ostis.jesc.model.request.ScRequest;
import org.java_websocket.client.WebSocketClient;

import java.net.URI;

public class ScClient implements AutoCloseable {

    private WebSocketClient wsc;

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
    public String sendRequest(ScRequest scRequest) {
        wsc.send(objectMapper.writeValueAsString(scRequest));
        return "nothing here yet";
    }

    @Override
    @SneakyThrows
    public void close() {
        wsc.close();
    }
}
