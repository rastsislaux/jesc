//[lib](../../../index.md)/[ostis.jesc.api.builder](../index.md)/[CreateElementsBuilderImpl](index.md)

# CreateElementsBuilderImpl

[jvm]\
class [CreateElementsBuilderImpl](index.md)(api: [ScApi](../../ostis.jesc.api/-sc-api/index.md)) : [CreateElementsBuilder](../-create-elements-builder/index.md)

## Constructors

| | |
|---|---|
| [CreateElementsBuilderImpl](-create-elements-builder-impl.md) | [jvm]<br>constructor(api: [ScApi](../../ostis.jesc.api/-sc-api/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [edge](edge.md) | [jvm]<br>open override fun [edge](edge.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), source: [ScRef](../../ostis.jesc.client.model.ref/-sc-ref/index.md), target: [ScRef](../../ostis.jesc.client.model.ref/-sc-ref/index.md)): [CreateElementsBuilder](../-create-elements-builder/index.md) |
| [execute](execute.md) | [jvm]<br>open override fun [execute](execute.md)(): [AddrsScResponse](../../ostis.jesc.client.model.response/-addrs-sc-response/index.md) |
| [link](link.md) | [jvm]<br>open override fun [link](link.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), content: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), contentType: [ScContentType](../../ostis.jesc.client.model.request.payload.entry/-sc-content-type/index.md)): [CreateElementsBuilder](../-create-elements-builder/index.md) |
| [node](node.md) | [jvm]<br>open override fun [node](node.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [CreateElementsBuilder](../-create-elements-builder/index.md) |
