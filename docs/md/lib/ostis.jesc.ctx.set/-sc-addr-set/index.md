//[lib](../../../index.md)/[ostis.jesc.ctx.set](../index.md)/[ScAddrSet](index.md)

# ScAddrSet

interface [ScAddrSet](index.md) : [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; 

#### Inheritors

| |
|---|
| [ScAddrSetImpl](../-sc-addr-set-impl/index.md) |

## Properties

| Name | Summary |
|---|---|
| [addr](addr.md) | [jvm]<br>abstract val [addr](addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [size](../../ostis.jesc.memory.struct/-sc-element-set/index.md#1578037672%2FProperties%2F1299105613) | [jvm]<br>abstract override val [size](../../ostis.jesc.memory.struct/-sc-element-set/index.md#1578037672%2FProperties%2F1299105613): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [add](index.md#-951429995%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [add](index.md#-951429995%2FFunctions%2F1299105613)(element: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [addAll](index.md#1084760770%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [addAll](index.md#1084760770%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clear](../../ostis.jesc.memory.struct/-sc-element-set/index.md#-767459876%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [clear](../../ostis.jesc.memory.struct/-sc-element-set/index.md#-767459876%2FFunctions%2F1299105613)() |
| [contains](index.md#-1100001517%2FFunctions%2F1299105613) | [jvm]<br>abstract operator override fun [contains](index.md#-1100001517%2FFunctions%2F1299105613)(element: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](index.md#-1195573824%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [containsAll](index.md#-1195573824%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](../-sc-addr-set-impl/index.md#-192670%2FFunctions%2F1299105613) | [jvm]<br>open fun [forEach](../-sc-addr-set-impl/index.md#-192670%2FFunctions%2F1299105613)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;) |
| [isEmpty](../../ostis.jesc.memory.struct/-sc-element-set/index.md#-477621106%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [isEmpty](../../ostis.jesc.memory.struct/-sc-element-set/index.md#-477621106%2FFunctions%2F1299105613)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](../../ostis.jesc.memory.struct/-sc-element-set/index.md#1565777859%2FFunctions%2F1299105613) | [jvm]<br>abstract operator override fun [iterator](../../ostis.jesc.memory.struct/-sc-element-set/index.md#1565777859%2FFunctions%2F1299105613)(): [MutableIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [parallelStream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1592339412%2FFunctions%2F1299105613) | [jvm]<br>open fun [parallelStream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1592339412%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [remove](index.md#147662352%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [remove](index.md#147662352%2FFunctions%2F1299105613)(element: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAll](index.md#5952893%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [removeAll](index.md#5952893%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeIf](../-sc-addr-set-impl/index.md#827251718%2FFunctions%2F1299105613) | [jvm]<br>open fun [removeIf](../-sc-addr-set-impl/index.md#827251718%2FFunctions%2F1299105613)(p0: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;in [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [retainAll](index.md#-629002690%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [retainAll](index.md#-629002690%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [spliterator](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-989466892%2FFunctions%2F1299105613) | [jvm]<br>open override fun [spliterator](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-989466892%2FFunctions%2F1299105613)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [stream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#135225651%2FFunctions%2F1299105613) | [jvm]<br>open fun [stream](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#135225651%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [toArray](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613) | [jvm]<br>open fun &lt;[T](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [~~toArray~~](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)(p0: [IntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntFunction.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)&gt;&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](../../ostis.jesc.memory.struct/-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)&gt; |
