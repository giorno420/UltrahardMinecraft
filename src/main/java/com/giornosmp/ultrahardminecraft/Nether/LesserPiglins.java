package com.giornosmp.ultrahardminecraft.Nether;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Random;

public class LesserPiglins implements Listener {

    final int random = new Random().nextInt(10);

    @EventHandler
    public void decreasePiglins(CreatureSpawnEvent event) {

        /*
        * for the people with "Dream luck"
        */

        if (event.getEntityType().equals(EntityType.PIGLIN) && random == 5){
            event.getEntity().remove();
        }
    }
}
