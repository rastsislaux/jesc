//[lib](../../../index.md)/[ostis.jesc.memory.element](../index.md)/[BaseScElement](index.md)

# BaseScElement

abstract class [BaseScElement](index.md)(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), val addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) : [ScElement](../-sc-element/index.md)

#### Inheritors

| |
|---|
| [ScEdgeImpl](../../ostis.jesc.memory.element.edge/-sc-edge-impl/index.md) |
| [ScLinkImpl](../../ostis.jesc.memory.element.link/-sc-link-impl/index.md) |
| [ScNodeImpl](../../ostis.jesc.memory.element.node/-sc-node-impl/index.md) |
| [ScElementSetImpl](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md) |

## Constructors

| | |
|---|---|
| [BaseScElement](-base-sc-element.md) | [jvm]<br>constructor(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [addr](addr.md) | [jvm]<br>open override val [addr](addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |

## Functions

| Name | Summary |
|---|---|
| [createEdgeFrom](create-edge-from.md) | [jvm]<br>open override fun [createEdgeFrom](create-edge-from.md)(source: [ScElement](../-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](create-edge-to.md) | [jvm]<br>open override fun [createEdgeTo](create-edge-to.md)(target: [ScElement](../-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](delete.md) | [jvm]<br>open override fun [delete](delete.md)() |
| [edges](edges.md) | [jvm]<br>open override fun [edges](edges.md)(): [ScElement.Edges](../-sc-element/-edges/index.md) |
| [relations](relations.md) | [jvm]<br>open override fun [relations](relations.md)(): [ScElement.Relations](../-sc-element/-relations/index.md) |
