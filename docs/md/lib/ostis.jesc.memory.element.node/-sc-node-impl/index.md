//[lib](../../../index.md)/[ostis.jesc.memory.element.node](../index.md)/[ScNodeImpl](index.md)

# ScNodeImpl

[jvm]\
class [ScNodeImpl](index.md)(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), val addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) : [BaseScElement](../../ostis.jesc.memory.element/-base-sc-element/index.md), [ScNode](../-sc-node/index.md)

## Constructors

| | |
|---|---|
| [ScNodeImpl](-sc-node-impl.md) | [jvm]<br>constructor(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md) | [jvm]<br>open override val [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [systemIdentifier](system-identifier.md) | [jvm]<br>open override var [systemIdentifier](system-identifier.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md) | [jvm]<br>open override fun [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md) | [jvm]<br>open override fun [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md) | [jvm]<br>open override fun [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md) | [jvm]<br>open override fun [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [getMainIdentifier](get-main-identifier.md) | [jvm]<br>open override fun [getMainIdentifier](get-main-identifier.md)(langIdtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md) | [jvm]<br>open override fun [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
| [setMainIdentifier](set-main-identifier.md) | [jvm]<br>open override fun [setMainIdentifier](set-main-identifier.md)(idtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), langIdtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
