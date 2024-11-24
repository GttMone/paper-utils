package yourpackage.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.jetbrains.annotations.NotNull;

public abstract class Components {
    public static @NotNull Component mm(@NotNull String miniMessageString) {
        return MiniMessage.miniMessage().deserialize(miniMessageString);
    }
}