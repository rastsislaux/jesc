package ostis.jesc.ctx

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.client.model.type.ScType
import ostis.jesc.ctx.etc.ScLinkContent
import java.io.Closeable
import java.util.*

interface ScCtx: Closeable {
    val api: ScApi

    fun getElements(set: ScAddr): List<ScAddr>
    fun findBySystemIdentifier(idtf: String): Optional<ScAddr>
    fun resolveBySystemIdentifier(idtf: String, type: ScType): ScAddr
    fun createNode(type: ScType): ScAddr
    fun createEdge(type: ScType, out: ScAddr, `in`: ScAddr): ScAddr
    fun createEvent(addr: ScAddr, eventType: ScEventType): Long
    fun getLinkContent(addr: ScAddr): ScLinkContent
    fun getSystemIdentifier(addr: ScAddr): String
    fun getMainIdentifier(addr: ScAddr, lang: String): String?
    fun getRelationTargets(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr>
    fun getRelationSources(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr>
    fun getRelationTarget(addr: ScAddr, relAddr: ScAddr, relType: ScType): ScAddr
    fun getRelationSource(addr: ScAddr, relAddr: ScAddr, relType: ScType): ScAddr
    fun getRoleRelationTargets(addr: ScAddr, rrelAddr: ScAddr): List<ScAddr>
    fun getRoleRelationSources(addr: ScAddr, rrelAddr: ScAddr): List<ScAddr>
    fun getRoleRelationTarget(addr: ScAddr, rrelAddr: ScAddr): ScAddr
    fun getRoleRelationSource(addr: ScAddr, rrelAddr: ScAddr): ScAddr
    fun getNoRoleRelationTargets(addr: ScAddr, nrelAddr: ScAddr): List<ScAddr>
    fun getNoRoleRelationSources(addr: ScAddr, nrelAddr: ScAddr): List<ScAddr>
    fun getNoRoleRelationTarget(addr: ScAddr, nrelAddr: ScAddr): ScAddr
    fun getNoRoleRelationSource(addr: ScAddr, nrelAddr: ScAddr): ScAddr
    fun createLink(type: ScType, content: Any, contentType: ScContentType): ScAddr
}
