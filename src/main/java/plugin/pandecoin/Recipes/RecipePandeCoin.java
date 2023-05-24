package plugin.pandecoin.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.pandecoin.Items.ItemPandeCoin;

public class RecipePandeCoin {
    public static void registerRecipe(JavaPlugin plugin) {
        //Getting the PandeCoin item from other class
        ItemPandeCoin pandecoinItem = new ItemPandeCoin();
        ItemStack item = pandecoinItem.pandecoin();
        //Creating the custom recipe for the item
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "pandesal_coin"), item);
        recipe.shape("BBB", "BDB", "BBB");
        recipe.setIngredient('B', Material.BREAD);
        recipe.setIngredient('D', Material.DIAMOND);
        //Adding the recipe to the server
        Bukkit.getServer().addRecipe(recipe);
    }
}
