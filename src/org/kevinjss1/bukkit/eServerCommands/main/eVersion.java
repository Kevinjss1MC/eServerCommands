package org.kevinjss1.bukkit.eServerCommands.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class eVersion implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("eVersion")){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.BLUE + "This is alpha (RELEASE) version 0.00.002A (9.1BASE)");
			return true;
		}
		
		return true;
	}

}
