package net.ostis.jesc.client.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.ostis.jesc.client.model.response.payload.ResponsePayloadList;
import net.ostis.jesc.client.model.response.payload.entry.AddrListPayloadEntry;

@Data
@EqualsAndHashCode(callSuper = true)
public class ScResponseAddrLists extends ScResponse<ResponsePayloadList<AddrListPayloadEntry>> {
}
