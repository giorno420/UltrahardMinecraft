package com.giornosmp.ultrahardminecraft.HostileMobs;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class AttackOnTitan implements Listener {

    private final int randint = new Random().nextInt(50);
    int lightning = 0;

    @EventHandler
    public void whenPlayerKillsZombie(EntityDeathEvent event){
        Entity entity = event.getEntity();
        Entity killer = event.getEntity().getKiller();

        if (randint == 10){
            if (killer instanceof Player && entity instanceof Zombie) {
                World world = entity.getWorld();
                while (lightning < 10) {
                    lightning++;
                    world.spawnEntity(entity.getLocation(), EntityType.LIGHTNING);
                }
                world.spawnEntity(entity.getLocation(), EntityType.GIANT);
            }
        }
    }
}
