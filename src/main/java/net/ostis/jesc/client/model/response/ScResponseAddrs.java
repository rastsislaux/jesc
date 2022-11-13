package net.ostis.jesc.client.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.ostis.jesc.client.model.response.payload.entry.AddrPayloadEntry;

@Data
@EqualsAndHashCode(callSuper = true)
public class ScResponseAddrs extends ScResponse<AddrPayloadEntry> {
}
