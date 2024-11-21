package yourpackage.utils;

import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataHolder;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

public abstract class DataStore {
    public static <P, C> void setData(@NotNull PersistentDataHolder holder, @NotNull String key, @NotNull PersistentDataType<P, C> type, @NotNull C value) {
        NamespacedKey namespacedKey = new NamespacedKey(Plugin.getPlugin(), key);
        holder.getPersistentDataContainer().set(namespacedKey, type, value);
    }

    public static <P, C> @Nullable C getData(@NotNull PersistentDataHolder holder, @NotNull String key, @NotNull PersistentDataType<P, C> type) {
        NamespacedKey namespacedKey = new NamespacedKey(Plugin.getPlugin(), key);
        PersistentDataContainer container = holder.getPersistentDataContainer();
        if (!container.has(namespacedKey, type)) return null;
        return container.get(namespacedKey, type);
    }
}
