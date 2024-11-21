package yourpackage.utils;

import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public abstract class Logger {
    public static void log(@NotNull String message) {
        Plugin.getPlugin().getLogger().log(Level.INFO, message);
    }

    public static void log(@NotNull String message, @NotNull Level type) {
        Plugin.getPlugin().getLogger().log(type, message);
    }
}
