package yourpackage.utils;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class Plugin {
    private static JavaPlugin plugin;

    public static void init(@NotNull CowCannon plugin) throws Exception {
        if (Plugin.plugin != null) throw new Exception("Cannot reinitialise Plugin utility class!");
        Plugin.plugin = plugin;
    }

    public static @NotNull JavaPlugin getPlugin() {
        return Plugin.plugin;
    }
}
