package jp.mincra.mincramagicrod2;

import jp.mincra.mincramagicrod2.Commands.Commands;
import jp.mincra.mincramagicrod2.Commands.TabCompletion;
import jp.mincra.mincramagicrod2.Data.Property;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("mmr").setExecutor(new Commands());
        getCommand("mmr").setTabCompleter(new TabCompletion());

        //configファイル等作成
        try {
            Property.make();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
