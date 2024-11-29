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

    public static void showServerTitle(@NotNull String miniMessageTitle, long fadeIMilis, long stayMilis, long fadeOutMilis) {
        Bukkit.getServer().showTitle(
                Title.title(Components.mm(miniMessageTitle),
                        Component.empty(),
                        Title.Times.times(Duration.ofMillis(fadeIMilis), Duration.ofMillis(stayMilis), Duration.ofMillis(fadeOutMilis)))
        );
    }
}
