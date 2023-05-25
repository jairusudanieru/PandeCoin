package plugin.pandecoin.Events;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import plugin.pandecoin.Items.ItemPandeCoin;

public class EventGivePlayerCoin {
    public void onGiveCommand(Player player) {
        //Giving one PandeCoin to the command sender
        ItemPandeCoin itemPandeCoin = new ItemPandeCoin();
        ItemStack pandecoin = itemPandeCoin.pandecoin();
        PlayerInventory inventory = player.getInventory();
        Location location = player.getLocation();
        World world = player.getWorld();
        //Checking if the player have space on their inventory
        if (inventory.firstEmpty() == -1) {
            world.dropItemNaturally(location, pandecoin);
        } else {
            inventory.addItem(pandecoin);
        }
    }
}
