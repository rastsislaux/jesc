//[lib](../../../index.md)/[ostis.jesc.api](../index.md)/[ScApiImpl](index.md)

# ScApiImpl

[jvm]\
class [ScApiImpl](index.md)(val client: [ScClient](../../ostis.jesc.client/-sc-client/index.md)) : [ScApi](../-sc-api/index.md)

## Constructors

| | |
|---|---|
| [ScApiImpl](-sc-api-impl.md) | [jvm]<br>constructor(client: [ScClient](../../ostis.jesc.client/-sc-client/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [client](client.md) | [jvm]<br>open override val [client](client.md): [ScClient](../../ostis.jesc.client/-sc-client/index.md) |

## Functions

| Name | Summary |
|---|---|
| [checkElements](check-elements.md) | [jvm]<br>open override fun [checkElements](check-elements.md)(): [CheckElementsBuilderImpl](../../ostis.jesc.api.builder/-check-elements-builder-impl/index.md) |
| [close](close.md) | [jvm]<br>open override fun [close](close.md)() |
| [content](content.md) | [jvm]<br>open override fun [content](content.md)(): [ContentBuilderImpl](../../ostis.jesc.api.builder/-content-builder-impl/index.md) |
| [createElements](create-elements.md) | [jvm]<br>open override fun [createElements](create-elements.md)(): [CreateElementsBuilderImpl](../../ostis.jesc.api.builder/-create-elements-builder-impl/index.md) |
| [deleteElements](delete-elements.md) | [jvm]<br>open override fun [deleteElements](delete-elements.md)(): [DeleteElementsBuilderImpl](../../ostis.jesc.api.builder/-delete-elements-builder-impl/index.md) |
| [events](events.md) | [jvm]<br>open override fun [events](events.md)(): [EventsBuilderImpl](../../ostis.jesc.api.builder/-events-builder-impl/index.md) |
| [keynodes](keynodes.md) | [jvm]<br>open override fun [keynodes](keynodes.md)(): [KeynodesBuilderImpl](../../ostis.jesc.api.builder/-keynodes-builder-impl/index.md) |
| [makeId](make-id.md) | [jvm]<br>open override fun [makeId](make-id.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [searchByTemplate](search-by-template.md) | [jvm]<br>open override fun [searchByTemplate](search-by-template.md)(): [SearchByTemplateBuilderImpl](../../ostis.jesc.api.builder/-search-by-template-builder-impl/index.md) |
