package badentities.kings.minigamecmds.cmds;

import badentities.kings.Main;
import badentities.kings.minigamecmds.SubCommand;
import badentities.kings.permissions.PermissionSettings;
import badentities.kings.utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jake on 19/08/2016
 */
public class SendAllCMD extends SubCommand {

    public SendAllCMD() {
        super("Send all to the Kings game.", "", "/kings sendall", "sendall", "sa");
    }

    @Override
    protected void onPlayerExecute(Player sender, String... args) {
        if (args.length == 1) {
            Main.getInstance().broadcast("&aSending all players to Kings game...");
            for (Player player : Bukkit.getOnlinePlayers()) {
                Utilities.sendPlayerToGame(player);
            }
        } else {
            Main.getInstance().sendMessage(PermissionSettings.INVALID_ARGUMENTS, sender);
        }
    }

    @Override
    protected void onConsoleExecute(ConsoleCommandSender sender, String... args) {
        if (args.length == 1) {
            Main.getInstance().broadcast("&aSending all players to Kings game...");
            for (Player player : Bukkit.getOnlinePlayers()) {
                Utilities.sendPlayerToGame(player);
            }
        } else {
            sender.sendMessage("Invalid arguments!");
        }
    }
}
