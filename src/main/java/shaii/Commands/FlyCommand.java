package shaii.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        if (!(sender instanceof Player)){

            sender.sendMessage("This command is only available for players.");
            return true;

        }

        Player p = (Player) sender;

        if (sender instanceof Player && !p.isFlying() && (p.hasPermission("pixecore.commands.fly"))) {

            p.setAllowFlight(true);
            p.setFlying(true);
            p.sendMessage("§8[§9Pixe§eCore§8] §eNow you can fly!");

        } else if (sender instanceof Player && p.isFlying() && (p.hasPermission("pixecore.commands.fly"))){

            p.setAllowFlight(false);
            p.setFlying(false);
            p.sendMessage("§8[§9Pixe§eCore§8] §cYou can't fly anymore.");

        } else if (sender instanceof Player && !(p.hasPermission("pixecore.commands.fly"))){

            p.sendMessage("§8[§9Pixe§eCore§8] §cYou don't have permission.");

        }
        return true;
    }

}
