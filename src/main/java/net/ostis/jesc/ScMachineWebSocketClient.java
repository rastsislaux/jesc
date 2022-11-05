package net.ostis.jesc;

import lombok.Builder;
import lombok.SneakyThrows;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.concurrent.SynchronousQueue;

public class ScMachineWebSocketClient extends WebSocketClient {

    private SynchronousQueue<String> messages = new SynchronousQueue<>();

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
        messages.put(message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {

    }

    @Override
    public void onError(Exception ex) {

    }
}
