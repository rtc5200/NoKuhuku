package rtc5200.nokuhuku;


import java.util.logging.Logger;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class events extends JavaPlugin implements Listener {
	Logger log = Logger.getLogger("minecraft");
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerMove(PlayerMoveEvent event)
	{
		Player player = event.getPlayer();
		player.setFoodLevel(20);
		
	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onFood(FoodLevelChangeEvent event)
	{
		event.setFoodLevel(20);
	}
}
