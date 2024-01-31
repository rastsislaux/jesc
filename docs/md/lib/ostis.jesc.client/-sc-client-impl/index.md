//[lib](../../../index.md)/[ostis.jesc.client](../index.md)/[ScClientImpl](index.md)

# ScClientImpl

[jvm]\
class [ScClientImpl](index.md)(wsc: [ScWebSocketClient](../../ostis.jesc.client.ws/-sc-web-socket-client/index.md)) : [ScClient](../-sc-client/index.md)

## Constructors

| | |
|---|---|
| [ScClientImpl](-sc-client-impl.md) | [jvm]<br>constructor(wsc: [ScWebSocketClient](../../ostis.jesc.client.ws/-sc-web-socket-client/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [addEventHandler](add-event-handler.md) | [jvm]<br>open override fun [addEventHandler](add-event-handler.md)(handler: ([ScEvent](../../ostis.jesc.client.model.event/-sc-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |
| [close](close.md) | [jvm]<br>open override fun [close](close.md)() |
| [removeEventHandler](remove-event-handler.md) | [jvm]<br>open override fun [removeEventHandler](remove-event-handler.md)(handler: ([ScEvent](../../ostis.jesc.client.model.event/-sc-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |
| [sendRequest](send-request.md) | [jvm]<br>open override fun &lt;[T](send-request.md)&gt; [sendRequest](send-request.md)(request: [ScRequest](../../ostis.jesc.client.model.request/-sc-request/index.md)&lt;[ScRequestPayload](../../ostis.jesc.client.model.request.payload/-sc-request-payload/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](send-request.md)&gt;): [T](send-request.md) |
