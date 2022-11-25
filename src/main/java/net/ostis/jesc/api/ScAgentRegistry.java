package net.ostis.jesc.api;

import lombok.RequiredArgsConstructor;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.response.ScEvent;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ScAgentRegistry {

    private final ScClient scClient;

    public void registerAgent(Long eventId, Consumer<ScEvent> handler) {
        scClient.addEventHandler(event -> {
            if (!event.getId().equals(eventId)) {
                return;
            }

            handler.accept(event);
        });
    }

}
