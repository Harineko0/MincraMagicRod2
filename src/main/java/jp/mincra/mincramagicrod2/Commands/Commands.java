package jp.mincra.mincramagicrod2.Commands;

import jp.mincra.mincramagicrod2.Data.Property;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command , String label , String[] args) {
        switch (args[0]){
            case "reload":
                sender.sendMessage("Reloading...");
                return true;
            case "config":
                //value取得
                String[] key = {"prefix","test"};
                String[] value = new String[key.length-1];
                try {
                    value = Property.main(key);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //メッセージ送信
                sender.sendMessage(ChatColor.DARK_GRAY +"--------------------[" + ChatColor.GRAY + "config.properties" + ChatColor.DARK_GRAY + "]--------------------" );
                for (int i=0; i < key.length; i++){
                    sender.sendMessage(ChatColor.BLUE + key[i] + "=" + ChatColor.WHITE + value[i]);
                }
                sender.sendMessage(ChatColor.DARK_GRAY +"-----------------------------------------------------------" );
                return true;
            default:
                return false;
        }
    }
}
