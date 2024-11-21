package yourpackage.utils;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class Plugin {
    private static JavaPlugin plugin;

    public static void init(@NotNull JavaPlugin plugin) {
        if (Plugin.plugin != null) return;
        Plugin.plugin = plugin;
    }

    public static JavaPlugin getPlugin() {
        return Plugin.plugin;
    }
}
