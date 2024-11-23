package yourpackage.utils;

import io.papermc.paper.util.Tick;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.util.function.Consumer;

public abstract class Scheduler {
    public static void setTimeout(@NotNull Runnable task, long delayInMiliseconds) {
        final long delay = getTicksFromMilis(delayInMiliseconds);
        Bukkit.getScheduler().runTaskLater(Plugin.getPlugin(), task, delay);
    }

    public static void setInterval(@NotNull Consumer<? super BukkitTask> task, long delayInMilis, long intervalInMilis) {
        final long delay = getTicksFromMilis(delayInMilis);
        final long period = getTicksFromMilis(intervalInMilis);
        Bukkit.getScheduler().runTaskTimer(Plugin.getPlugin(), task, delay, period);
    }

    public static void setInterval(@NotNull Consumer<? super BukkitTask> task, long intervalInMilis) {
        final long period = getTicksFromMilis(intervalInMilis);
        Bukkit.getScheduler().runTaskTimer(Plugin.getPlugin(), task, period, period);
    }

    public static void clearInterval(int taskId) {
        Bukkit.getScheduler().cancelTask(taskId);
    }

    public static void clearAllIntervals() {
        Bukkit.getScheduler().cancelTasks(Plugin.getPlugin());
    }


    private static long getTicksFromMilis(long delayInMiliseconds) {
        return Tick.tick().fromDuration(Duration.ofMillis(delayInMiliseconds));
    }
}
