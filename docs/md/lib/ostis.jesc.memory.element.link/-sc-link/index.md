//[lib](../../../index.md)/[ostis.jesc.memory.element.link](../index.md)/[ScLink](index.md)

# ScLink

interface [ScLink](index.md) : [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)

#### Inheritors

| |
|---|
| [ScLinkImpl](../-sc-link-impl/index.md) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-sc-element/addr.md) | [jvm]<br>abstract val [addr](../../ostis.jesc.memory.element/-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md) | [jvm]<br>abstract fun [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md) | [jvm]<br>abstract fun [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](../../ostis.jesc.memory.element/-sc-element/delete.md) | [jvm]<br>abstract fun [delete](../../ostis.jesc.memory.element/-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-sc-element/edges.md) | [jvm]<br>abstract fun [edges](../../ostis.jesc.memory.element/-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [getContent](get-content.md) | [jvm]<br>abstract fun [getContent](get-content.md)(): [ScLinkContent](../../ostis.jesc.ctx.etc/-sc-link-content/index.md) |
| [relations](../../ostis.jesc.memory.element/-sc-element/relations.md) | [jvm]<br>abstract fun [relations](../../ostis.jesc.memory.element/-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
| [setContent](set-content.md) | [jvm]<br>abstract fun [setContent](set-content.md)(content: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))<br>abstract fun [setContent](set-content.md)(content: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>abstract fun [setContent](set-content.md)(content: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
