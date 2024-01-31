//[lib](../../../index.md)/[ostis.jesc.memory.struct](../index.md)/[ScElementSetImpl](index.md)

# ScElementSetImpl

[jvm]\
class [ScElementSetImpl](index.md)(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), val element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)) : [BaseScElement](../../ostis.jesc.memory.element/-base-sc-element/index.md), [ScElementSet](../-sc-element-set/index.md)

## Constructors

| | |
|---|---|
| [ScElementSetImpl](-sc-element-set-impl.md) | [jvm]<br>constructor(memory: [ScMemory](../../ostis.jesc.memory/-sc-memory/index.md), element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md) | [jvm]<br>open override val [addr](../../ostis.jesc.memory.element/-base-sc-element/addr.md): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [element](element.md) | [jvm]<br>open override val [element](element.md): [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md) |
| [size](size.md) | [jvm]<br>open override val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>open override fun [add](add.md)(element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [addAll](add-all.md) | [jvm]<br>open override fun [addAll](add-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clear](clear.md) | [jvm]<br>open override fun [clear](clear.md)() |
| [contains](contains.md) | [jvm]<br>open operator override fun [contains](contains.md)(element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](contains-all.md) | [jvm]<br>open override fun [containsAll](contains-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md) | [jvm]<br>open override fun [createEdgeFrom](../../ostis.jesc.memory.element/-base-sc-element/create-edge-from.md)(source: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md) | [jvm]<br>open override fun [createEdgeTo](../../ostis.jesc.memory.element/-base-sc-element/create-edge-to.md)(target: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md), edgeType: [ScEdgeType](../../ostis.jesc.memory.element.edge/-sc-edge-type/index.md)): [ScEdge](../../ostis.jesc.memory.element.edge/-sc-edge/index.md) |
| [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md) | [jvm]<br>open override fun [delete](../../ostis.jesc.memory.element/-base-sc-element/delete.md)() |
| [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md) | [jvm]<br>open override fun [edges](../../ostis.jesc.memory.element/-base-sc-element/edges.md)(): [ScElement.Edges](../../ostis.jesc.memory.element/-sc-element/-edges/index.md) |
| [forEach](index.md#-723562439%2FFunctions%2F1299105613) | [jvm]<br>open fun [forEach](index.md#-723562439%2FFunctions%2F1299105613)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;) |
| [isEmpty](is-empty.md) | [jvm]<br>open override fun [isEmpty](is-empty.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](iterator.md) | [jvm]<br>open operator override fun [iterator](iterator.md)(): [MutableIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [parallelStream](index.md#-1592339412%2FFunctions%2F1299105613) | [jvm]<br>open fun [parallelStream](index.md#-1592339412%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md) | [jvm]<br>open override fun [relations](../../ostis.jesc.memory.element/-base-sc-element/relations.md)(): [ScElement.Relations](../../ostis.jesc.memory.element/-sc-element/-relations/index.md) |
| [remove](remove.md) | [jvm]<br>open override fun [remove](remove.md)(element: [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAll](remove-all.md) | [jvm]<br>open override fun [removeAll](remove-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeIf](index.md#103881949%2FFunctions%2F1299105613) | [jvm]<br>open fun [removeIf](index.md#103881949%2FFunctions%2F1299105613)(p0: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;in [ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [retainAll](retain-all.md) | [jvm]<br>open override fun [retainAll](retain-all.md)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [spliterator](index.md#-989466892%2FFunctions%2F1299105613) | [jvm]<br>open override fun [spliterator](index.md#-989466892%2FFunctions%2F1299105613)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [stream](index.md#135225651%2FFunctions%2F1299105613) | [jvm]<br>open fun [stream](index.md#135225651%2FFunctions%2F1299105613)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[ScElement](../../ostis.jesc.memory.element/-sc-element/index.md)&gt; |
| [toArray](index.md#-1215154575%2FFunctions%2F1299105613) | [jvm]<br>open fun &lt;[T](index.md#-1215154575%2FFunctions%2F1299105613) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [~~toArray~~](index.md#-1215154575%2FFunctions%2F1299105613)(p0: [IntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntFunction.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](index.md#-1215154575%2FFunctions%2F1299105613)&gt;&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](index.md#-1215154575%2FFunctions%2F1299105613)&gt; |
