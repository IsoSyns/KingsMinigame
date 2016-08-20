package badentities.kings.minigamecmds.cmds;

import badentities.kings.Main;
import badentities.kings.kingsarena.kings.EvilWither;
import badentities.kings.minigamecmds.SubCommand;
import badentities.kings.permissions.PermissionSettings;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jake on 19/08/2016
 */
public class SpawnCMD extends SubCommand {

    public SpawnCMD() {
        super("SpawnCMD in kings.", PermissionSettings.PERMISSION_SPAWN, "/kings evilwither", "wither", "s");
    }

    @Override
    protected void onPlayerExecute(Player sender, String... args) {
        if (args.length == 2) {
            if (args[1].equalsIgnoreCase("evilwither")) {
                Main.getInstance().sendMessage("&eSpawning the EvilWither!", sender);
                EvilWither.spawn(sender, 1);
            }
        } else {
            Main.getInstance().sendMessage(PermissionSettings.INVALID_ARGUMENTS, sender);
        }
    }

    @Override
    protected void onConsoleExecute(ConsoleCommandSender sender, String... args) {
        sender.sendMessage("You cannot use this command in the console!");
    }
}
