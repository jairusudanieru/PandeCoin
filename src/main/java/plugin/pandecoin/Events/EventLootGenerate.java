package plugin.pandecoin.Events;

import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import plugin.pandecoin.Items.ItemPandeCoin;

import java.util.Random;

public class EventLootGenerate implements Listener {
    @EventHandler
    public void onLootGenerate(@NotNull LootGenerateEvent event) {
        //Adding the PandeCoin item randomly to a natural generated chest
        Random random = new Random();
        ItemPandeCoin itemPandeCoin = new ItemPandeCoin();
        if (event.getInventoryHolder() instanceof Chest && random.nextDouble() <= 0.5) {
            Chest chest = (Chest) event.getInventoryHolder();
            Inventory inventory = chest.getInventory();
            ItemStack customItem = itemPandeCoin.pandecoin();
            ItemStack[] contents = inventory.getContents();
            int slot = random.nextInt(contents.length);
            contents[slot] = customItem;
            inventory.setContents(contents);
        }
    }
}
