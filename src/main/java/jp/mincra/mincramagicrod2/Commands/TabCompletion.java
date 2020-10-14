package jp.mincra.mincramagicrod2.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class TabCompletion implements TabCompleter {
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> tab = new ArrayList<>();
            tab.add("config");
            return tab;
        }
        return null;
    }
}
