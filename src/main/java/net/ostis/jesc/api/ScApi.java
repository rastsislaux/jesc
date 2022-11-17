package net.ostis.jesc.api;

import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.element.ScType;
import net.ostis.jesc.client.model.request.ScContentType;
import net.ostis.jesc.client.model.request.ScRequest;
import net.ostis.jesc.client.model.request.ScRequestType;
import net.ostis.jesc.client.model.request.payload.PayloadList;
import net.ostis.jesc.client.model.request.payload.entry.*;
import net.ostis.jesc.client.model.response.ScResponseAddrs;
import net.ostis.jesc.client.model.response.ScSearchByTemplateResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ScClient wrapper that provides a higher level of abstraction.
 */
public class ScApi {

    private final ScClient scClient;

    private Long idCounter = 0L;

    public ScApi(ScClient scClient) {
        this.scClient = scClient;
    }

    private Long makeId() {
        return ++idCounter;
    }

    /**
     * Example:
     * <pre>{@code
     * api.createElements()
     *     .node(ScType.NODE)
     *     .edge(ScType.DEDGE_COMMON, ScReference.addr(234L), ScReference.addr(32L))
     *     .link(ScType.LINK, "Content", ScContentType.STRING)
     *     .execute();
     * }</pre>
     *
     * @return create elements request builder
     */
    public CreateElementsBuilder createElements() {
        return new CreateElementsBuilder();
    }

    /**
     * Example:
     * <pre>{@code
     * api.checkElements()
     *     .scAddr(234L)
     *     .execute();
     * }</pre>
     * @return check elements request builder
     */
    public CheckElementsBuilder checkElements() {
        return new CheckElementsBuilder();
    }

    /**
     * Example:
     * <pre>{@code
     * api.deleteElements()
     *     .scAddr(4534L)
     *     .execute();
     * }</pre>
     * @return delete elements request builder
     */
    public DeleteElementsBuilder deleteElements() {
        return new DeleteElementsBuilder();
    }

    /**
     * Example:
     * <pre>{@code
     * api.keynodes()
     *     .find("nrel_inclusion")
     *     .resolve("some_node", ScType.NODE)
     *     .execute();
     * }</pre>
     * @return keynodes request builder
     */
    public KeynodesBuilder keynodes() {
        return new KeynodesBuilder();
    }

    /**
     * Example:
     * <pre>{@code
     * api.searchByTemplate()
     *     .references(ScReference.addr(3423L),
     *                 ScReference.type(ScType.DEDGE_COMMON),
     *                 ScReference.type(ScType.LINK))
     *     .execute();
     * }</pre>
     * @return search by template request builder
     */
    public SearchByTemplateBuilder searchByTemplate() {
        return new SearchByTemplateBuilder();
    }

    public class CreateElementsBuilder {

        private final List<CreateElementsPayloadEntry> entries = new ArrayList<>();

        private CreateElementsBuilder() { }

        /**
         * Create a node
         * @param nodeType sc type of node
         * @return create elements request builder
         */
        public CreateElementsBuilder node(ScType nodeType) {
            this.entries.add(CreateElementsPayloadEntry.node(nodeType));
            return this;
        }

        /**
         * Create an edge
         * @param edgeType sc type of edge
         * @param source reference to source node
         * @param target reference to target node
         * @return create elements builder
         */
        public CreateElementsBuilder edge(ScType edgeType, ScReference source, ScReference target) {
            this.entries.add(CreateElementsPayloadEntry.edge(edgeType, source, target));
            return this;
        }

        /**
         * Create a link
         * @param linkType sc type of link
         * @param content content of any type
         * @param contentType sc content type
         * @return create elements builder
         */
        public CreateElementsBuilder link(ScType linkType, Object content, ScContentType contentType) {
            this.entries.add(CreateElementsPayloadEntry.link(linkType, content, contentType));
            return this;
        }

        /**
         * Execute create elements request
         * @return sc response containing list of sc addrs as payload
         */
        public ScResponseAddrs execute() {
            return scClient.sendRequest(new ScRequest<>(
                    makeId(), ScRequestType.CREATE_ELEMENTS,
                    PayloadList.of(entries.toArray(CreateElementsPayloadEntry[]::new))
            ), ScResponseAddrs.class);
        }

    }

    public class CheckElementsBuilder {

        private final List<CheckElementsPayloadEntry> entries = new ArrayList<>();

        private CheckElementsBuilder() { }

        /**
         * Check by sc address
         * @param scAddr sc address
         * @return check elements request builder
         */
        public CheckElementsBuilder scAddr(Long scAddr) {
            entries.add(CheckElementsPayloadEntry.scAddr(scAddr));
            return this;
        }

        public ScResponseAddrs execute() {
            return scClient.sendRequest(new ScRequest<>(
                    makeId(), ScRequestType.CHECK_ELEMENTS,
                    PayloadList.of(entries.toArray(CheckElementsPayloadEntry[]::new))
            ), ScResponseAddrs.class);
        }

    }

    public class DeleteElementsBuilder {

        private final List<DeleteElementsPayloadEntry> entries = new ArrayList<>();

        private DeleteElementsBuilder() { }

        public DeleteElementsBuilder scAddr(Long scAddr) {
            entries.add(DeleteElementsPayloadEntry.scAddr(scAddr));
            return this;
        }

        public boolean execute() {
            return scClient.sendRequest(new ScRequest<>(
                    makeId(), ScRequestType.DELETE_ELEMENTS,
                    PayloadList.of(entries.toArray(DeleteElementsPayloadEntry[]::new))
            ), Boolean.class);
        }

    }

    public class KeynodesBuilder {

        private final List<KeynodesPayloadEntry> entries = new ArrayList<>();

        private KeynodesBuilder() { }

        public KeynodesBuilder find(String idtf) {
            entries.add(KeynodesPayloadEntry.find(idtf));
            return this;
        }

        public KeynodesBuilder resolve(String idtf, ScType scType) {
            entries.add(KeynodesPayloadEntry.resolve(idtf, scType));
            return this;
        }

        public ScResponseAddrs execute() {
            return scClient.sendRequest(new ScRequest<>(
                    makeId(), ScRequestType.KEYNODES,
                    PayloadList.of(entries.toArray(KeynodesPayloadEntry[]::new))
            ), ScResponseAddrs.class);
        }

    }

    public class SearchByTemplateBuilder {

        private final List<SearchByTemplatePayloadEntry> entries = new ArrayList<>();

        private SearchByTemplateBuilder() { }

        public SearchByTemplateBuilder references(ScReference... scReferences) {
            entries.add(SearchByTemplatePayloadEntry.of(scReferences));
            return this;
        }

        public SearchByTemplateBuilder references(Collection<ScReference> scReferences) {
            entries.add(SearchByTemplatePayloadEntry.of(scReferences.toArray(ScReference[]::new)));
            return this;
        }

        public ScSearchByTemplateResponse execute() {
            return scClient.sendRequest(new ScRequest<>(
                    makeId(), ScRequestType.SEARCH_BY_TEMPLATE,
                    PayloadList.of(entries.toArray(SearchByTemplatePayloadEntry[]::new))
            ), ScSearchByTemplateResponse.class);
        }

    }

}
