package org.shaii.pixecraftcore;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import shaii.Commands.FlyCommand;
import shaii.Commands.HealCommand;
import shaii.Commands.NicknameCommand;

public final class Main extends JavaPlugin {

    ConsoleCommandSender console = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {

        console.sendMessage("[PixecraftCore] Plugin enabled successfully, thanks for using it!");
        getCommand("Fly").setExecutor(new FlyCommand());
        getCommand("Heal").setExecutor(new HealCommand());
        getCommand("Nickname").setExecutor(new NicknameCommand());

    }

    @Override
    public void onDisable() {

        console.sendMessage("[PixecraftCore] Plugin disabled.");

    }
}
