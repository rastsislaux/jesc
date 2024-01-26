package ostis.jesc.ctx

import ostis.jesc.api.ScApi
import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.event.ScEventType
import ostis.jesc.client.model.ref.ScRef
import ostis.jesc.client.model.request.payload.entry.ScContentType
import ostis.jesc.client.model.type.ScType
import ostis.jesc.ctx.etc.ScLinkContent
import ostis.jesc.ctx.set.ScSet
import ostis.jesc.ctx.set.ScSetImpl
import java.util.*
import kotlin.jvm.optionals.getOrNull

class ScCtxImpl(override val api: ScApi): ScCtx {

    private val nrelSystemIdtf = findBySystemIdentifier("nrel_system_identifier").get()
    private val nrelMainIdtf = findBySystemIdentifier("nrel_main_idtf").get()

    override fun findBySystemIdentifier(idtf: String): Optional<ScAddr> {
        return Optional.ofNullable(api.keynodes().find(idtf).execute().payload?.get(0))
    }

    override fun getType(addr: ScAddr): ScType {
        return api.checkElements()
            .addr(addr)
            .execute()
            .payload!![0]
    }

    override fun delete(addr: ScAddr) {
        api.deleteElements().addr(addr).execute()
    }

    override fun resolveBySystemIdentifier(idtf: String, type: ScType): ScAddr {
        return api.keynodes().resolve(idtf, type).execute().payload!![0]
    }

    override fun createNode(type: ScType): ScAddr {
        return api.createElements().node(type).execute().payload!![0]
    }

    override fun createEdge(type: ScType, out: ScAddr, `in`: ScAddr): ScAddr {
        return api.createElements().edge(type, ScRef.addr(out), ScRef.addr(`in`)).execute().payload!![0]
    }

    override fun createLink(type: ScType, content: Any, contentType: ScContentType): ScAddr {
        return api.createElements().link(type, content, contentType).execute().payload!![0]
    }

    override fun structs() = object : ScCtx.Structs {
        override fun set(): ScSet = ScSetImpl(ctx = this@ScCtxImpl, addr = createNode(ScType.NODE_CONST_STRUCT))
        override fun set(type: ScType): ScSet = ScSetImpl(ctx = this@ScCtxImpl, addr = createNode(type))
        override fun set(addr: ScAddr): ScSet = ScSetImpl(ctx = this@ScCtxImpl, addr = addr)
    }

    override fun createEvent(addr: ScAddr, eventType: ScEventType): Long {
        return api.events().create(addr, eventType).execute().payload!![0]
    }

    override fun getLinkContent(addr: ScAddr): ScLinkContent? {
        val value = api.content().get(addr).execute().payload!!

        if (value.size > 0) {
            return ScLinkContent(value[0]["value"])
        }

        return null
    }

    override fun getSystemIdentifier(addr: ScAddr): String? {
        val linkAddr = api.searchByTemplate()
            .triplet(
                ScRef.addr(addr),
                ScRef.type(ScType.EDGE_D_COMMON_VAR, "edge"),
                ScRef.type(ScType.LINK)
            )
            .triplet(
                ScRef.addr(nrelSystemIdtf),
                ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScRef.alias("edge")
            )
            .execute()
            .payload!!.addrs[0][2]

        return getLinkContent(linkAddr)?.string()
    }

    override fun getMainIdentifier(addr: ScAddr, lang: String): String? {
        val langAddr = findBySystemIdentifier(lang).getOrNull() ?: return null

        val linkAddr = api.searchByTemplate()
            .triplet(
                ScRef.addr(addr),
                ScRef.type(ScType.EDGE_D_COMMON_VAR, "edge"),
                ScRef.type(ScType.LINK_VAR, "content")
            )
            .triplet(
                ScRef.addr(nrelMainIdtf),
                ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScRef.alias("edge")
            )
            .triplet(
                ScRef.addr(langAddr),
                ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScRef.alias("content")
            )
            .execute().payload!!.addrs.getOrNull(0)?.getOrNull(2)

        return linkAddr?.let { getLinkContent(it)!!.string() }
    }

    override fun getRelationTargets(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr> {
        return api.searchByTemplate()
            .triplet(
                ScRef.addr(addr),
                ScRef.type(relType, "edge"),
                ScRef.type(ScType.VAR)
            )
            .triplet(
                ScRef.addr(addr),
                ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScRef.alias("edge")
            )
            .execute().payload!!.addrs
            .map { it[2] }
    }

    override fun getRelationSources(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr> {
        return api.searchByTemplate()
            .triplet(
                ScRef.type(ScType.VAR),
                ScRef.type(relType, "edge"),
                ScRef.addr(addr)
            )
            .triplet(
                ScRef.addr(relAddr),
                ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
                ScRef.alias("edge")
            )
            .execute().payload!!.addrs
            .map { it[0] }
    }

    override fun getRelationTarget(addr: ScAddr, relAddr: ScAddr, relType: ScType) =
        getRelationTargets(addr, relAddr, relType)[0]

    override fun getRelationSource(addr: ScAddr, relAddr: ScAddr, relType: ScType) =
        getRelationSources(addr, relAddr, relType)[0]

    override fun getRoleRelationTargets(addr: ScAddr, rrelAddr: ScAddr) =
        getRelationTargets(addr, rrelAddr, ScType.EDGE_ACCESS_VAR_POS_PERM)

    override fun getRoleRelationSources(addr: ScAddr, rrelAddr: ScAddr) =
        getRelationSources(addr, rrelAddr, ScType.EDGE_ACCESS_VAR_POS_PERM)

    override fun getRoleRelationTarget(addr: ScAddr, rrelAddr: ScAddr) =
        getRoleRelationTargets(addr, rrelAddr)[0]

    override fun getRoleRelationSource(addr: ScAddr, rrelAddr: ScAddr) =
        getRoleRelationSources(addr, rrelAddr)[0]

    override fun getNoRoleRelationTargets(addr: ScAddr, nrelAddr: ScAddr) =
        getRelationTargets(addr, nrelAddr, ScType.EDGE_D_COMMON_VAR)

    override fun getNoRoleRelationSources(addr: ScAddr, nrelAddr: ScAddr) =
        getRelationSources(addr, nrelAddr, ScType.EDGE_D_COMMON_VAR)

    override fun getNoRoleRelationTarget(addr: ScAddr, nrelAddr: ScAddr) =
        getNoRoleRelationTargets(addr, nrelAddr)[0]

    override fun getNoRoleRelationSource(addr: ScAddr, nrelAddr: ScAddr) =
        getNoRoleRelationSources(addr, nrelAddr)[0]

    override fun getElements(set: ScAddr): List<ScAddr> = api.searchByTemplate()
        .triplet(
            ScRef.addr(set),
            ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
            ScRef.type(ScType.VAR)
        )
        .execute().payload!!.addrs
        .map { it.last() }

    override fun close() {
        api.close()
    }

}
