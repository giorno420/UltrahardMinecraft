package com.giornosmp.ultrahardminecraft.Nether;

import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.PiglinBrute;
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
                    PigZombie zombiepigman = (PigZombie) event.getEntity();
                    zombiepigman.getWorld().spawnEntity(zombiepigman.getLocation(), EntityType.ZOMBIFIED_PIGLIN);
                    break;
                case WITHER_SKELETON:
                    WitherSkeleton witherskelly = (WitherSkeleton) event.getEntity();
                    witherskelly.getWorld().spawnEntity(witherskelly.getLocation(), EntityType.WITHER_SKELETON);
                    break;
                case PIGLIN_BRUTE:
                    PiglinBrute brute = (PiglinBrute) event.getEntity();
                    brute.getWorld().spawnEntity(brute.getLocation(), EntityType.PIGLIN_BRUTE);
                    break;
            }
        }
    }
}
