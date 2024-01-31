//[lib](../../../index.md)/[ostis.jesc.memory.element](../index.md)/[ScElement](index.md)

# ScElement

interface [ScElement](index.md)

#### Inheritors

| |
|---|
| [BaseScElement](../-base-sc-element/index.md) |
| [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [ScLink](../../ostis.jesc.memory.element.link/-sc-link/index.md) |
| [ScNode](../../ostis.jesc.memory.element.node/-sc-node/index.md) |
| [ScElementSet](../../ostis.jesc.memory.struct/-sc-element-set/index.md) |

## Types

| Name | Summary |
|---|---|
| [Edges](-edges/index.md) | [jvm]<br>interface [Edges](-edges/index.md) |
| [Relations](-relations/index.md) | [jvm]<br>interface [Relations](-relations/index.md) |

## Properties

| Name | Summary |
|---|---|
| [addr](addr.md) | [jvm]<br>abstract val [addr](addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](create-edge-from.md) | [jvm]<br>abstract fun [createEdgeFrom](create-edge-from.md)(source: [ScElement](index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](create-edge-to.md) | [jvm]<br>abstract fun [createEdgeTo](create-edge-to.md)(target: [ScElement](index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](delete.md) | [jvm]<br>abstract fun [delete](delete.md)() |
| [edges](edges.md) | [jvm]<br>abstract fun [edges](edges.md)(): [ScElement.Edges](-edges/index.md) |
| [relations](relations.md) | [jvm]<br>abstract fun [relations](relations.md)(): [ScElement.Relations](-relations/index.md) |
