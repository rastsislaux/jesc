package net.ostis.jesc.client.model.request;

import lombok.extern.slf4j.Slf4j;
import net.ostis.jesc.api.ScAgentRegistry;
import net.ostis.jesc.api.ScApi;
import net.ostis.jesc.client.ScClient;
import net.ostis.jesc.client.model.element.ScEventType;
import net.ostis.jesc.client.model.element.ScReference;
import net.ostis.jesc.client.model.type.ScType;
import net.ostis.jesc.context.ScContext;
import net.ostis.jesc.context.ScContextCommon;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

@Slf4j
class TestAgent {

    Set<Long> getQuestionGraphs(ScContext context, Long problemNode) {
        var graphs = new HashSet<Long>();
        context.iterator3(
                ScReference.addr(problemNode),
                ScReference.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScReference.type(ScType.NODE_VAR)
        ).forEach(t -> graphs.add(t.getThird()));
        return graphs;
    }

    Set<Long> getPatternEdges(ScContext context, Long relPattern) {
        var patterns = new HashSet<Long>();
        context.iterator3(
                ScReference.addr(relPattern),
                ScReference.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScReference.type(ScType.EDGE_ACCESS_VAR_POS_PERM)
        ).forEach(t -> patterns.add(t.getThird()));
        return patterns;
    }

    Set<Long> getTargetEdges(ScContext context, Long relTarget) {
        var targets = new HashSet<Long>();
        context.iterator3(
                ScReference.addr(relTarget),
                ScReference.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScReference.type(ScType.EDGE_ACCESS_VAR_POS_PERM)
        ).forEach(t -> targets.add(t.getThird()));
        return targets;
    }

    @Test
    void tipa_main() {
        try (var client = new ScClient("localhost", 8090)) {
            var api = new ScApi(client);
            var agentRegistry = new ScAgentRegistry(client);
            var context = new ScContextCommon(api);

            var ims = context.findBySystemIdentifier("knowledge_base_IMS").get();
            var questionNode = context.resolveBySystemIdentifier("question_find_isomorphic_subgraphs1", ScType.NODE);
            var relTarget = context.resolveBySystemIdentifier("qfis_target", ScType.NODE);
            var relPattern = context.resolveBySystemIdentifier("qfis_pattern", ScType.NODE);
            context.createArc(ScType.EDGE_D_COMMON, ims, questionNode);

            var eventId = api.events()
                    .create(ScEventType.ADD_OUTGOING_EDGE, questionNode)
                    .execute()
                    .getPayload()
                    .get(0)
                    .getEventId();

            agentRegistry.registerAgent(eventId, event -> {
                var problemNode = event.getPayload().get(2);
                var graphs = getQuestionGraphs(context, problemNode);
                var targets = getTargetEdges(context, relTarget);
                var patterns = getPatternEdges(context, relPattern);

                var pattern = graphs.stream()
                        .filter(patterns::contains)
                        .findFirst()
                        .orElseThrow(() -> { throw new RuntimeException("invalid question: no pattern"); });

                var target = graphs.stream()
                        .filter(targets::contains)
                        .findFirst()
                        .orElseThrow(() -> { throw new RuntimeException("invalid question: no target"); });

                log.info("Graphs: {}", graphs);
                log.info("Targets: {}", targets);
                log.info("Patterns: {}", patterns);
            });

            while (true) { }

        }
    }

}
