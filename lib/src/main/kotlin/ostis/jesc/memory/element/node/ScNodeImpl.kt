package ostis.jesc.memory.element.node

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.ScMemoryException
import ostis.jesc.memory.element.BaseScElement

class ScNodeImpl(memory: ScMemory, addr: ScAddr): BaseScElement(memory, addr), ScNode {

    init {
        if (!memory.ctx.getType(this.addr).isNode) {
            throw ScMemoryException("Could not construct ScNode: given addr is not a node")
        }
    }

    override val systemIdentifier: String?
        get() = memory.ctx.getSystemIdentifier(this.addr)


    override fun getMainIdentifier(langIdtf: String): String? {
        return memory.ctx.getMainIdentifier(this.addr, langIdtf)
    }

    override fun setMainIdentifier(idtf: String, langIdtf: String) {
        TODO("Not yet implemented")
    }

    override fun toString() = "ScNodeImpl[addr=$addr]"

}