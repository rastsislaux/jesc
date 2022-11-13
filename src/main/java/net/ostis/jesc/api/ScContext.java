package net.ostis.jesc.api;

import net.ostis.jesc.api.iterator.Iterable3;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.element.ScType;

import java.util.Optional;

public interface ScContext {

    /**
     * Check if SC address is valid
     * @param scAddr SC address to check
     * @return true if valid, false otherwise
     */
    boolean isValid(Long scAddr);

    /**
     * Find SC element address by its system identifier
     * @param systemIdentifier system identifier of SC element
     * @return optional of SC address, empty optional if element not found
     */
    Optional<Long> findBySystemIdentifier(String systemIdentifier);

    /**
     * Resolve SC element address by its system identifier<br>
     * Creates a new element if not found
     *
     * @param systemIdentifier system identifier of SC element
     * @param type type of element to be created if not found
     * @return SC address
     */
    Long resolveBySystemIdentifier(String systemIdentifier, ScType type);

    /**
     * Create a node
     * @param type ScType of node
     * @return sc address of a newly created node
     */
    Long createNode(ScType type);

    /**
     * Create an edge
     * @param type ScType of an edge
     * @param scAddrOut SC address of the source element
     * @param scAddrIn SC address of the target element
     * @return SC address of newly created edge
     */
    Long createEdge(ScType type, Long scAddrOut, Long scAddrIn);

    /**
     * Create an arc.
     * It's an alias to ScContextCommon::createEdge(), here just for concision with SC machine.
     *
     * @param type ScType of arc
     * @param scAddrOut SC address of the source element
     * @param scAddrIn SC address of the target element
     * @return SC address of newly created arc
     */
    Long createArc(ScType type, Long scAddrOut, Long scAddrIn);

    Iterable3 iterator3(ScReference first, ScReference second, ScReference third);
}
