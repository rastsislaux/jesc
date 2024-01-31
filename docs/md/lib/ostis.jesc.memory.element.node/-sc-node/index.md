//[lib](../../../index.md)/[ostis.jesc.memory.element.node](../index.md)/[ScNode](index.md)

# ScNode

interface [ScNode](index.md) : [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)

#### Inheritors

| |
|---|
| [ScNodeImpl](../-sc-node-impl/index.md) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-sc-element/addr.md) | [jvm]<br>abstract val [addr](../../ostis.jesc.memory.element/-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [systemIdentifier](system-identifier.md) | [jvm]<br>abstract var [systemIdentifier](system-identifier.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md) | [jvm]<br>abstract fun [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md) | [jvm]<br>abstract fun [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](../../ostis.jesc.memory.element/-sc-element/delete.md) | [jvm]<br>abstract fun [delete](../../ostis.jesc.memory.element/-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-sc-element/edges.md) | [jvm]<br>abstract fun [edges](../../ostis.jesc.memory.element/-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [getMainIdentifier](get-main-identifier.md) | [jvm]<br>abstract fun [getMainIdentifier](get-main-identifier.md)(langIdtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [relations](../../ostis.jesc.memory.element/-sc-element/relations.md) | [jvm]<br>abstract fun [relations](../../ostis.jesc.memory.element/-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
| [setMainIdentifier](set-main-identifier.md) | [jvm]<br>abstract fun [setMainIdentifier](set-main-identifier.md)(idtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), langIdtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
