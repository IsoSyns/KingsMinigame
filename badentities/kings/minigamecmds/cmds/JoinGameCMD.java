package badentities.kings.minigamecmds.cmds;

import badentities.kings.Main;
import badentities.kings.kingsarena.Arena;
import badentities.kings.minigamecmds.SubCommand;
import badentities.kings.permissions.PermissionSettings;
import badentities.kings.utilities.Utilities;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jake on 19/08/2016
 */
public class JoinGameCMD extends SubCommand {

    public JoinGameCMD() {
        super("Join Kings game.", PermissionSettings.PERMISSION_JOIN, "/kings join", "join", "joingame");
    }

    @Override
    protected void onPlayerExecute(Player sender, String... args) {

        if (args.length != 1) {
            Main.getInstance().sendMessage(PermissionSettings.INVALID_ARGUMENTS, sender);
            return;
        }

        if (!sender.hasPermission(PermissionSettings.PERMISSION_JOIN)) {
            Main.getInstance().sendMessage(PermissionSettings.INVALID_PERMISSION, sender);
            return;
        }

        if (!Arena.playable) {
            Main.getInstance().sendMessage("&cArena location has not been set!", sender);
            return;
        }

        if (Arena.playersIngame.contains(sender)) {
            Main.getInstance().sendMessage("&cYou are already ingame!", sender);
            return;
        }

        Utilities.sendPlayerToGame(sender);

    }

    @Override
    protected void onConsoleExecute(ConsoleCommandSender sender, String... args) {
        sender.sendMessage("You cannot use this command in the console");
    }
}
