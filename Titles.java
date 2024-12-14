package yourpackage.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
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

    public static void showTitle(@NotNull Player player, @NotNull String miniMessageTitle) {
        player.showTitle(Title.title(Components.mm(miniMessageTitle), Component.empty()));
    }

    public static void showTitleWithSubtitle(@NotNull Player player, @NotNull String miniMessageTitle, @NotNull String miniMessageSubtitle) {
        player.showTitle(Title.title(Components.mm(miniMessageTitle), Components.mm(miniMessageSubtitle)));
    }

    public static void showTitle(@NotNull Player player, @NotNull String miniMessageTitle, long fadeIMilis, long stayMilis, long fadeOutMilis) {
        player.showTitle(
                Title.title(Components.mm(miniMessageTitle),
                        Component.empty(),
                        Title.Times.times(Duration.ofMillis(fadeIMilis), Duration.ofMillis(stayMilis), Duration.ofMillis(fadeOutMilis)))
        );
    }

    public static void showTitleWithSubtitle(
            @NotNull Player player,
            @NotNull String miniMessageTitle,
            @NotNull String miniMessageSubtitle,
            long fadeIMilis,
            long stayMilis,
            long fadeOutMilis
    ) {
        player.showTitle(
                Title.title(
                        Components.mm(miniMessageTitle),
                        Components.mm(miniMessageSubtitle),
                        Title.Times.times(Duration.ofMillis(fadeIMilis), Duration.ofMillis(stayMilis), Duration.ofMillis(fadeOutMilis))
                )
        );
    }
}
