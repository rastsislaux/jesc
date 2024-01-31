//[lib](../../../index.md)/[ostis.jesc.client.model.response](../index.md)/[ScResponseImpl](index.md)

# ScResponseImpl

open class [ScResponseImpl](index.md)&lt;[T](index.md) : [ScResponsePayload](../../ostis.jesc.client.model.response.payload/-sc-response-payload/index.md)&gt;(val id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val status: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val event: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val payload: [T](index.md)?) : [ScResponse](../-sc-response/index.md)&lt;[T](index.md)&gt; 

#### Inheritors

| |
|---|
| [AddrsScResponse](../-addrs-sc-response/index.md) |
| [ContentScResponse](../-content-sc-response/index.md) |
| [DeleteElementsScResponse](../-delete-elements-sc-response/index.md) |
| [LongsScResponse](../-longs-sc-response/index.md) |
| [SearchByTemplateScResponse](../-search-by-template-sc-response/index.md) |
| [TypesScResponse](../-types-sc-response/index.md) |

## Constructors

| | |
|---|---|
| [ScResponseImpl](-sc-response-impl.md) | [jvm]<br>constructor(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), status: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), event: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), payload: [T](index.md)?) |

## Properties

| Name | Summary |
|---|---|
| [event](event.md) | [jvm]<br>open override val [event](event.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [id](id.md) | [jvm]<br>open override val [id](id.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [payload](payload.md) | [jvm]<br>open override val [payload](payload.md): [T](index.md)? |
| [status](status.md) | [jvm]<br>open override val [status](status.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
