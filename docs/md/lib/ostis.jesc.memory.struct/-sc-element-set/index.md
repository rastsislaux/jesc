//[lib](../../../index.md)/[ostis.jesc.memory.struct](../index.md)/[ScElementSet](index.md)

# ScElementSet

interface [ScElementSet](index.md) : [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; 

#### Inheritors

| |
|---|
| [ScElementSetImpl](../-sc-element-set-impl/index.md) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-sc-element/addr.md) | [jvm]<br>abstract val [addr](../../ostis.jesc.memory.element/-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [element](element.md) | [jvm]<br>abstract val [element](element.md): [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md) |
| [size](index.md#1578037672%2FProperties%2F1299105613) | [jvm]<br>abstract override val [size](index.md#1578037672%2FProperties%2F1299105613): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [add](index.md#826350814%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [add](index.md#826350814%2FFunctions%2F1299105613)(element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [addAll](index.md#361391001%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [addAll](index.md#361391001%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clear](index.md#-767459876%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [clear](index.md#-767459876%2FFunctions%2F1299105613)() |
| [contains](index.md#677779292%2FFunctions%2F1299105613) | [jvm]<br>abstract operator override fun [contains](index.md#677779292%2FFunctions%2F1299105613)(element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](index.md#-1918943593%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [containsAll](index.md#-1918943593%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md) | [jvm]<br>abstract fun [createEdgeFrom](../../ostis.jesc.memory.element/-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md) | [jvm]<br>abstract fun [createEdgeTo](../../ostis.jesc.memory.element/-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](../../ostis.jesc.memory.element/-sc-element/delete.md) | [jvm]<br>abstract fun [delete](../../ostis.jesc.memory.element/-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-sc-element/edges.md) | [jvm]<br>abstract fun [edges](../../ostis.jesc.memory.element/-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [forEach](../-sc-element-set-impl/index.md#-723562439%2FFunctions%2F1299105613) | [jvm]<br>open fun [forEach](../-sc-element-set-impl/index.md#-723562439%2FFunctions%2F1299105613)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;) |
| [isEmpty](index.md#-477621106%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [isEmpty](index.md#-477621106%2FFunctions%2F1299105613)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](index.md#1565777859%2FFunctions%2F1299105613) | [jvm]<br>abstract operator override fun [iterator](index.md#1565777859%2FFunctions%2F1299105613)(): [MutableIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [parallelStream](../-sc-element-set-impl/index.md#-1592339412%2FFunctions%2F1299105613) | [jvm]<br>open fun [parallelStream](../-sc-element-set-impl/index.md#-1592339412%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [relations](../../ostis.jesc.memory.element/-sc-element/relations.md) | [jvm]<br>abstract fun [relations](../../ostis.jesc.memory.element/-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
| [remove](index.md#1925443161%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [remove](index.md#1925443161%2FFunctions%2F1299105613)(element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAll](index.md#-717416876%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [removeAll](index.md#-717416876%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeIf](../-sc-element-set-impl/index.md#103881949%2FFunctions%2F1299105613) | [jvm]<br>open fun [removeIf](../-sc-element-set-impl/index.md#103881949%2FFunctions%2F1299105613)(p0: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;in [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [retainAll](index.md#-1352372459%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [retainAll](index.md#-1352372459%2FFunctions%2F1299105613)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [spliterator](../-sc-element-set-impl/index.md#-989466892%2FFunctions%2F1299105613) | [jvm]<br>open override fun [spliterator](../-sc-element-set-impl/index.md#-989466892%2FFunctions%2F1299105613)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [stream](../-sc-element-set-impl/index.md#135225651%2FFunctions%2F1299105613) | [jvm]<br>open fun [stream](../-sc-element-set-impl/index.md#135225651%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [toArray](../-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613) | [jvm]<br>open fun &lt;[T](../-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [~~toArray~~](../-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)(p0: [IntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntFunction.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](../-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)&gt;&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](../-sc-element-set-impl/index.md#-1215154575%2FFunctions%2F1299105613)&gt; |
