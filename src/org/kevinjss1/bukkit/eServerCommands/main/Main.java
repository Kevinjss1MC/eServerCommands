package org.kevinjss1.bukkit.eServerCommands.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	@Override
	public void onEnable(){
		getLogger().info(ChatColor.RED + "[eServerCommands]" + ChatColor.RESET + "Has sucessfuly been enabled");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("op")){
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if(sender.hasPermission("eServerCommands.op")){
				if(!(args.length == 1)){
					sender.sendMessage(ChatColor.GOLD + "Usage /OP <Player>");
					return true;
				}
				target.setOp(true);
				sender.sendMessage(ChatColor.GRAY + "You have opped: " + ChatColor.GREEN + args[0]);
				Bukkit.getServer().broadcastMessage(ChatColor.RED + "Player " + ChatColor.BLUE + sender + ChatColor.RED + " Has opped " + ChatColor.BLUE + target + ChatColor.RED + "!");
			} else {
				sender.sendMessage(ChatColor.RED + "You do not have access to that command");
				return true;
			}

			
		}
		if(cmd.getName().equalsIgnoreCase("deop")){
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if(sender.hasPermission("eServerCommands.op")){
				if(!(args.length == 1)){
					sender.sendMessage(ChatColor.GOLD + "Usage /DEOP <Player>");
					return true;
				}
				target.setOp(false);
				sender.sendMessage(ChatColor.GRAY + "You have deoped: " + ChatColor.GREEN + args[0]);
				Bukkit.getServer().broadcastMessage(ChatColor.RED + "Player " + ChatColor.BLUE + sender + ChatColor.RED + " Has deopped " + ChatColor.BLUE + target + ChatColor.RED + "!");
			} else {
				sender.sendMessage(ChatColor.RED + "You do not have access to that command");
				return true;
			}

			
		}
		return false;
	}
	


}
