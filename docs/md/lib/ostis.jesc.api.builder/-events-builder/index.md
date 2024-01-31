//[lib](../../../index.md)/[ostis.jesc.api.builder](../index.md)/[EventsBuilder](index.md)

# EventsBuilder

interface [EventsBuilder](index.md)

#### Inheritors

| |
|---|
| [EventsBuilderImpl](../-events-builder-impl/index.md) |

## Functions

| Name | Summary |
|---|---|
| [create](create.md) | [jvm]<br>abstract fun [create](create.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), eventType: [ScEventType](../../ostis.jesc.client.model.event/-sc-event-type/index.md)): [EventsBuilder](index.md) |
| [delete](delete.md) | [jvm]<br>abstract fun [delete](delete.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [EventsBuilder](index.md) |
| [execute](execute.md) | [jvm]<br>abstract fun [execute](execute.md)(): [LongsScResponse](../../ostis.jesc.client.model.response/-longs-sc-response/index.md) |
