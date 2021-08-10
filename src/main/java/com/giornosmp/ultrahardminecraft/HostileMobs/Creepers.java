package com.giornosmp.ultrahardminecraft.HostileMobs;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Creepers implements Listener {

    @EventHandler
    public void creeperSpawn(CreatureSpawnEvent creeperspawnevent){

        if (creeperspawnevent.getEntityType() == EntityType.CREEPER){

            Creeper creeper = (Creeper) creeperspawnevent.getEntity();

            creeper.setPowered(true);
        }

        else{
            System.out.print(""); // i just didn't like the yellow error line that intelliJ added for no reason
        }
    }
}
