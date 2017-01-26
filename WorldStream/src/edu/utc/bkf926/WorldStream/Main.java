package edu.utc.bkf926.WorldStream;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static final String VERSION = "0.0.1";
	
	public static final int[] SOLID_SURFACE_IDS = {
			1,2,3,4,5,7,12,13	//This covers all the most basic surfaces. Add the others after initial testing
	};
	public static final int[] NONSOLID_STRUCTURES = {
			6,
	};
	
	@Override
	public void onEnable() {
		Bukkit.getLogger().info("WorldStream v"+VERSION+" enabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player pSender = (Player)sender;
		
		if (command.getName().equalsIgnoreCase("ws")){
			if (args[0].equalsIgnoreCase("version")){
				sender.sendMessage("WorldStream v"+VERSION);
				sender.sendMessage("Use /ws export to export the map data!");
			}
			else if (args[0].equalsIgnoreCase("export")){
				if (args[1].equalsIgnoreCase("chunk")){
					//export current chunk
				}
				else if (args[1].equalsIgnoreCase("loaded")){
					//export all loaded chunks
				}
				else if (args[1].equalsIgnoreCase("world")){
					//export entire map
				}
				else {
					sender.sendMessage(ChatColor.RED + "Usage: /ws export [chunk/loaded/world]");
				}
			}
		}
		
		return false; //base case
	}
	
	public Chunk getSendersCurrentChunk(Player p){
		return p.getWorld().getChunkAt(p.getLocation());
	}
	
}
