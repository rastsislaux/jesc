//[lib](../../../index.md)/[ostis.jesc.ctx](../index.md)/[ScCtxImpl](index.md)

# ScCtxImpl

[jvm]\
class [ScCtxImpl](index.md)(val api: [ScApi](../../ostis.jesc.api/-sc-api/index.md)) : [ScCtx](../-sc-ctx/index.md)

## Constructors

| | |
|---|---|
| [ScCtxImpl](-sc-ctx-impl.md) | [jvm]<br>constructor(api: [ScApi](../../ostis.jesc.api/-sc-api/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [api](api.md) | [jvm]<br>open override val [api](api.md): [ScApi](../../ostis.jesc.api/-sc-api/index.md) |

## Functions

| Name | Summary |
|---|---|
| [close](close.md) | [jvm]<br>open override fun [close](close.md)() |
| [createEdge](create-edge.md) | [jvm]<br>open override fun [createEdge](create-edge.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), out: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), in: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [createEvent](create-event.md) | [jvm]<br>open override fun [createEvent](create-event.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), eventType: [ScEventType](../../ostis.jesc.client.model.event/-sc-event-type/index.md)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [createLink](create-link.md) | [jvm]<br>open override fun [createLink](create-link.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md), content: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), contentType: [ScContentType](../../ostis.jesc.client.model.request.payload.entry/-sc-content-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [createNode](create-node.md) | [jvm]<br>open override fun [createNode](create-node.md)(type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [delete](delete.md) | [jvm]<br>open override fun [delete](delete.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)) |
| [findBySystemIdentifier](find-by-system-identifier.md) | [jvm]<br>open override fun [findBySystemIdentifier](find-by-system-identifier.md)(idtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getElements](get-elements.md) | [jvm]<br>open override fun [getElements](get-elements.md)(set: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getLinkContent](get-link-content.md) | [jvm]<br>open override fun [getLinkContent](get-link-content.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScLinkContent](../../ostis.jesc.ctx.etc/-sc-link-content/index.md)? |
| [getMainIdentifier](get-main-identifier.md) | [jvm]<br>open override fun [getMainIdentifier](get-main-identifier.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), lang: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [getNoRoleRelationSource](get-no-role-relation-source.md) | [jvm]<br>open override fun [getNoRoleRelationSource](get-no-role-relation-source.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getNoRoleRelationSources](get-no-role-relation-sources.md) | [jvm]<br>open override fun [getNoRoleRelationSources](get-no-role-relation-sources.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getNoRoleRelationTarget](get-no-role-relation-target.md) | [jvm]<br>open override fun [getNoRoleRelationTarget](get-no-role-relation-target.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getNoRoleRelationTargets](get-no-role-relation-targets.md) | [jvm]<br>open override fun [getNoRoleRelationTargets](get-no-role-relation-targets.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), nrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRelationSource](get-relation-source.md) | [jvm]<br>open override fun [getRelationSource](get-relation-source.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRelationSources](get-relation-sources.md) | [jvm]<br>open override fun [getRelationSources](get-relation-sources.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRelationTarget](get-relation-target.md) | [jvm]<br>open override fun [getRelationTarget](get-relation-target.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRelationTargets](get-relation-targets.md) | [jvm]<br>open override fun [getRelationTargets](get-relation-targets.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), relType: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRoleRelationSource](get-role-relation-source.md) | [jvm]<br>open override fun [getRoleRelationSource](get-role-relation-source.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRoleRelationSources](get-role-relation-sources.md) | [jvm]<br>open override fun [getRoleRelationSources](get-role-relation-sources.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getRoleRelationTarget](get-role-relation-target.md) | [jvm]<br>open override fun [getRoleRelationTarget](get-role-relation-target.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)? |
| [getRoleRelationTargets](get-role-relation-targets.md) | [jvm]<br>open override fun [getRoleRelationTargets](get-role-relation-targets.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), rrelAddr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)&gt; |
| [getSystemIdentifier](get-system-identifier.md) | [jvm]<br>open override fun [getSystemIdentifier](get-system-identifier.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [getType](get-type.md) | [jvm]<br>open override fun [getType](get-type.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md)): [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md) |
| [resolveBySystemIdentifier](resolve-by-system-identifier.md) | [jvm]<br>open override fun [resolveBySystemIdentifier](resolve-by-system-identifier.md)(idtf: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [ScType](../../ostis.jesc.client.model.type/-sc-type/index.md)): [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md) |
| [setLinkContent](set-link-content.md) | [jvm]<br>open override fun [setLinkContent](set-link-content.md)(addr: [ScAddr](../../ostis.jesc.client.model.addr/-sc-addr/index.md), content: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), contentType: [ScContentType](../../ostis.jesc.client.model.request.payload.entry/-sc-content-type/index.md)) |
| [structs](structs.md) | [jvm]<br>open override fun [structs](structs.md)(): [ScCtx.Structs](../-sc-ctx/-structs/index.md) |
