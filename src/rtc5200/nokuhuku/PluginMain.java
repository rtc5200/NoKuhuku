package rtc5200.nokuhuku;

import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginMain extends JavaPlugin implements Listener {
	Logger log = Logger.getLogger("Minecraft");
	public final events PlayerListener = new events();
	public void onEnable() {
		log.info("[NoKuhuku]Enabled.");
		PluginManager  pm = getServer().getPluginManager();
		pm.registerEvents(this.PlayerListener , this);
	}
	public void onDisable() {
		log.info("[NoKuhuku]Disabled.");
	}
}
