package jp.mincra.mincramagicrod2;

import jp.mincra.mincramagicrod2.Sys.Property;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command , String label , String[] args) {
        switch (args[0]){
            case "reload":
                sender.sendMessage("Reloading...");
                return true;
            case "config":
//                sender.sendMessage(ChatColor.DARK_GRAY +"----------------------------------------"+ ChatColor.WHITE + Property.main("prefix")+ChatColor.DARK_GRAY +"\n----------------------------------------");
                return true;
            default:
                return false;
        }
    }
}
