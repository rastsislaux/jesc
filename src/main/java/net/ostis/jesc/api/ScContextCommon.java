package net.ostis.jesc.api;

import net.ostis.jesc.api.exception.ScContextRuntimeException;
import net.ostis.jesc.api.iterator.Iterable3;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.element.ScType;
import net.ostis.jesc.client.model.request.ScRequest;
import net.ostis.jesc.client.model.request.ScRequestType;
import net.ostis.jesc.client.model.request.payload.PayloadList;
import net.ostis.jesc.client.model.request.payload.entry.CreateElementsPayloadEntry;
import net.ostis.jesc.client.model.request.payload.entry.KeynodesPayloadEntry;
import net.ostis.jesc.client.model.request.payload.entry.SearchByTemplatePayloadEntry;
import net.ostis.jesc.client.model.response.ScResponse;
import net.ostis.jesc.client.model.response.ScResponseAddrs;
import net.ostis.jesc.client.model.response.ScSearchByTemplateResponse;

import java.util.Objects;
import java.util.Optional;

/**
 * ScContextCommon is basic implementation of ScContext included in JESC core package.
 */
public class ScContextCommon implements ScContext {

    private static final String FAILED_TO_CREATE_EDGE_MSG = "Failed to create an edge for unknown reason. Check SC server logs for more info";
    private static final String FAILED_TO_CREATE_NODE_MSG = "Failed to create an node for unknown reason. Check SC server logs for more info";
    private static final String FAILED_TO_CREATE_ELEMENT_MSG = "Failed to create an element for unknown reason. Check SC server logs for more info";

    private final ScClient scClient;

    private Long idCounter = 0L;

    /**
     * This constructor accepts an already created ScClient. Example:<br>
     * {@code
     * ScClient scClient = new ScClient("localhost", 8090);
     * ScContext context = new ScContextCommon(scClient); }
     * @param scClient sc client instance
     */
    public ScContextCommon(ScClient scClient) {
        this.scClient = scClient;
    }

    /**
     * This constructor accepts host and port. Example:<br>
     * {@code ScContext context = new ScContextCommon("localhost", 8090);}
     *
     * @param host the host where SC server is running (e.g. localhost)
     * @param port the port that exposes SC server (usually 8090)
     */
    public ScContextCommon(String host, int port) {
        this.scClient = new ScClient(host, port);
    }

    /**
     * Generate a new ID for request
     * @return unique (for a session) request ID
     */
    protected Long makeId() {
        return ++idCounter;
    }

    /**
     * Check if there are any errors on SC server side and throws corresponding exceptions if needed.
     * @param response response from SC server
     */
    public void throwErrorsIfPresent(ScResponse<?> response) {
        if (Objects.nonNull(response.getErrors()) && !response.getErrors().isEmpty()) {
            var str = String.join(", ", response.getErrors());
            throw new ScContextRuntimeException(str);
        }
    }

    /**
     * Check if SC address is valid
     * @param scAddr SC address to check
     * @return true if valid, false otherwise
     */
    @Override
    public boolean isValid(Long scAddr) {
        return Objects.nonNull(scAddr) && !scAddr.equals(0L);
    }

    /**
     * Find SC element address by its system identifier
     * @param systemIdentifier system identifier of SC element
     * @return optional of SC address, empty optional if element not found
     */
    @Override
    public Optional<Long> findBySystemIdentifier(String systemIdentifier) {
        var request = new ScRequest<>(
                makeId(),
                ScRequestType.KEYNODES,
                PayloadList.of(
                        KeynodesPayloadEntry.find(systemIdentifier)
                )
        );

        var response = scClient.sendRequest(request, ScResponseAddrs.class);
        throwErrorsIfPresent(response);
        var scAddr = response.getPayload().get(0).getScAddr();

        if (!isValid(scAddr)) {
            return Optional.empty();
        }

        return Optional.of(scAddr);
    }

