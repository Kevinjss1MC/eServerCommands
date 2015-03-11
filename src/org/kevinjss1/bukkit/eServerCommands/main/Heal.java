package org.kevinjss1.bukkit.eServerCommands.main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal extends Main {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	Player player = (Player) sender;
	if(cmd.getName().equalsIgnoreCase("Heal")){
			if(sender.hasPermission("eServerCommands.Heal")){
				player.setHealth(20);
				player.setFoodLevel(20);
				player.sendMessage(ChatColor.GREEN + "You have been healed!");
			} else {
				player.sendMessage(ChatColor.RED + "You do not have access to that command");
			}
			
			
		}
		return false;
	}
	


}
