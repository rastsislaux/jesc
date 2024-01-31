//[lib](../../../index.md)/[ostis.jesc.memory.element.edge](../index.md)/[ScEdge](index.md)

# ScEdge

interface [ScEdge](index.md) : [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)

#### Inheritors

| |
|---|
| [ScEdgeImpl](../-sc-edge-impl/index.md) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-sc-element/addr.md) | [jvm]<br>abstract val [addr](../../ostis.jesc.memory.element/-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md) | [jvm]<br>abstract fun [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../-sc-edge-type/index.md)): [ScEdge](index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md) | [jvm]<br>abstract fun [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../-sc-edge-type/index.md)): [ScEdge](index.md) |
| [delete](../../ostis.jesc.memory.element/-sc-element/delete.md) | [jvm]<br>abstract fun [delete](../../ostis.jesc.memory.element/-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-sc-element/edges.md) | [jvm]<br>abstract fun [edges](../../ostis.jesc.memory.element/-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [getSource](get-source.md) | [jvm]<br>abstract fun [getSource](get-source.md)(): [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md) |
| [getTarget](get-target.md) | [jvm]<br>abstract fun [getTarget](get-target.md)(): [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md) |
| [getTriplet](get-triplet.md) | [jvm]<br>abstract fun [getTriplet](get-triplet.md)(): [ScTriplet](../../ostis.jesc.memory.common/-sc-triplet/index.md) |
| [relations](../../ostis.jesc.memory.element/-sc-element/relations.md) | [jvm]<br>abstract fun [relations](../../ostis.jesc.memory.element/-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
