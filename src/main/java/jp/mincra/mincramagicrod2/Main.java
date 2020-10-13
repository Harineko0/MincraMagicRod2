package jp.mincra.mincramagicrod2;

import jp.mincra.mincramagicrod2.Sys.Property;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("mmr").setExecutor(new Commands());
        getLogger().info(Property.getProperty("prefix")+"Loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getLogger().info(Property.getProperty("prefix")+"Unloaded");
    }
}
