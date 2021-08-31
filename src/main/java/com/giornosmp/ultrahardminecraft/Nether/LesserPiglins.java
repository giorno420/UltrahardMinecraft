package com.giornosmp.ultrahardminecraft.Nether;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Random;

public class LesserPiglins implements Listener {

    final int random = new Random().nextInt(10);

    @EventHandler
    public void decreasePiglins(CreatureSpawnEvent event) { // "dream luck"

        if (random == 5) {
            if (event.getEntityType().equals(EntityType.PIGLIN)){
                Piglin piglin = (Piglin)event.getEntity();
                piglin.remove();
            }
        }
    }
}
