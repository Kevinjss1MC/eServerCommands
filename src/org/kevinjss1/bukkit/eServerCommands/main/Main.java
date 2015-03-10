package org.kevinjss1.bukkit.eServerCommands.main;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	@Override
	public void onEnable(){
		getLogger().info(ChatColor.RED + "[eServerCommands]" + ChatColor.RESET + "Has sucessfuly been enabled");
	}

}
