package yourpackage.utils;

import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public abstract class Logger {
    public static void log(@NotNull Object message) {
        Plugin.getPlugin().getLogger().log(Level.INFO, String.valueOf(message));
    }

    public static void log(@NotNull Object message, @NotNull Level type) {
        Plugin.getPlugin().getLogger().log(type, String.valueOf(message));
    }
}
