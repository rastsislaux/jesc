package net.ostis.jesc.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.SneakyThrows;
import net.ostis.jesc.client.model.response.ScEvent;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Consumer;

public class ScMachineWebSocketClient extends WebSocketClient {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private SynchronousQueue<String> messages = new SynchronousQueue<>();

    public List<Consumer<ScEvent>> eventHandlers = new ArrayList<>();

    @SneakyThrows
    public String getMessage() {
        return messages.take();
    }

    @Builder
    public ScMachineWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake handshakeData) {

    }

    @Override
    @SneakyThrows
    public void onMessage(String message) {
        if (message.contains("\"events\": true")) {
            eventHandlers.forEach(handler -> {
                        try { handler.accept(objectMapper.readValue(message, ScEvent.class));
                        } catch (JsonProcessingException e) { throw new RuntimeException(e); }
            });
            return;
        }

        messages.put(message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {

    }

    @Override
    public void onError(Exception ex) {

    }
}
