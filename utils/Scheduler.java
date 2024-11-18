package site.gttmone.cowCannon.utils;

import io.papermc.paper.util.Tick;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;

public abstract class Scheduler {
    public static void setTimeout(@NotNull Runnable task, long delayInMiliseconds) {
        long delay = Tick.tick().fromDuration(Duration.ofMillis(delayInMiliseconds));
        Bukkit.getScheduler().runTaskLater(Plugin.getPlugin(), task, delay);
    }
}