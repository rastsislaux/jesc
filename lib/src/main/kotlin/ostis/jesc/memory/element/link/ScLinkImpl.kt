package ostis.jesc.memory.element.link

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.ctx.etc.ScLinkContent
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.ScMemoryException
import ostis.jesc.memory.element.BaseScElement

class ScLinkImpl(memory: ScMemory, addr: ScAddr): BaseScElement(memory, addr), ScLink {

    init {
        if (!memory.ctx.getType(this.addr).isLink) {
            throw ScMemoryException("Could not construct ScLink: given addr is not a link")
        }
    }

    override fun getContent(): ScLinkContent {
        return memory.ctx.getLinkContent(this.addr)!!
    }

    override fun toString() = "ScLinkImpl[addr=$addr]"

}