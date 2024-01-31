package ostis.jesc.memory.element.node

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.type.ScType
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.ScMemoryException
import ostis.jesc.memory.element.BaseScElement
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.link.ScLink
import ostis.jesc.memory.element.link.ScLinkType
import ostis.jesc.memory.template.ScTemplate

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
            linkAddr?.let {
                memory.get().link(linkAddr).setContent(sysIdtf)
            } ?: {
                memory.new().link(ScLinkType.CONST, sysIdtf)
                    .edges().create().from(this, ScEdgeType.D_COMMON_CONST)
                    .edges().create().from(nrelSystemIdentifier, ScEdgeType.ACCESS_CONST_POS_PERM)
            }
        }


    override fun getMainIdentifier(langIdtf: String): String? {
        return memory.ctx.getMainIdentifier(this.addr, langIdtf)
    }

    override fun setMainIdentifier(idtf: String, langIdtf: String) {
        val nrelMainIdtf = memory.get().node("nrel_main_idtf")
        val lang = memory.get().node(langIdtf)
        val templ = ScTemplate
            .triplet(this, ScRef.type(ScType.EDGE_D_COMMON_VAR, "nrel"), ScRef.type(ScType.LINK_VAR, "link"))
            .triplet(nrelMainIdtf, ScEdgeType.ACCESS_VAR_POS_PERM, "nrel")
            .triplet(lang, ScEdgeType.ACCESS_VAR_POS_PERM, "link")
        memory.find(templ).getOrNull(2)?.let {
            (it[2] as ScLink).setContent(idtf)
        } ?: {
            val link = memory.new().link(ScLinkType.CONST, idtf)
            link
                .edges().create().from(this, ScEdgeType.D_COMMON_CONST)
                .edges().create().from(nrelMainIdtf, ScEdgeType.ACCESS_CONST_POS_PERM)
            link.edges().create().from(lang, ScEdgeType.ACCESS_CONST_POS_PERM)
        }
    }

    override fun toString() = "ScNodeImpl[addr=$addr]"

}