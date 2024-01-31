//[lib](../../../index.md)/[ostis.jesc.api](../index.md)/[ScApi](index.md)

# ScApi

interface [ScApi](index.md) : [Closeable](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)

#### Inheritors

| |
|---|
| [ScApiImpl](../-sc-api-impl/index.md) |

## Properties

| Name | Summary |
|---|---|
| [client](client.md) | [jvm]<br>abstract val [client](client.md): [ScClient](../../ostis.jesc.client/-sc-client/index.md) |

## Functions

| Name | Summary |
|---|---|
| [checkElements](check-elements.md) | [jvm]<br>abstract fun [checkElements](check-elements.md)(): [CheckElementsBuilder](../../ostis.jesc.api.builder/-check-elements-builder/index.md) |
| [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613)() |
| [content](content.md) | [jvm]<br>abstract fun [content](content.md)(): [ContentBuilderImpl](../../ostis.jesc.api.builder/-content-builder-impl/index.md) |
| [createElements](create-elements.md) | [jvm]<br>abstract fun [createElements](create-elements.md)(): [CreateElementsBuilder](../../ostis.jesc.api.builder/-create-elements-builder/index.md) |
| [deleteElements](delete-elements.md) | [jvm]<br>abstract fun [deleteElements](delete-elements.md)(): [DeleteElementsBuilder](../../ostis.jesc.api.builder/-delete-elements-builder/index.md) |
| [events](events.md) | [jvm]<br>abstract fun [events](events.md)(): [EventsBuilder](../../ostis.jesc.api.builder/-events-builder/index.md) |
| [keynodes](keynodes.md) | [jvm]<br>abstract fun [keynodes](keynodes.md)(): [KeynodesBuilder](../../ostis.jesc.api.builder/-keynodes-builder/index.md) |
| [makeId](make-id.md) | [jvm]<br>abstract fun [makeId](make-id.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [searchByTemplate](search-by-template.md) | [jvm]<br>abstract fun [searchByTemplate](search-by-template.md)(): [SearchByTemplateBuilder](../../ostis.jesc.api.builder/-search-by-template-builder/index.md) |
