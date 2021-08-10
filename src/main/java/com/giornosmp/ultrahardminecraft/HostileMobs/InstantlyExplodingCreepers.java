package com.giornosmp.ultrahardminecraft.HostileMobs;

import org.bukkit.GameMode;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class InstantlyExplodingCreepers implements Listener {

    @EventHandler
    public void instantlyExplodeCreepersInProximity(PlayerMoveEvent event){

        Player player = event.getPlayer();
        for (Entity entity : player.getNearbyEntities(4, 3, 4)){

            if (player.getGameMode() != GameMode.SURVIVAL) { break; }
            if (player.isOp()) { break; }

            if (entity instanceof Creeper) {

                Creeper creeper = (Creeper) entity;
                creeper.setMaxFuseTicks(0);
            }
        }
    }
}
