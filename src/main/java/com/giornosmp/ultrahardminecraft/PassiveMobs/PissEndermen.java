package com.giornosmp.ultrahardminecraft.PassiveMobs;

import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PissEndermen implements Listener {

    @EventHandler
    public void pissAllEndermen(PlayerMoveEvent event){

        Player player = event.getPlayer();
        World world = player.getWorld();

        if (world.getEnvironment().equals(World.Environment.NORMAL)){

            for (Entity entity : player.getNearbyEntities(9, 9, 9)){

                if (player.getGameMode() != GameMode.SURVIVAL){ break; }
                if (player.isOp()){ break; }

                if (entity instanceof Enderman) {

                    Enderman enderman = (Enderman) entity;
                    if (enderman.getTarget() == null){

                        enderman.setTarget(player);
                    }
                }
            }
        }
    }
}
