//[lib](../../../index.md)/[ostis.jesc.ctx](../index.md)/[ScCtx](index.md)

# ScCtx

interface [ScCtx](index.md) : [Closeable](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)

#### Inheritors

| |
|---|
| [ScCtxImpl](../-sc-ctx-impl/index.md) |

## Types

| Name | Summary |
|---|---|
| [Structs](-structs/index.md) | [jvm]<br>interface [Structs](-structs/index.md) |

## Properties

| Name | Summary |
|---|---|
| [api](api.md) | [jvm]<br>abstract val [api](api.md): [ScApi](../../ostis.jesc.api/-sc-api/index.md) |

## Functions

| Name | Summary |
|---|---|
| [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613) | [jvm]<br>abstract override fun [close](../../ostis.jesc.memory/-sc-memory/index.md#358956095%2FFunctions%2F1299105613)() |
| [createEdge](create-edge.md) | [jvm]<br>abstract fun [createEdge](create-edge.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), out: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), in: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [createEvent](create-event.md) | [jvm]<br>abstract fun [createEvent](create-event.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), eventType: [ScEventType](../../ostis.jesc.client.model.event/-sc-event-type/index.md)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [createLink](create-link.md) | [jvm]<br>abstract fun [createLink](create-link.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), content: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), contentType: [ScContentType](../../ostis.jesc.client.model.request.payload.entry/-sc-content-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [createNode](create-node.md) | [jvm]<br>abstract fun [createNode](create-node.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [delete](delete.md) | [jvm]<br>abstract fun [delete](delete.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |
| [findBySystemIdentifier](find-by-system-identifier.md) | [jvm]<br>abstract fun [findBySystemIdentifier](find-by-system-identifier.md)(idtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getElements](get-elements.md) | [jvm]<br>abstract fun [getElements](get-elements.md)(set: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getLinkContent](get-link-content.md) | [jvm]<br>abstract fun [getLinkContent](get-link-content.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScLinkContent](../../ostis.jesc.ctx.etc/-sc-link-content/index.md)? |
| [getMainIdentifier](get-main-identifier.md) | [jvm]<br>abstract fun [getMainIdentifier](get-main-identifier.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), lang: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [getNoRoleRelationSource](get-no-role-relation-source.md) | [jvm]<br>abstract fun [getNoRoleRelationSource](get-no-role-relation-source.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getNoRoleRelationSources](get-no-role-relation-sources.md) | [jvm]<br>abstract fun [getNoRoleRelationSources](get-no-role-relation-sources.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getNoRoleRelationTarget](get-no-role-relation-target.md) | [jvm]<br>abstract fun [getNoRoleRelationTarget](get-no-role-relation-target.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getNoRoleRelationTargets](get-no-role-relation-targets.md) | [jvm]<br>abstract fun [getNoRoleRelationTargets](get-no-role-relation-targets.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRelationSource](get-relation-source.md) | [jvm]<br>abstract fun [getRelationSource](get-relation-source.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRelationSources](get-relation-sources.md) | [jvm]<br>abstract fun [getRelationSources](get-relation-sources.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRelationTarget](get-relation-target.md) | [jvm]<br>abstract fun [getRelationTarget](get-relation-target.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRelationTargets](get-relation-targets.md) | [jvm]<br>abstract fun [getRelationTargets](get-relation-targets.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRoleRelationSource](get-role-relation-source.md) | [jvm]<br>abstract fun [getRoleRelationSource](get-role-relation-source.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRoleRelationSources](get-role-relation-sources.md) | [jvm]<br>abstract fun [getRoleRelationSources](get-role-relation-sources.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRoleRelationTarget](get-role-relation-target.md) | [jvm]<br>abstract fun [getRoleRelationTarget](get-role-relation-target.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRoleRelationTargets](get-role-relation-targets.md) | [jvm]<br>abstract fun [getRoleRelationTargets](get-role-relation-targets.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getSystemIdentifier](get-system-identifier.md) | [jvm]<br>abstract fun [getSystemIdentifier](get-system-identifier.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [getType](get-type.md) | [jvm]<br>abstract fun [getType](get-type.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md) |
| [resolveBySystemIdentifier](resolve-by-system-identifier.md) | [jvm]<br>abstract fun [resolveBySystemIdentifier](resolve-by-system-identifier.md)(idtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [setLinkContent](set-link-content.md) | [jvm]<br>abstract fun [setLinkContent](set-link-content.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), content: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), contentType: [ScContentType](../../ostis.jesc.client.model.request.payload.entry/-sc-content-type/index.md)) |
| [structs](structs.md) | [jvm]<br>abstract fun [structs](structs.md)(): [ScCtx.Structs](-structs/index.md) |
