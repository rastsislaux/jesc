//[lib](../../../index.md)/[ostis.jesc.api.builder](../index.md)/[CreateElementsBuilder](index.md)

# CreateElementsBuilder

interface [CreateElementsBuilder](index.md)

#### Inheritors

| |
|---|
| [CreateElementsBuilderImpl](../-create-elements-builder-impl/index.md) |

## Functions

| Name | Summary |
|---|---|
| [edge](edge.md) | [jvm]<br>abstract fun [edge](edge.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), source: [ScRef](../../ostis.jesc.client.model.ref/-sc-ref/index.md), target: [ScRef](../../ostis.jesc.client.model.ref/-sc-ref/index.md)): [CreateElementsBuilder](index.md) |
| [execute](execute.md) | [jvm]<br>abstract fun [execute](execute.md)(): [AddrsScResponse](../../ostis.jesc.client.model.response/-addrs-sc-response/index.md) |
| [link](link.md) | [jvm]<br>abstract fun [link](link.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), content: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), contentType: [ScContentType](../../ostis.jesc.client.model.request.payload.entry/-sc-content-type/index.md)): [CreateElementsBuilder](index.md) |
| [node](node.md) | [jvm]<br>abstract fun [node](node.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [CreateElementsBuilder](index.md) |
