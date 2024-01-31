//[lib](../../../index.md)/[ostis.jesc.memory.element.link](../index.md)/[ScLinkImpl](index.md)

# ScLinkImpl

[jvm]\
class [ScLinkImpl](index.md)(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), val addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) : [BaseScElement](../../ostis.jesc.memory.element/-base-sc-element/index.md), [ScLink](../-sc-link/index.md)

## Constructors

| | |
|---|---|
| [ScLinkImpl](-sc-link-impl.md) | [jvm]<br>constructor(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md) | [jvm]<br>open override val [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md) | [jvm]<br>open override fun [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md) | [jvm]<br>open override fun [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md) | [jvm]<br>open override fun [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md) | [jvm]<br>open override fun [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [getContent](get-content.md) | [jvm]<br>open override fun [getContent](get-content.md)(): [ScLinkContent](../../ostis.jesc.ctx.etc/-sc-link-content/index.md) |
| [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md) | [jvm]<br>open override fun [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
| [setContent](set-content.md) | [jvm]<br>open override fun [setContent](set-content.md)(content: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))<br>open override fun [setContent](set-content.md)(content: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>open override fun [setContent](set-content.md)(content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
