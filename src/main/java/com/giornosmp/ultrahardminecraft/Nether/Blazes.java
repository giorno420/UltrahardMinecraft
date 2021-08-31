package com.giornosmp.ultrahardminecraft.Nether;

import com.giornosmp.ultrahardminecraft.HostileBlocks.Fire;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.util.Vector;

public class Blazes implements Listener {

    @EventHandler
    public void increaseFireballSpeed(CreatureSpawnEvent event){
        if (event.getEntityType().equals(EntityType.FIREBALL)){
            Fireball fireball = (Fireball) event.getEntity();
            final Vector vector = fireball.getVelocity();
            vector.multiply(3);
            vector.setY(vector.getY() - 0.3);
            fireball.setVelocity(vector);
        }
    }
}
