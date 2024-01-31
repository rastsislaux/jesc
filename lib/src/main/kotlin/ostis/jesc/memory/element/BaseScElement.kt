package ostis.jesc.memory.element

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.node.ScNode
import ostis.jesc.memory.template.ScTemplate

abstract class BaseScElement(protected val memory: ScMemory, override val addr: ScAddr): ScElement {

    override fun createEdgeTo(target: ScElement, edgeType: ScEdgeType): ScEdge {
        val edgeAddr = memory.ctx.createEdge(edgeType.type, this.addr, target.addr)
        return memory.get().edge(edgeAddr)
    }

    override fun createEdgeFrom(source: ScElement, edgeType: ScEdgeType): ScEdge {
        val edgeAddr = memory.ctx.createEdge(edgeType.type, source.addr, this.addr)
        return memory.get().edge(edgeAddr)
    }

    override fun edges() = object: ScElement.Edges {

        override fun create() = object: ScElement.Edges.Create {

            override fun to(target: ScElement, edgeType: ScEdgeType): ScEdge {
                val edgeAddr = memory.ctx.createEdge(edgeType.type, this@BaseScElement.addr, target.addr)
                return memory.get().edge(edgeAddr)
            }

            override fun from(source: ScElement, edgeType: ScEdgeType): ScEdge {
                val edgeAddr = memory.ctx.createEdge(edgeType.type, source.addr, this@BaseScElement.addr)
                return memory.get().edge(edgeAddr)
            }

        }

        override fun find() = object: ScElement.Edges.Find {

            override fun targets(edgeType: ScEdgeType): List<ScElement> {
                val templ = ScTemplate.triplet(this@BaseScElement, edgeType, ScType.VAR)
                return memory.find(templ).map { it[2] }
            }

            override fun sources(edgeType: ScEdgeType): List<ScElement> {
                val templ = ScTemplate.triplet(ScType.VAR, edgeType, this@BaseScElement)
                return memory.find(templ).map { it[2] }
            }

            override fun target(edgeType: ScEdgeType) = targets(edgeType).getOrNull(0)
            override fun source(edgeType: ScEdgeType) = sources(edgeType).getOrNull(0)

        }

    }

    override fun relations() = object: ScElement.Relations {

        override fun create() = object: ScElement.Relations.Create {

            override fun rrel() = object: ScElement.Relations.Create.Specific {

                override fun to(target: ScElement, rel: ScNode): ScEdge {
                    val edgeAddr = memory.ctx.api.createElements()
                        .edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(this@BaseScElement.addr), ScRef.addr(target.addr)) // 0
                        .edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(rel.addr), ScRef.ref(0)) // 1
                        .execute().payload!![0]
                    return memory.get().edge(edgeAddr)
                }

                override fun from(target: ScElement, rel: ScNode): ScEdge {
                    val edgeAddr = memory.ctx.api.createElements()
                        .edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(target.addr), ScRef.addr(this@BaseScElement.addr)) // 0
                        .edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(rel.addr), ScRef.ref(0)) // 1
                        .execute().payload!![0]
                    return memory.get().edge(edgeAddr)
                }

            }

            override fun nrel() = object: ScElement.Relations.Create.Specific {

                override fun to(target: ScElement, rel: ScNode): ScEdge {
                    val edgeAddr = memory.ctx.api.createElements()
                        .edge(ScType.EDGE_D_COMMON_CONST, ScRef.addr(this@BaseScElement.addr), ScRef.addr(target.addr)) // 0
                        .edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(rel.addr), ScRef.ref(0)) // 1
                        .execute().payload!![0]
                    return memory.get().edge(edgeAddr)
                }

                override fun from(target: ScElement, rel: ScNode): ScEdge {
                    val edgeAddr = memory.ctx.api.createElements()
                        .edge(ScType.EDGE_D_COMMON_CONST, ScRef.addr(target.addr), ScRef.addr(this@BaseScElement.addr)) // 0
                        .edge(ScType.EDGE_ACCESS_CONST_POS_PERM, ScRef.addr(rel.addr), ScRef.ref(0)) // 1
                        .execute().payload!![0]
                    return memory.get().edge(edgeAddr)
                }

            }

        }

        override fun find() = object: ScElement.Relations.Find {

            override fun nrel() = object: ScElement.Relations.Find.Specific {

                override fun target(rel: ScNode) =
                    memory.ctx.getNoRoleRelationTarget(this@BaseScElement.addr, rel.addr)
                        ?.let { memory.get().element(it) }

                override fun targets(rel: ScNode) =
                    memory.ctx.getNoRoleRelationTargets(this@BaseScElement.addr, rel.addr)
                        .map { memory.get().element(it) }

                override fun source(rel: ScNode) =
                    memory.ctx.getNoRoleRelationSource(this@BaseScElement.addr, rel.addr)
                        ?.let { memory.get().element(it) }

                override fun sources(rel: ScNode) =
                    memory.ctx.getNoRoleRelationSources(this@BaseScElement.addr, rel.addr)
                        .map { memory.get().element(it) }

            }

            override fun rrel() = object: ScElement.Relations.Find.Specific {

                override fun target(rel: ScNode) =
                    memory.ctx.getRoleRelationTarget(this@BaseScElement.addr, rel.addr)
                        ?.let { memory.get().element(it) }

                override fun targets(rel: ScNode) =
                    memory.ctx.getRoleRelationTargets(this@BaseScElement.addr, rel.addr)
                        .map { memory.get().element(it) }

                override fun source(rel: ScNode) =
                    memory.ctx.getRoleRelationSource(this@BaseScElement.addr, rel.addr)
                        ?.let { memory.get().element(it) }

                override fun sources(rel: ScNode) =
                    memory.ctx.getRoleRelationSources(this@BaseScElement.addr, rel.addr)
                        .map { memory.get().element(it) }

            }

        }

    }

    override fun delete() {
        memory.ctx.delete(this.addr)
    }

}