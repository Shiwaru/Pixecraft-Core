package shaii.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {

            sender.sendMessage("This command is only available for players.");
            return true;

        }

        Player p = (Player) sender;

        if (sender instanceof Player && p.hasPermission("pixecore.commands.heal")) {

            p.setHealth(p.getMaxHealth());
            p.sendMessage("§8[§9Pixe§eCore§8] §eYou've been healed!");

        } else if (sender instanceof Player && !p.hasPermission("pixecore.commands.heal")) {

            p.sendMessage("§8[§9Pixe§eCore§8] §cYou don't have permission.");

        }

        return true;
    }
}
