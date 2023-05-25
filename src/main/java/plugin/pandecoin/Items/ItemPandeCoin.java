package plugin.pandecoin.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemPandeCoin {
    public ItemStack pandecoin() {
        //Creating the PandeCoin ItemStack
        ItemStack result = new ItemStack(Material.DIAMOND);
        ItemMeta meta = result.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("§cCurrency");
        meta.setCustomModelData(1);
        meta.setDisplayName("§6Pandesal Coin");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        result.setItemMeta(meta);
        return result;
    }
}
