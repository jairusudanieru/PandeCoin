package plugin.pandecoin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import plugin.pandecoin.Events.EventGivePlayerCoin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandPandeCoin implements TabCompleter, CommandExecutor {

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, String[] args) {
        List<String> list = new ArrayList<>();
        list.add("give");
        if (args.length == 1 || sender.isOp()) return list;
        return Collections.emptyList();
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("pandecoin")) return false;
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        if (args[0].equalsIgnoreCase("give")) {
            EventGivePlayerCoin event = new EventGivePlayerCoin();
            event.onGiveCommand(player);
            return true;
        }
        return false;
    }
}
