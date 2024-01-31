package ostis.jesc.memory.element.link

import ostis.jesc.ctx.etc.ScLinkContent
import ostis.jesc.memory.element.ScElement

interface ScLink: ScElement {
    fun getContent(): ScLinkContent
    fun setContent(content: String)
    fun setContent(content: Double)
    fun setContent(content: Int)
}