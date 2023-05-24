package plugin.pandecoin.Events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import plugin.pandecoin.Items.ItemPandeCoin;

public class EventGivePlayerCoin {
    public void onGiveCommand(Player player) {
        //Giving one PandeCoin to the command sender
        World world = player.getWorld();
        ItemPandeCoin pandeCoin = new ItemPandeCoin();
        ItemStack item = pandeCoin.pandecoin();
        //Checking if the player have space on their inventory
        if (player.getInventory().firstEmpty() == -1) {
            world.dropItemNaturally(player.getLocation(), item);
        } else {
            player.getInventory().addItem(item);
        }
    }
}
