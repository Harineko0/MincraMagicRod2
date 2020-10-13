package jp.mincra.mincramagicrod2;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(Property.getProperty("prefix")+"Loaded");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(Property.getProperty("prefix")+"Unloaded");
    }
}
