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
public class SetSpawnCMD extends SubCommand {

    public SetSpawnCMD() {
        super("Set spawn location.", "", "/kings setspawn", "setspawn", "ss");
    }

    @Override
    protected void onPlayerExecute(Player sender, String... args) {

        if (args.length == 1) {
            Arena.arenaLocation = sender.getLocation();
            Main.getInstance().sendMessage("&cSpawn point set!", sender);
            Arena.playable = true;
        } else {
            Main.getInstance().sendMessage(PermissionSettings.INVALID_ARGUMENTS, sender);
        }

    }

    @Override
    protected void onConsoleExecute(ConsoleCommandSender sender, String... args) {
        sender.sendMessage(PermissionSettings.INVALID_COMMAND_SENDER);
    }
}
