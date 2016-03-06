package org.kevinjss1.bukkit.eServerCommands.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Healcmd implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("heal")){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.YELLOW + "You have been healed!");
			player.setHealth(20);
			player.setFoodLevel(20);
			return true;
		}
		
		return true;
	}
}
