package ostis.jesc

import ostis.jesc.api.ScApi
import ostis.jesc.api.ScApiImpl
import ostis.jesc.client.ScClient
import ostis.jesc.client.ScClientImpl
import ostis.jesc.client.ws.ScWebSocketClientImpl
import ostis.jesc.ctx.ScCtx
import ostis.jesc.ctx.ScCtxImpl
import ostis.jesc.kpm.ScServer
import ostis.jesc.kpm.ScServerImpl
import java.net.URI

interface JESCBuilder {
    fun makeClient(host: String, port: Int): ScClient
    fun makeApi(host: String, port: Int): ScApi
    fun makeCtx(host: String, port: Int): ScCtx
    fun makeServer(host: String, port: Int): ScServer
}

object JESC: JESCBuilder {

    override fun makeClient(host: String, port: Int): ScClient = ScClientImpl(
        ScWebSocketClientImpl(
            URI("ws://$host:$port/ws_json")
        )
    )

    override fun makeApi(host: String, port: Int): ScApi = ScApiImpl(makeClient(host, port))

    override fun makeCtx(host: String, port: Int): ScCtx = ScCtxImpl(makeApi(host, port))

    override fun makeServer(host: String, port: Int): ScServer = ScServerImpl(host, port)

}
