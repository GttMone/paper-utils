# paper-utils
A collection of small utility classes for easier Minecraft Paper plugin development 

# Installation
Most utilities use the plugin instance, therefore it is required to initialize the `Plugin` utility class by running the method `init()` and passing the plugin instance. 
It should be called within the `onEnable` method, preferably at the very top. That way, all other utility classes would have access to the plugin instance and therefore work correctly.

```java
@Override
public void onEnable() {
    try {
        Plugin.init(this);
    } catch (Exception ignored) {}
}
```

You may notice that the method is surrounded by a try-catch block. 
This is intentional, because the method will throw an error if the Plugin utility class is reinitialized.
This is done to prevent re-initialization from other than the main class.

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

The scheduler is used to delay a task. It's heavily inspired by the JavaScript setTimeout function, therefore the accepted time is in miliseconds.
```java
onCooldown = true;
Scheduler.setTimeout(() -> onCooldown = false, 500);
```

# Contribution
I will be more than happy to merge any pull requests for additional features or improvements, as I'm very new to Java and still learning.
