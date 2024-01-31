//[lib](../../../index.md)/[ostis.jesc.memory](../index.md)/[ScMemory](index.md)

# ScMemory

interface [ScMemory](index.md) : [Closeable](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)

#### Inheritors

| |
|---|
| [ScMemoryImpl](../-sc-memory-impl/index.md) |

## Types

| Name | Summary |
|---|---|
| [Constructors](-constructors/index.md) | [jvm]<br>interface [Constructors](-constructors/index.md) |
| [Getters](-getters/index.md) | [jvm]<br>interface [Getters](-getters/index.md) |
| [Structs](-structs/index.md) | [jvm]<br>interface [Structs](-structs/index.md) |

## Properties

| Name | Summary |
|---|---|
| [ctx](ctx.md) | [jvm]<br>abstract val [ctx](ctx.md): [ScCtx](../../ostis.jesc.ctx/-sc-ctx/index.md) |

## Functions

| Name | Summary |
|---|---|
| [close](index.md#358956095%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [close](index.md#358956095%2FFunctions%2F1299105613)() |
| [find](find.md) | [jvm]<br>abstract fun [find](find.md)(template: [ScTemplate](../../ostis.jesc.memory.template/-sc-template/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;&gt; |
| [get](get.md) | [jvm]<br>abstract fun [get](get.md)(): [ScMemory.Getters](-getters/index.md) |
| [new](new.md) | [jvm]<br>abstract fun [new](new.md)(): [ScMemory.Constructors](-constructors/index.md) |
| [structs](structs.md) | [jvm]<br>abstract fun [structs](structs.md)(): [ScMemory.Structs](-structs/index.md) |
