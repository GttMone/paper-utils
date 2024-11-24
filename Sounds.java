package yourpackage.utils;

import net.kyori.adventure.sound.Sound;
import org.jetbrains.annotations.NotNull;

public abstract class Sounds {
    public static @NotNull Sound.Builder getBuilder(@NotNull org.bukkit.Sound sound) {
        return Sound.sound().type(sound.key());
    }

    public static @NotNull Sound.Builder getBuilder(@NotNull Sound existingSound) {
        return Sound.sound(existingSound);
    }

    public static @NotNull Sound changePitch(@NotNull Sound sound, float pitch) {
        return getBuilder(sound).pitch(pitch).build();
    }

    public static @NotNull Sound changeVolume(@NotNull Sound sound, float volume) {
        return getBuilder(sound).volume(volume).build();
    }

    public static @NotNull Sound changePitchAndVolume(@NotNull Sound sound, float pitch, float volume) {
        return getBuilder(sound).pitch(pitch).volume(volume).build();
    }

    public static @NotNull Sound get(@NotNull org.bukkit.Sound sound) {
        return Sound.sound().type(sound.key()).build();
    }

    public static @NotNull Sound get(@NotNull org.bukkit.Sound sound, float pitch, float volume) {
        return Sound.sound().type(sound.key()).pitch(pitch).volume(volume).build();
    }

    public static @NotNull Sound getWithPitch(@NotNull org.bukkit.Sound sound, float pitch) {
        return Sound.sound().type(sound.key()).pitch(pitch).build();
    }

    public static @NotNull Sound getWithVolume(@NotNull org.bukkit.Sound sound, float volume) {
        return Sound.sound().type(sound.key()).volume(volume).build();
    }
}
