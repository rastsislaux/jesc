//[lib](../../../index.md)/[ostis.jesc.kpm](../index.md)/[SimpleScCtxAgent](index.md)

# SimpleScCtxAgent

[jvm]\
abstract class [SimpleScCtxAgent](index.md)(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md)) : [SimpleScAgent](../../ostis.jesc.kpm.agent/-simple-sc-agent/index.md)

## Constructors

| | |
|---|---|
| [SimpleScCtxAgent](-simple-sc-ctx-agent.md) | [jvm]<br>constructor(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [name](../../ostis.jesc.kpm.agent/-simple-sc-agent/name.md) | [jvm]<br>open override val [name](../../ostis.jesc.kpm.agent/-simple-sc-agent/name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [onEvent](on-event.md) | [jvm]<br>abstract fun [onEvent](on-event.md)(listenAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), edgeAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), otherAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScResult](../-sc-result/index.md)<br>abstract fun [onEvent](../../ostis.jesc.kpm.agent/-simple-sc-agent/on-event.md)(listenElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edge: [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md), otherElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)) |
| [trigger](trigger.md) | [jvm]<br>override fun [trigger](trigger.md)(listenElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edge: [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md), otherElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)) |
