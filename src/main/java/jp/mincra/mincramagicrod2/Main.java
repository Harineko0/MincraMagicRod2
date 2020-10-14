package jp.mincra.mincramagicrod2;

import jp.mincra.mincramagicrod2.Data.Property;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

//        String[] key = {"prefix"};
//        String[] value = new String[];
//        try {
//            value = Property.main(key);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(value+" MincraMagicRod2 Loaded");
        getCommand("mmr").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

//        getLogger().info(Property.main("prefix")+"Unloaded");
    }
}
