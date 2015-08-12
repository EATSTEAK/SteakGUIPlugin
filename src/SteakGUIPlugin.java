/**
 * Created by ITSTAKE on 2015-08-12.
 */
import ninja.amp.ampmenus.events.ItemClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import tk.itstake.steakgui.SteakGUI;
import tk.itstake.steakgui.gui.Menu;

public class SteakGUIPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ((SteakGUI)Bukkit.getPluginManager().getPlugin("SteakGUI")).addToPluginList(this.getName());
    }

    public static String getVariables(String var, String[] data, Menu menu, Player player) {
        if(var.equals("test")) {
            return "Hello world!";
        } else {
            return null;
        }
    }

    public static void runTask(String type, Object[] data, ItemClickEvent event, Menu MENU) {
        if(type.equals("test")) {
            event.getPlayer().sendMessage("Test Task");
        }
    }
}
