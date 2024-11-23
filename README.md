# paper-utils
A collection of small utility classes for easier Minecraft Paper plugin development 

# Installation
Most utilities use the plugin instance, therefore it is required to initialize the `Plugin` utility class by running the method `init()` and passing the plugin instance. 
It should be called within the `onEnable` method, preferably at the very top. That way, all other utility classes would have access to the plugin instance and therefore work correctly.

```java
@Override
public void onEnable() {
   Plugin.init(this);
}
```
Note that once initialized, the Plugin utility class can not be reinitialized to prevent overriding of the plugin instance.

# Usage

## Plugin
```java
Plugin.getPlugin().getServer()...; // Do something with the plugin instance
```

## Logger
```java
Logger.log("Here is my simple log message. By default it's a level of INFO, but it can be specified.");
Logger.log("Something went wrong", Level.SEVERE);
```

## Scheduler

The scheduler is used to delay or repeatedly execute a task. It's heavily inspired by the JavaScript setTimeout and setInterval functions, therefore the accepted time is in miliseconds.
```java
onCooldown = true;
Scheduler.setTimeout(() -> onCooldown = false, 500);
```

```java
Scheduler.setInterval(task -> {
   Logger.log("This should run every second!");
}, 1000);
```

## DataStore

The DataStore is a wrapper around Paper's [Persistent Data Container (PDC)](https://docs.papermc.io/paper/dev/pdc) which allows data to be stored for a whole range of objects, such as items, entities, and block entities.
The data persists between server restarts and reloads, so this method is very useful.
```java
DataStore.setData(entity, "my-key", PersistentDataType.STRING, "example-value"); // Sets a key-value pair with the key being "my-key" and the value being a string "example-value".
String data = DataStore.getData(cow, "my-key", PersistentDataType.STRING); // Gets the value of the "my-key" key.
```

# Contribution
I will be more than happy to merge any pull requests for additional features or improvements, as I'm very new to Java and still learning.
