//[lib](../../../index.md)/[ostis.jesc.client](../index.md)/[ScException](index.md)

# ScException

[jvm]\
class [ScException](index.md)(msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [RuntimeException](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)

## Constructors

| | |
|---|---|
| [ScException](-sc-exception.md) | [jvm]<br>constructor(msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [cause](../../ostis.jesc.memory/-sc-memory-exception/index.md#-654012527%2FProperties%2F1299105613) | [jvm]<br>open val [cause](../../ostis.jesc.memory/-sc-memory-exception/index.md#-654012527%2FProperties%2F1299105613): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](../../ostis.jesc.memory/-sc-memory-exception/index.md#1824300659%2FProperties%2F1299105613) | [jvm]<br>open val [message](../../ostis.jesc.memory/-sc-memory-exception/index.md#1824300659%2FProperties%2F1299105613): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](../../ostis.jesc.memory/-sc-memory-exception/index.md#282858770%2FFunctions%2F1299105613) | [jvm]<br>fun [addSuppressed](../../ostis.jesc.memory/-sc-memory-exception/index.md#282858770%2FFunctions%2F1299105613)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#-1102069925%2FFunctions%2F1299105613) | [jvm]<br>open fun [fillInStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#-1102069925%2FFunctions%2F1299105613)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](../../ostis.jesc.memory/-sc-memory-exception/index.md#1043865560%2FFunctions%2F1299105613) | [jvm]<br>open fun [getLocalizedMessage](../../ostis.jesc.memory/-sc-memory-exception/index.md#1043865560%2FFunctions%2F1299105613)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#2050903719%2FFunctions%2F1299105613) | [jvm]<br>open fun [getStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#2050903719%2FFunctions%2F1299105613)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](../../ostis.jesc.memory/-sc-memory-exception/index.md#672492560%2FFunctions%2F1299105613) | [jvm]<br>fun [getSuppressed](../../ostis.jesc.memory/-sc-memory-exception/index.md#672492560%2FFunctions%2F1299105613)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](../../ostis.jesc.memory/-sc-memory-exception/index.md#-418225042%2FFunctions%2F1299105613) | [jvm]<br>open fun [initCause](../../ostis.jesc.memory/-sc-memory-exception/index.md#-418225042%2FFunctions%2F1299105613)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [printStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#-1769529168%2FFunctions%2F1299105613) | [jvm]<br>open fun [printStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#-1769529168%2FFunctions%2F1299105613)()<br>open fun [printStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#1841853697%2FFunctions%2F1299105613)(p0: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html))<br>open fun [printStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#1175535278%2FFunctions%2F1299105613)(p0: [PrintWriter](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html)) |
| [setStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#2135801318%2FFunctions%2F1299105613) | [jvm]<br>open fun [setStackTrace](../../ostis.jesc.memory/-sc-memory-exception/index.md#2135801318%2FFunctions%2F1299105613)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt;) |
