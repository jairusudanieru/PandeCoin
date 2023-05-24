package plugin.pandecoin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.pandecoin.Events.EventLootGenerate;
import plugin.pandecoin.Recipes.RecipePandeCoin;

public final class PandeCoin extends JavaPlugin {

    @Override
    public void onEnable() {
        //PandeCoin plugin startup logic
        RecipePandeCoin.registerRecipe(this);
        Bukkit.getServer().getPluginManager().registerEvents(new EventLootGenerate(), this);
        Bukkit.getLogger().info("[PanadeCoin] Plugin Successfully Enabled!");
    }

    @Override
    public void onDisable() {
        //PandeCoin plugin shutdown logic
        Bukkit.getLogger().info("[PanadeCoin] Plugin Successfully Disabled!");
    }
}
