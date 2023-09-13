package shaii.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NicknameCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!sender instanceof Player) {

            Bukkit.getConsoleSender().sendMessage("This command is only for players.");
            return true;

        }

        Player p = (Player) sender;
        if (sender instanceof Player) {

            p.setDisplayName();

        }

        return true;


    }

}
