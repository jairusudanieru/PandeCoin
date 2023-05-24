package plugin.pandecoin.Items;

import net.kyori.adventure.text.Component;
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
        List<Component> lore = new ArrayList<>();
        meta.setCustomModelData(1);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.displayName(Component.text("§6Pandesal Coin"));
        lore.add(Component.text("§cCurrency"));
        meta.lore(lore);
        result.setItemMeta(meta);
        return result;
    }
}
