package yourpackage.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;

public abstract class Titles {
    public static void showServerTitle(@NotNull String miniMessageTitle) {
        Bukkit.getServer().showTitle(Title.title(Components.mm(miniMessageTitle), Component.empty()));
    }

    public static void showServerTitle(@NotNull String miniMessageTitle, long fadeInSeconds, long staySeconds, long fadeOutSeconds) {
        Bukkit.getServer().showTitle(
                Title.title(Components.mm(miniMessageTitle),
                        Component.empty(),
                        Title.Times.times(Duration.ofSeconds(fadeIn), Duration.ofSeconds(stay), Duration.ofSeconds(fadeOut)))
        );
    }
}
