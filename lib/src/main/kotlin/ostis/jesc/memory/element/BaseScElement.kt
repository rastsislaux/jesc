package ostis.jesc.memory.element

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeType

abstract class BaseScElement(protected val memory: ScMemory, override val addr: ScAddr): ScElement {

    override fun createEdgeTo(target: ScElement, edgeType: ScEdgeType): ScEdge {
        val edgeAddr = memory.ctx.createEdge(edgeType.type, this.addr, target.addr)
        return memory.get().edge(edgeAddr)
    }

    override fun createEdgeFrom(source: ScElement, edgeType: ScEdgeType): ScEdge {
        val edgeAddr = memory.ctx.createEdge(edgeType.type, source.addr, this.addr)
        return memory.get().edge(edgeAddr)
    }

    override fun delete() {
        memory.ctx.delete(this.addr)
    }

}