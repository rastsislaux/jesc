# Context (ScCtx)

Main abstraction that the user would work with is ScCtx (context).
Context is an interface that defines a number of utility method to work with
SC Memory. There some ways to instantiate a context:

Kotlin:
```kotlin
val scWebSocketClient = ScWebSocketClientImpl(URI("ws://localhost:8090/ws_json"))
val scClient = ScClientImpl(scWebSocketClient)
val scApi = ScApiImpl(scClient)
val scCtx = ScCtxImpl(scApi)
```

Java:
```java
ScWebSocketClient scWebSocketClient = new ScWebsSocketClientImpl(new URI("ws://localhost:8090/ws_json"));
ScClient scClient = new ScClientImpl(scWebSocketClient);
ScApi scApi = new ScApiImpl(scClient);
ScCtx ctx = new ScCtxImpl(scApi);
```

To get rid of this boilerplate code, you can use JESC utility object:

```kotlin
val ctx = JESC.makeCtx(host="localhost", port=8090)
```

```java
ScCtx ctx = JESC.makeCtx("localhost", 8090)
```

Instantiating this object creates a WebSocket connection with SC-machine which shall be
handled correctly. ScCtx supports use extensionfunction (Kotlin) and try-with-resources statement (Java):

Kotlin:
```kotlin
JESC.makeCtx("localhost", 8090).use {
    // do your stuff
}
// Connection closed automatically.
```

Java:
```java
try (var ctx = JESC.INSTANCE.makeCtx("localhost", 8090)) {
    // do your stuff    
}
// Connection closed automatically. 
```