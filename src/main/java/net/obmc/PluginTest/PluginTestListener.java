package net.obmc.PluginTest;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import net.obmc.PluginTest.PluginTest;

public class PluginTestListener implements Listener {
	
	PluginTest plugin;
	Logger log = Logger.getLogger("Minecraft");

	public PluginTestListener(PluginTest ptplugin) {
		this.plugin = ptplugin;
		plugin.getServer().getPluginManager().registerEvents(this, ptplugin);
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerInteract(PlayerInteractEvent event) {

		log.log(Level.INFO, "[PluginTest] debug - PlayerInteractEvent event="+event.getEventName());
		log.log(Level.INFO, "[PluginTest] debug - getHand()="+event.getHand());
		log.log(Level.INFO, "[PluginTest] debug - holding="+event.getPlayer().getItemInHand().getType());
	}
}