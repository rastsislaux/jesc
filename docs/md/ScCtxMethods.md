## findBySystemIdentifier(idtf: String): Optional<ScAddr\>

---

Find an element by its system identifier. Basically, it is a search for a following template:

<pre style="border: 1px solid; padding: 10px;">
( ) ===> [System Identifier]
     ⌃
     |
(nrel_system_identifier)
</pre>

Example:

Kotlin:
```kotlin
val e = ctx.findBySystemIdentifier("some_identifier").get()
println(e) // ScAddrImpl[...]
```
Java:
```java
ScAddr e = ctx.findBySystemIdentifier("some_identifier").get();
System.out.println(e); // ScAddrImpl[...]
```

## resolveBySystemIdentifier(idtf: String, type: ScType): ScAddr

---

Find an element by system identifier. If it doesn't exist, create it. Basically, it
searches for a following template, and, if not found, creates it:

<pre style="border: 1px solid; padding: 10px;">
( ) ===> [System Identifier]
     ⌃
     |
(nrel_system_identifier)
</pre>

Example:

Kotlin:
```kotlin
val e = ctx.resolveBySystemIdentifier("some_node", ScType.NODE_CONST)
println(e) // ScAddrImpl[...]
```

Java
```java
ScAddr e = ctx.resolveBySystemIdentifier("some_node", ScType.NODE_CONST);
System.out.println(e); // ScAddrImpl[...]
```

## createNode(type: ScType): ScAddr

---

Creates a node.

Example:

Kotlin:
```kotlin
val n = ctx.createNode(ScType.NODE_CONST) // e = ScAddrImpl[...]
```

Java:
```java
ScAddr n = ctx.createNode(ScType.NODE_CONST) // e = ScAddrImpl[...]
```

## createEdge(type: ScType, out: ScAddr, `in`: ScAddr): ScAddr

---

!!! info
    This method is yet to be documented. TODO!


## createEvent(addr: ScAddr, eventType: ScEventType): Long

---

!!! info
    This method is yet to be documented. TODO!

## getLinkContent(addr: ScAddr): ScLinkContent

---

!!! info
    This method is yet to be documented. TODO!

## getSystemIdentifier(addr: ScAddr): String

---

!!! info
    This method is yet to be documented. TODO!

## getMainIdentifier(addr: ScAddr, lang: String): String?

---

!!! info
    This method is yet to be documented. TODO!

## getRelationTargets(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr>

---

!!! info
    This method is yet to be documented. TODO!

## getRelationSources(addr: ScAddr, relAddr: ScAddr, relType: ScType): List<ScAddr>

---

!!! info
    This method is yet to be documented. TODO!

## getRelationTarget(addr: ScAddr, relAddr: ScAddr, relType: ScType): ScAddr

---

!!! info
    This method is yet to be documented. TODO!

## getRelationSource(addr: ScAddr, relAddr: ScAddr, relType: ScType): ScAddr

---

!!! info
    This method is yet to be documented. TODO!

## getRoleRelationTargets(addr: ScAddr, rrelAddr: ScAddr): List<ScAddr>

---

!!! info
    This method is yet to be documented. TODO!

## getRoleRelationSources(addr: ScAddr, rrelAddr: ScAddr): List<ScAddr>

---

!!! info
    This method is yet to be documented. TODO!

## getRoleRelationTarget(addr: ScAddr, rrelAddr: ScAddr): ScAddr

---

!!! info
    This method is yet to be documented. TODO!

## getRoleRelationSource(addr: ScAddr, rrelAddr: ScAddr): ScAddr

---

!!! info
    This method is yet to be documented. TODO!

## getNoRoleRelationTargets(addr: ScAddr, nrelAddr: ScAddr): List<ScAddr>

---

!!! info
    This method is yet to be documented. TODO!

## getNoRoleRelationSources(addr: ScAddr, nrelAddr: ScAddr): List<ScAddr>

---

!!! info
    This method is yet to be documented. TODO!

## getNoRoleRelationTarget(addr: ScAddr, nrelAddr: ScAddr): ScAddr

---

!!! info
    This method is yet to be documented. TODO!

## getNoRoleRelationSource(addr: ScAddr, nrelAddr: ScAddr): ScAddr

---

!!! info
    This method is yet to be documented. TODO!

## createLink(type: ScType, content: Any, contentType: ScContentType): ScAddr

---

!!! info
    This method is yet to be documented. TODO!

## getElements(set: ScAddr): List<ScAddr\>

---

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