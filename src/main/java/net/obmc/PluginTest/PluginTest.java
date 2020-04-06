package net.obmc.PluginTest;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginTest extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");
	
	public PluginTestListener ptl;

	@Override
	public void onEnable() {
		log.log(Level.INFO, "[PluginTest] Plugin loaded");
	
		/**
		 * Initialize Stuff
		 */
		Initialize();
		/**
		 * Register stuff
		 */
		Register();
		/**
		 * Output message
		 */
		
		log.log(Level.INFO, "[PluginTest] Plugin Version " + this.getDescription().getVersion() + " activated");

		/*
		// enable and run a task (every 100L or 5 seconds)
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
		// run the task every 5 seconds
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
            	
               	
            	//log.log(Level.INFO, "]PluginTest] testing 1 2 3");
            	//for(Player i : Bukkit.getServer().getOnlinePlayers()){
            	//	pw.println(i.getName()+ ":" + i.getWorld().getName()+":"+i.getLocation().getX() + ":" + i.getLocation().getY() + ":" + i.getLocation().getZ());
            	//}
            	
            }
        }, 0L, 100L);
        */
	}
	
	@Override
	public void onDisable() {
		
		log.log(Level.INFO, "[PluginTest] Plugin unloaded");
	}
	
	public void Initialize() {
		//Configuration config = this.getConfig();
	}

	public void Register() {
		ptl = new PluginTestListener(this);
	}
}
