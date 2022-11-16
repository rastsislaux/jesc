package net.ostis.jesc.context;

import net.ostis.jesc.api.ScApi;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.element.ScType;
import net.ostis.jesc.client.model.response.ScResponse;
import net.ostis.jesc.context.exception.ScContextRuntimeException;
import net.ostis.jesc.context.iterator.Iterable3;

import java.util.Objects;
import java.util.Optional;

/**
 * ScContextCommon is basic implementation of ScContext included in JESC core package.
 */
public class ScContextCommon implements ScContext {

    private static final String FAILED_TO_CREATE_EDGE_MSG = "Failed to create an edge for unknown reason. Check SC server logs for more info";
    private static final String FAILED_TO_CREATE_NODE_MSG = "Failed to create an node for unknown reason. Check SC server logs for more info";
    private static final String FAILED_TO_CREATE_ELEMENT_MSG = "Failed to create an element for unknown reason. Check SC server logs for more info";

    private final ScApi scApi;

    private Long idCounter = 0L;

    /**
     * This constructor accepts an already created ScClient. Example:<br>
     * {@code
     * ScClient scClient = new ScClient("localhost", 8090);
     * ScApi scApi = new ScApi(scClient);
     * ScContext context = new ScApi(scClient); }
     * @param scApi scApi instance
     */
    public ScContextCommon(ScApi scApi) {
        this.scApi = scApi;
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
        var response = scApi.keynodes()
                .find(systemIdentifier)
                .execute();

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
        var response = scApi.keynodes()
                .resolve(systemIdentifier, type)
                .execute();

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
        var response = scApi.createElements()
                .node(type)
                .execute();

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
        var response = scApi.createElements()
                .edge(
                        type,
                        ScReference.addr(scAddrOut),
                        ScReference.addr(scAddrIn)
                )
                .execute();

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
        var response = scApi.searchByTemplate()
                .references(first, second, third)
                .execute();

        throwErrorsIfPresent(response);

        return new Iterable3(response.getPayload().getAddrs());
    }

}
