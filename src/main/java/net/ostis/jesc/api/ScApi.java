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

public class ScApi {

    private final ScClient scClient;

    private Long idCounter = 0L;

    public ScApi(ScClient scClient) {
        this.scClient = scClient;
    }

    private Long makeId() {
        return ++idCounter;
    }

    public CreateElementsBuilder createElements() {
        return new CreateElementsBuilder();
    }

    public CheckElementsBuilder checkElements() {
        return new CheckElementsBuilder();
    }

    public DeleteElementsBuilder deleteElements() {
        return new DeleteElementsBuilder();
    }

    public KeynodesBuilder keynodes() {
        return new KeynodesBuilder();
    }

    public SearchByTemplateBuilder searchByTemplate() {
        return new SearchByTemplateBuilder();
    }

    public class CreateElementsBuilder {

        private final List<CreateElementsPayloadEntry> entries = new ArrayList<>();

        private CreateElementsBuilder() { }

        public CreateElementsBuilder node(ScType nodeType) {
            this.entries.add(CreateElementsPayloadEntry.node(nodeType));
            return this;
        }

        public CreateElementsBuilder edge(ScType edgeType, ScReference source, ScReference target) {
            this.entries.add(CreateElementsPayloadEntry.edge(edgeType, source, target));
            return this;
        }

        public CreateElementsBuilder link(ScType linkType, Object content, ScContentType contentType) {
            this.entries.add(CreateElementsPayloadEntry.link(linkType, content, contentType));
            return this;
        }

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
