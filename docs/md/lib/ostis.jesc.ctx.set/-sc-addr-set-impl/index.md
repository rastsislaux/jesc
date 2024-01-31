//[lib](../../../index.md)/[ostis.jesc.ctx.set](../index.md)/[ScAddrSetImpl](index.md)

# ScAddrSetImpl

[jvm]\
class [ScAddrSetImpl](index.md)(val ctx: [ScCtx](../../ostis.jesc.ctx/-sc-ctx/index.md), val addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) : [ScAddrSet](../-sc-addr-set/index.md)

## Constructors

| | |
|---|---|
| [ScAddrSetImpl](-sc-addr-set-impl.md) | [jvm]<br>constructor(ctx: [ScCtx](../../ostis.jesc.ctx/-sc-ctx/index.md), addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [addr](addr.md) | [jvm]<br>open override val [addr](addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [ctx](ctx.md) | [jvm]<br>val [ctx](ctx.md): [ScCtx](../../ostis.jesc.ctx/-sc-ctx/index.md) |
| [size](size.md) | [jvm]<br>open override val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>open override fun [add](add.md)(element: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [addAll](add-all.md) | [jvm]<br>open override fun [addAll](add-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clear](clear.md) | [jvm]<br>open override fun [clear](clear.md)() |
| [contains](contains.md) | [jvm]<br>open operator override fun [contains](contains.md)(element: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](contains-all.md) | [jvm]<br>open override fun [containsAll](contains-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](index.md#-192670%2FFunctions%2F1299105613) | [jvm]<br>open fun [forEach](index.md#-192670%2FFunctions%2F1299105613)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;) |
| [isEmpty](is-empty.md) | [jvm]<br>open override fun [isEmpty](is-empty.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](iterator.md) | [jvm]<br>open operator override fun [iterator](iterator.md)(): [MutableIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [parallelStream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1592339412%2FFunctions%2F1299105613) | [jvm]<br>open fun [parallelStream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1592339412%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [remove](remove.md) | [jvm]<br>open override fun [remove](remove.md)(element: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAll](remove-all.md) | [jvm]<br>open override fun [removeAll](remove-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeIf](index.md#827251718%2FFunctions%2F1299105613) | [jvm]<br>open fun [removeIf](index.md#827251718%2FFunctions%2F1299105613)(p0: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;in [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [retainAll](retain-all.md) | [jvm]<br>open override fun [retainAll](retain-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [spliterator](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-989466892%2FFunctions%2F1299105613) | [jvm]<br>open override fun [spliterator](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-989466892%2FFunctions%2F1299105613)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [stream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#135225651%2FFunctions%2F1299105613) | [jvm]<br>open fun [stream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#135225651%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [toArray](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613) | [jvm]<br>open fun &lt;[T](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [~~toArray~~](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)(p0: [IntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntFunction.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)&gt;&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)&gt; |
