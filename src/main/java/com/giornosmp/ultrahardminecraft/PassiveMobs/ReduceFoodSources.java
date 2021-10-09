package com.giornosmp.ultrahardminecraft.PassiveMobs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;


public class ReduceFoodSources implements Listener {

    Random random = new Random();

    Set<String> passiveMobs = new HashSet<>(
            Arrays.asList(
                    EntityType.COW.name(),
                    EntityType.SHEEP.name(),
                    EntityType.PIG.name(),
                    EntityType.COD.name(),
                    EntityType.SALMON.name()
            )
    );
    @EventHandler
    public void onFoodSpawn(CreatureSpawnEvent event){

        if (passiveMobs.contains(event.getEntity().getName())){

            if (random.nextInt(2) == 0){
                event.getEntity().remove();
            }
        }
    }
}
