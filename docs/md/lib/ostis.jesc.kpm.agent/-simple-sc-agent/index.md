//[lib](../../../index.md)/[ostis.jesc.kpm.agent](../index.md)/[SimpleScAgent](index.md)

# SimpleScAgent

abstract class [SimpleScAgent](index.md)(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md)) : [ScAgent](../-sc-agent/index.md)

#### Inheritors

| |
|---|
| [MySimpleAgent](../../[root]/-my-simple-agent/index.md) |
| [SimpleScCtxAgent](../../ostis.jesc.kpm/-simple-sc-ctx-agent/index.md) |

## Constructors

| | |
|---|---|
| [SimpleScAgent](-simple-sc-agent.md) | [jvm]<br>constructor(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [name](name.md) | [jvm]<br>open override val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [onEvent](on-event.md) | [jvm]<br>abstract fun [onEvent](on-event.md)(listenElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edge: [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md), otherElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)) |
| [trigger](trigger.md) | [jvm]<br>open override fun [trigger](trigger.md)(listenElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edge: [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md), otherElement: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)) |
