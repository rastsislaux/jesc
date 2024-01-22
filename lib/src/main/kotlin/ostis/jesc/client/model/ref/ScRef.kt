package ostis.jesc.client.model.ref

import ostis.jesc.client.model.addr.ScAddr
import ostis.jesc.client.model.type.ScType

interface ScRef {
    val type: ScRefType
    val value: Any
    val alias: String?

    companion object {

        fun addr(addr: ScAddr, alias: String? = null) = object : ScRef {
            override val type = ScRefType.ADDR
            override val value = addr
            override val alias = alias
        }

        fun ref(ref: Long, alias: String? = null) = object : ScRef {
            override val type = ScRefType.REF
            override val value = ref
            override val alias = alias
        }

        fun type(type: ScType, alias: String? = null) = object : ScRef {
            override val type = ScRefType.TYPE
            override val value = type
            override val alias = alias
        }

        fun alias(alias: String) = object : ScRef {
            override val type = ScRefType.ALIAS
            override val value = alias
            override val alias: String? = null
        }

    }
}

