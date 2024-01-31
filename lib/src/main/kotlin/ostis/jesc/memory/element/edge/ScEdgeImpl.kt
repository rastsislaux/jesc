package ostis.jesc.memory.element.edge

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.ScMemoryException
import ostis.jesc.memory.common.ScTriplet
import ostis.jesc.memory.element.BaseScElement

class ScEdgeImpl(memory: ScMemory, addr: ScAddr): BaseScElement(memory, addr), ScEdge {

    init {
        if (!memory.ctx.getType(this.addr).isEdge) {
            throw ScMemoryException("Could not construct ScEdge: given addr is not an edge")
        }
    }

    override fun getTriplet(): ScTriplet {
        val addrs = memory.ctx.api.searchByTemplate()
            .triplet(ScRef.type(ScType.VAR), ScRef.addr(this.addr), ScRef.type(ScType.VAR))
            .execute()
            .payload!!.addrs[0]
        return ScTriplet(
            memory.get().element(addrs[0]),
            memory.get().edge(addrs[1]),
            memory.get().element(addrs[2])
        )
    }

    override fun getSource() = getTriplet().source

    override fun getTarget() = getTriplet().target

    override fun toString() = "ScEdgeImpl[addr=$addr]"

}