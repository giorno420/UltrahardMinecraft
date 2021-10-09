package com.giornosmp.ultrahardminecraft.HostileMobs;

import org.bukkit.GameMode;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Creepers implements Listener {

    @EventHandler
    public void creeperSpawn(CreatureSpawnEvent e){

        if (e.getEntityType() == EntityType.CREEPER){
            Creeper creeper = (Creeper) e.getEntity();
            creeper.setPowered(true);
        }
    }

    @EventHandler
    public void instantlyExplodeCreepersInProximity(PlayerMoveEvent event){

        Player player = event.getPlayer();
        for (Entity entity : player.getNearbyEntities(4, 3, 4)){

            if (player.getGameMode() != GameMode.SURVIVAL) { break; }

            if (entity instanceof Creeper) {
                ((Creeper) entity).setMaxFuseTicks(0);
            }
        }
    }
}