    /**
     * Resolve SC element address by its system identifier<br>
     * Creates a new element if not found
     *
     * @param systemIdentifier system identifier of SC element
     * @param type type of element to be created if not found
     * @return SC address
     */
    @Override
    public Long resolveBySystemIdentifier(String systemIdentifier, ScType type) {
        var request = new ScRequest<>(
                makeId(),
                ScRequestType.KEYNODES,
                PayloadList.of(
                        KeynodesPayloadEntry.resolve(systemIdentifier, type)
                )
        );

        var response = scClient.sendRequest(request, ScResponseAddrs.class);
        throwErrorsIfPresent(response);
        var scAddr = response.getPayload().get(0).getScAddr();

        if (!isValid(scAddr)) {
            throw new ScContextRuntimeException(FAILED_TO_CREATE_ELEMENT_MSG);
        }

        return scAddr;
    }

    /**
     * Create a node
     * @param type ScType of node
     * @return sc address of a newly created node
     * @throws ScContextRuntimeException when SC server returns invalid address
     */
    @Override
    public Long createNode(ScType type) {
        var request = new ScRequest<>(
                makeId(),
                ScRequestType.CREATE_ELEMENTS,
                PayloadList.of(
                        CreateElementsPayloadEntry.node(type)
                )
        );

        var response = scClient.sendRequest(request, ScResponseAddrs.class);
        throwErrorsIfPresent(response);
        var scAddr = response.getPayload().get(0).getScAddr();

        if (!isValid(scAddr)) {
            throw new ScContextRuntimeException(FAILED_TO_CREATE_NODE_MSG);
        }

        return scAddr;
    }

    /**
     * Create an edge
     * @param type ScType of an edge
     * @param scAddrOut SC address of the source element
     * @param scAddrIn SC address of the target element
     * @return SC address of newly created edge
     *
     * @throws ScContextRuntimeException when SC server returns invalid address
     */
    @Override
    public Long createEdge(ScType type, Long scAddrOut, Long scAddrIn) {
        var payload = CreateElementsPayloadEntry.edge(
                type,
                ScReference.addr(scAddrOut),
                ScReference.addr(scAddrIn)
        );
        var request = new ScRequest<>(
                makeId(),
                ScRequestType.CREATE_ELEMENTS,
                PayloadList.of(payload)
        );

        var response = scClient.sendRequest(request, ScResponseAddrs.class);
        throwErrorsIfPresent(response);
        var scAddr = response.getPayload().get(0).getScAddr();

        if (!isValid(scAddr)) {
            throw new ScContextRuntimeException(FAILED_TO_CREATE_EDGE_MSG);
        }

        return scAddr;
    }

    /**
     * Create an arc.
     * It's an alias to ScContextCommon::createEdge(), here just for concision with SC machine.
     *
     * @param type ScType of arc
     * @param scAddrOut SC address of the source element
     * @param scAddrIn SC address of the target element
     * @return SC address of newly created arc
     *
     * @throws ScContextRuntimeException when SC server returns invalid address
     */
    @Override
    public Long createArc(ScType type, Long scAddrOut, Long scAddrIn) {
        return createEdge(type, scAddrOut, scAddrIn); // That is literally how it's implemented in SC machine
    }

    /**
     * Iterate through triplets.
     * <pre>
     *  First     Third
     *  |          |
     *  V          V
     * () ======> ()
     *      Ʌ
     *      |
     *    Second
     * </pre>
     * @param first
     * @param second
     * @param third
     * @return
     */
    @Override
    public Iterable3 iterator3(ScReference first, ScReference second, ScReference third) {
        var req = new ScRequest<>(
                99L,
                ScRequestType.SEARCH_BY_TEMPLATE,
                PayloadList.of(SearchByTemplatePayloadEntry.of(first, second, third)));

        var response = scClient.sendRequest(req, ScSearchByTemplateResponse.class);
        throwErrorsIfPresent(response);

        return new Iterable3(response.getPayload().getAddrs());
    }

}
