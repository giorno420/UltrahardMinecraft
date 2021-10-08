package com.giornosmp.ultrahardminecraft.HostileMobs;

import com.giornosmp.ultrahardminecraft.ThisPlugin;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class Skeletons implements Listener {

    @EventHandler
    public void arrowFireEvent(EntityShootBowEvent event){

        if (event.getEntityType().equals(EntityType.SKELETON)){

            Projectile arrow = (Projectile) event.getProjectile();

            Vector vector = arrow.getVelocity();

            vector.multiply(2);
            vector.setY(vector.getY() - 0.3D);

            arrow.setVelocity(vector);
            final int[] i = {1};
            new BukkitRunnable() {
                @Override
                public void run() {
                    if (i[0] < 10){
                        event.getEntity().launchProjectile(Arrow.class, vector);
                        i[0]++;
                    }
                    else if (i[0] > 10){
                        this.cancel();
                    }

                }
            }.runTaskTimer(ThisPlugin.p, 1, 100);
        }
    }



}
