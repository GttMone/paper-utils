package yourpackage.utils;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import site.gttmone.cowCannon.CowCannon;

public abstract class Plugin {
    private static JavaPlugin plugin;

    public static void init(@NotNull CowCannon plugin) {
        if (Plugin.plugin != null) return;
        Plugin.plugin = plugin;
    }

    public static JavaPlugin getPlugin() {
        return Plugin.plugin;
    }
}
