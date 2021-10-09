package com.giornosmp.ultrahardminecraft.Nether;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Random;

public class IncreaseMobs implements Listener {

    final int randint = new Random().nextInt(10);

    @EventHandler
    public void increaseNetherHostiles(CreatureSpawnEvent event){
        if (randint == 5) {
            switch (event.getEntityType()) {
                case ZOMBIFIED_PIGLIN:
                    event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.ZOMBIFIED_PIGLIN);
                    break;
                case WITHER_SKELETON:
                    event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.WITHER_SKELETON);
                    break;
                case PIGLIN_BRUTE:
                    event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.PIGLIN_BRUTE);
                    break;
            }
        }
    }
}
