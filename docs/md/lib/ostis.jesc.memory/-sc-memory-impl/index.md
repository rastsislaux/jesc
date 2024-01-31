//[lib](../../../index.md)/[ostis.jesc.memory](../index.md)/[ScMemoryImpl](index.md)

# ScMemoryImpl

[jvm]\
class [ScMemoryImpl](index.md)(val ctx: [ScCtx](../../ostis.jesc.ctx/-sc-ctx/index.md)) : [ScMemory](../-sc-memory/index.md)

## Constructors

| | |
|---|---|
| [ScMemoryImpl](-sc-memory-impl.md) | [jvm]<br>constructor(ctx: [ScCtx](../../ostis.jesc.ctx/-sc-ctx/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [ctx](ctx.md) | [jvm]<br>open override val [ctx](ctx.md): [ScCtx](../../ostis.jesc.ctx/-sc-ctx/index.md) |

## Functions

| Name | Summary |
|---|---|
| [close](close.md) | [jvm]<br>open override fun [close](close.md)() |
| [find](find.md) | [jvm]<br>open override fun [find](find.md)(template: [ScTemplate](../../ostis.jesc.memory.template/-sc-template/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;&gt; |
| [get](get.md) | [jvm]<br>open override fun [get](get.md)(): [ScMemory.Getters](../-sc-memory/-getters/index.md) |
| [new](new.md) | [jvm]<br>open override fun [new](new.md)(): [ScMemory.Constructors](../-sc-memory/-constructors/index.md) |
| [structs](structs.md) | [jvm]<br>open override fun [structs](structs.md)(): [ScMemory.Structs](../-sc-memory/-structs/index.md) |
