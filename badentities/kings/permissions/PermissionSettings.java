package badentities.kings.permissions;

import badentities.kings.Main;
import badentities.kings.utilities.Utilities;

/**
 * Created by Jake on 19/08/2016
 */
public class PermissionSettings {

    public static String PERMISSION_RELOAD = Main.PERMISSION + "reload";
    public static String PERMISSION_SPAWN = Main.PERMISSION + "spawn";
    public static String PERMISSION_JOIN = Main.PERMISSION + "joingame";

    public static String INVALID_SETTER = Utilities.color("&cInvalid rank setter!");
    public static String INVALID_PLAYER = Utilities.color("&cUnable to find player. Are they online?");
    public static String INVALID_ARGUMENTS = Utilities.color("&cInvalid arguments! Do /help for more information.");
    public static String INVALID_COMMAND_SENDER = "You cannot use this command in the console!";
    public static String INVALID_PERMISSION = Utilities.color("&cYou are not of a high enough rank to use this command!");
}
