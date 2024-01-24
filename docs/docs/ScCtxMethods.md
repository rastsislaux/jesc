# fun findBySystemIdentifier(idtf: String): Optional<ScAddr>
# fun resolveBySystemIdentifier(idtf: String, type: ScType): ScAddr
# fun createNode(type: ScType): ScAddr
# fun createEdge(type: ScType, out: ScAddr, `in`: ScAddr): ScAddr
# fun createEvent(addr: ScAddr, eventType: ScEventType): Long
# fun getLinkContent(addr: ScAddr): ScLinkContent
# fun getSystemIdentifier(addr: ScAddr): String
# fun getMainIdentifier(addr: ScAddr, lang: String): String?
# fun getRelationTargets(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr>
# fun getRelationSources(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr>
# fun getRelationTarget(addr: ScAddr, relAddr: ScAddr, relType: ScType): ScAddr
# fun getRelationSource(addr: ScAddr, relAddr: ScAddr, relType: ScType): ScAddr
# fun getRoleRelationTargets(addr: ScAddr, rrelAddr: ScAddr): List<ScAddr>
# fun getRoleRelationSources(addr: ScAddr, rrelAddr: ScAddr): List<ScAddr>
# fun getRoleRelationTarget(addr: ScAddr, rrelAddr: ScAddr): ScAddr
# fun getRoleRelationSource(addr: ScAddr, rrelAddr: ScAddr): ScAddr
# fun getNoRoleRelationTargets(addr: ScAddr, nrelAddr: ScAddr): List<ScAddr>
# fun getNoRoleRelationSources(addr: ScAddr, nrelAddr: ScAddr): List<ScAddr>
# fun getNoRoleRelationTarget(addr: ScAddr, nrelAddr: ScAddr): ScAddr
# fun getNoRoleRelationSource(addr: ScAddr, nrelAddr: ScAddr): ScAddr
# fun createLink(type: ScType, content: Any, contentType: ScContentType): ScAddr

# fun getElements(set: ScAddr): List<ScAddr\>

Get all elements that belong to a set with specified address. An element belongs to
a set if it has EDGE_ACCESS_CONST_POS_PERM (simple accessory edge) relation from `set` to it.

E.g., given, there's a structure in the memory like that:
<pre style="border: 1px solid; padding: 10px;">
(293) <-- (set) --> (101)
</pre>

```kotlin
val elements = ctx.getElements(ctx.findBySystemIdentifier("some_set").get())
println(elements) // [ScAddrImpl[101], ScAddrImpl[293]]
```