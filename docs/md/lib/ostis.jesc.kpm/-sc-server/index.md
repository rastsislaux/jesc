//[lib](../../../index.md)/[ostis.jesc.kpm](../index.md)/[ScServer](index.md)

# ScServer

interface [ScServer](index.md) : [Closeable](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)

#### Inheritors

| |
|---|
| [ScServerImpl](../-sc-server-impl/index.md) |

## Functions

| Name | Summary |
|---|---|
| [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613)() |
| [registerAgent](register-agent.md) | [jvm]<br>abstract fun [registerAgent](register-agent.md)(idtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), eventType: [ScEventType](../../ostis.jesc.client.model.event/-sc-event-type/index.md), factory: [ScAgentFactory](../../ostis.jesc.kpm.agent/-sc-agent-factory/index.md)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>abstract fun [registerAgent](register-agent.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), eventType: [ScEventType](../../ostis.jesc.client.model.event/-sc-event-type/index.md), factory: [ScAgentFactory](../../ostis.jesc.kpm.agent/-sc-agent-factory/index.md)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
