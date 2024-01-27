package ostis.jesc.memory.element.node

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.ScMemoryException
import ostis.jesc.memory.element.BaseScElement
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.link.ScLink

class ScNodeImpl(memory: ScMemory, addr: ScAddr): BaseScElement(memory, addr), ScNode {

    init {
        if (!memory.ctx.getType(this.addr).isNode) {
            throw ScMemoryException("Could not construct ScNode: given addr is not a node")
        }
    }

    override var systemIdentifier: String
        get() = memory.ctx.getSystemIdentifier(this.addr)!!
        set(sysIdtf) {
            val nrelSystemIdentifier = memory.get().node("nrel_system_identifier")
            val linkAddr = memory.ctx.getNoRoleRelationTarget(this.addr, nrelSystemIdentifier.addr)
            memory.get().link(linkAddr).setContent(sysIdtf)
        }


    override fun getMainIdentifier(langIdtf: String): String? {
        return memory.ctx.getMainIdentifier(this.addr, langIdtf)
    }

    override fun setMainIdentifier(idtf: String, langIdtf: String) {
        val nrelMainIdtf = memory.get().node("nrel_main_idtf")
        val lang = memory.get().node(langIdtf)
        val link = memory.search()
            .triplet(this, ScRef.type(ScType.EDGE_D_COMMON_VAR, "nrel"), ScRef.type(ScType.LINK_VAR, "link"))
            .triplet(nrelMainIdtf, ScEdgeType.ACCESS_VAR_POS_PERM, "nrel")
            .triplet(lang, ScEdgeType.ACCESS_VAR_POS_PERM, "link")
            .result()[2].target as ScLink
        link.setContent(idtf)
    }

    override fun toString() = "ScNodeImpl[addr=$addr]"

}