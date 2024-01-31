//[lib](../../../index.md)/[ostis.jesc.client.model.request.payload](../index.md)/[EventsScRequestPayload](index.md)

# EventsScRequestPayload

[jvm]\
class [EventsScRequestPayload](index.md)(val create: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[EventsScRequestPayload.Create](-create/index.md)&gt;, val delete: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt;) : [ScRequestPayload](../-sc-request-payload/index.md)

## Constructors

| | |
|---|---|
| [EventsScRequestPayload](-events-sc-request-payload.md) | [jvm]<br>constructor(create: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[EventsScRequestPayload.Create](-create/index.md)&gt;, delete: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt;) |

## Types

| Name | Summary |
|---|---|
| [Create](-create/index.md) | [jvm]<br>class [Create](-create/index.md)(val type: [ScEventType](../../ostis.jesc.client.model.event/-sc-event-type/index.md), val addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [create](create.md) | [jvm]<br>val [create](create.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[EventsScRequestPayload.Create](-create/index.md)&gt; |
| [delete](delete.md) | [jvm]<br>val [delete](delete.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt; |
