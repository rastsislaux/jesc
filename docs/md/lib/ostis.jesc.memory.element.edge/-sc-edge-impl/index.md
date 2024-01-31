//[lib](../../../index.md)/[ostis.jesc.memory.element.edge](../index.md)/[ScEdgeImpl](index.md)

# ScEdgeImpl

[jvm]\
class [ScEdgeImpl](index.md)(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), val addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) : [BaseScElement](../../ostis.jesc.memory.element/-base-sc-element/index.md), [ScEdge](../-sc-edge/index.md)

## Constructors

| | |
|---|---|
| [ScEdgeImpl](-sc-edge-impl.md) | [jvm]<br>constructor(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md) | [jvm]<br>open override val [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md) | [jvm]<br>open override fun [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../-sc-edge-type/index.md)): [ScEdge](../-sc-edge/index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md) | [jvm]<br>open override fun [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../-sc-edge-type/index.md)): [ScEdge](../-sc-edge/index.md) |
| [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md) | [jvm]<br>open override fun [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md) | [jvm]<br>open override fun [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [getSource](get-source.md) | [jvm]<br>open override fun [getSource](get-source.md)(): [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md) |
| [getTarget](get-target.md) | [jvm]<br>open override fun [getTarget](get-target.md)(): [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md) |
| [getTriplet](get-triplet.md) | [jvm]<br>open override fun [getTriplet](get-triplet.md)(): [ScTriplet](../../ostis.jesc.memory.common/-sc-triplet/index.md) |
| [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md) | [jvm]<br>open override fun [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
