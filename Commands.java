package yourpackage.utils;

import org.bukkit.Bukkit;

public abstract class Commands {
    public static void execute(String command) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
    }
}