# Project JESC

JESC is a Kotlin library that provides a convenient and easy-to-use 
interface for working with the SC machine.

# Usage example

For some simple actions upon knowledge base, you can directly instantiate ScCtx object.
In order to handle the connection correctly automatically, use `use` extension function in Kotlin
or `try-with-resources` syntax in Java.

Kotlin example:
```kotlin
JESC.makeCtx("localhost", 8090).use { ctx ->
    // Retrieve the system identifier for the "nrel_main_idtf" node
    val nrelMainIdtf = ctx.findBySystemIdentifier("nrel_main_idtf").get()

    // Retrieve the address of the "some_node" node or throw an exception if it is not found
    val someNodeAddr = ctx.findBySystemIdentifier("some_node").orElseThrow { IllegalStateException("Not found.") }

    // Get all targets of the no-role relation from the "some_node" node
    ctx.getNoRoleRelationTargets(someNodeAddr, nrelMainIdtf)
        .map { ctx.getLinkContent(it).string() }
        .forEach { println(it) }
    // Print all main identifiers for the "some_node" node
}
```

Java example:
```java
try (ScCtx ctx = JESC.INSTANCE.makeCtx("localhost", 8090)) {
    ScAddr nrelMainIdtf = ctx.findBySystemIdentifier("nrel_main_idtf").get();
    ScAddr someNode = ctx.findBySystemIdentifier("nrel_main_idtf").get();

    ctx.getNoRoleRelationTargets(someNode, nrelMainIdtf).stream()
            .map(it -> ctx.getLinkContent(it).string())
            .forEach(System.out::println);
}
```

If Context doesn't provide you with needed functionality, you can go a level deeper
and user `ScApi`, which is what `ScCtxImpl` uses internally.

The most common use-case for direct interaction with `ScApi` is template-based search:

```kotlin
ctx.api.searchByTemplate()
    .triplet(
        ScRef.addr(someNodeAddr),
        ScRef.type(ScType.EDGE_ACCESS_VAR_POS_PERM),
        ScRef.type(ScType.VAR)
    )
    .execute()
    .payload!!
    .addrs
    .map { it[2] }
    .map { ctx.getSystemIdentifier(it) }
    .forEach { println(it) }
```

If you're building a full-fledged system you may be interested
in knowledge-processing capabilities of JESC. The library provides an API
to process knowledge in agent-oriented manner.

We'll need to create some kind of agent and a factory for that agent:
```kotlin
class MyAgent(ctx: ScCtx): ScAgent(ctx) {
    
    override fun onEvent(listenAddr: ScAddr, edgeAddr: ScAddr, otherAddr: ScAddr) {
        // ctx is available inside agents
        ctx.api.createElements()
            .link(ScType.LINK_CONST, "Some content", ScContentType.STRING)
            .execute()
        return ScResult.OK
    }

}
```

Now we can register out factory within the server:

```kotlin
JESC.makeServer("localhost", 8090).apply {
    registerAgent ("some_node", ScEventType.ADD_OUTGOING_EDGE) { MyAgent(it) }
}
```


# Documentation

For now, documentation is TBD. Feel free to contribute!

# Acknowledgements

JESC was insipred by and build upon SC machine.

# Author

Currently, JESC is developed and maintained by [Rastsislau Lipski](https://github.com/rastsislaux). 
For questions or inquiries, please contact [rostislav.lipsky@gmail.com](mailto:rostislav.lipsky@gmail.com).

# References

- Current documentation for sc-machine (for some reason doesn't include websocket api reference): https://ostis-ai.github.io/sc-machine
- Old documentation for sc-machine: https://ostis-dev.github.io/sc-machine
