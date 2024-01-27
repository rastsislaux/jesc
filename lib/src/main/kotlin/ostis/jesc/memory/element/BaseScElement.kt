package ostis.jesc.memory.element

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.node.ScNode

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

            override fun target(edgeType: ScEdgeType) {
                TODO("Not yet implemented")
            }

            override fun targets(edgeType: ScEdgeType) {
                TODO("Not yet implemented")
            }

            override fun source(edgeType: ScEdgeType) {
                TODO("Not yet implemented")
            }

            override fun sources(edgeType: ScEdgeType) {
                TODO("Not yet implemented")
            }

        }

    }

    override fun relations() = object: ScElement.Relations {

        override fun create() = object: ScElement.Relations.Create {

            override fun rrel() = object: ScElement.Relations.Create.Specific {

                override fun to(target: ScElement, rel: ScNode) {
                    TODO("Not yet implemented")
                }

                override fun from(target: ScElement, rel: ScNode) {
                    TODO("Not yet implemented")
                }

            }

            override fun nrel(): ScElement.Relations.Create.Specific {
                TODO("Not yet implemented")
            }


        }

        override fun find() = object: ScElement.Relations.Find {

            override fun nrel() = object: ScElement.Relations.Find.Specific {

                override fun target(rel: ScNode) =
                    memory.ctx.getNoRoleRelationTarget(this@BaseScElement.addr, rel.addr)
                        .let { memory.get().element(it) }

                override fun targets(rel: ScNode) =
                    memory.ctx.getNoRoleRelationTargets(this@BaseScElement.addr, rel.addr)
                        .map { memory.get().element(it) }

                override fun source(rel: ScNode) =
                    memory.ctx.getNoRoleRelationSource(this@BaseScElement.addr, rel.addr)
                        .let { memory.get().element(it) }

                override fun sources(rel: ScNode) =
                    memory.ctx.getNoRoleRelationSources(this@BaseScElement.addr, rel.addr)
                        .map { memory.get().element(it) }

            }

            override fun rrel() = object: ScElement.Relations.Find.Specific {

                override fun target(rel: ScNode) =
                    memory.ctx.getRoleRelationTarget(this@BaseScElement.addr, rel.addr)
                        .let { memory.get().element(it) }

                override fun targets(rel: ScNode) =
                    memory.ctx.getRoleRelationTargets(this@BaseScElement.addr, rel.addr)
                        .map { memory.get().element(it) }

                override fun source(rel: ScNode) =
                    memory.ctx.getRoleRelationSource(this@BaseScElement.addr, rel.addr)
                        .let { memory.get().element(it) }

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