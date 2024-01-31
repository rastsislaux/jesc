//[lib](../../../index.md)/[ostis.jesc.client](../index.md)/[ScClient](index.md)

# ScClient

interface [ScClient](index.md) : [Closeable](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)

#### Inheritors

| |
|---|
| [ScClientImpl](../-sc-client-impl/index.md) |

## Functions

| Name | Summary |
|---|---|
| [addEventHandler](add-event-handler.md) | [jvm]<br>abstract fun [addEventHandler](add-event-handler.md)(handler: ([ScEvent](../../ostis.jesc.client.model.event/-sc-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |
| [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613)() |
| [removeEventHandler](remove-event-handler.md) | [jvm]<br>abstract fun [removeEventHandler](remove-event-handler.md)(handler: ([ScEvent](../../ostis.jesc.client.model.event/-sc-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |
| [sendRequest](send-request.md) | [jvm]<br>abstract fun &lt;[T](send-request.md)&gt; [sendRequest](send-request.md)(request: [ScRequest](../../ostis.jesc.client.model.request/-sc-request/index.md)&lt;[ScRequestPayload](../../ostis.jesc.client.model.request.payload/-sc-request-payload/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](send-request.md)&gt;): [T](send-request.md) |
