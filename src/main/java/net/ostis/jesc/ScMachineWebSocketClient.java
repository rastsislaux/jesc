package net.ostis.jesc;

import lombok.Builder;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public class ScMachineWebSocketClient extends WebSocketClient {

    @Builder
    public ScMachineWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake handshakeData) {

    }

    @Override
    public void onMessage(String message) {

    }

    @Override
    public void onClose(int code, String reason, boolean remote) {

    }

    @Override
    public void onError(Exception ex) {

    }
}
