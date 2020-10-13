package jp.mincra.mincramagicrod2;

import jp.mincra.mincramagicrod2.Sys.Property;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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

    @Override
    public boolean onCommand(CommandSender sender, Command command , String label , String[] args) {
        switch (args[0]){
            case "reload":
                sender.sendMessage("Reloading...");
                return true;
            case "config":
                sender.sendMessage("--------------------\nprefix: "+ Property.getProperty("prefix")+"\n--------------------");
                return true;
            default:
                return false;
        }
    }
}
