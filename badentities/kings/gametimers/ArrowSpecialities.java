package badentities.kings.gametimers;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.WitherSkull;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by Jake on 15/08/2016
 */
public class ArrowSpecialities extends BukkitRunnable {

    WitherSkull witherSkull;
    Arrow blazingArrow;

    public ArrowSpecialities(WitherSkull skull, Arrow arrow) {
        this.witherSkull = skull;
        this.blazingArrow = arrow;
    }

    int i = 0;

    @Override
    public void run() {
        witherSkull.setVelocity(blazingArrow.getVelocity());
        i++;
    }
}
