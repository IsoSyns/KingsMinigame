package badentities.kings.minigamecmds.cmds;

import badentities.kings.Main;
import badentities.kings.kingsarena.Arena;
import badentities.kings.minigamecmds.SubCommand;
import badentities.kings.permissions.PermissionSettings;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jake on 19/08/2016
 */
public class StartGameCMD extends SubCommand {

    public StartGameCMD() {
        super("Start game.", "", "/kings start", "start");
    }

    @Override
    protected void onPlayerExecute(Player sender, String... args) {
        if (args.length != 1) {
            Main.getInstance().sendMessage(PermissionSettings.INVALID_ARGUMENTS, sender);
            return;
        }

        if (Arena.gameStarted) {
            Arena.gameStarted = false;
            Main.getInstance().sendMessage("&cGame timer stopped!", sender);
        } else {
            Arena.gameStarted = true;
            Main.getInstance().sendMessage("&cGame timer started!", sender);
        }

    }

    @Override
    protected void onConsoleExecute(ConsoleCommandSender sender, String... args) {
        sender.sendMessage(PermissionSettings.INVALID_COMMAND_SENDER);
    }
}
