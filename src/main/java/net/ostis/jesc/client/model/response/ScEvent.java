package net.ostis.jesc.client.model.response;

import lombok.Value;

import java.util.List;

@Value
public class ScEvent {

    Long id;

    Boolean event;

    List<Long> payload;

}
