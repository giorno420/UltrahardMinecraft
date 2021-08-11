package com.giornosmp.ultrahardminecraft.HostileBlocks;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class Lava implements Listener {

    @EventHandler
    public void onLavaDipEvent(EntityDamageByBlockEvent event) {

        if (event.getEntityType() == EntityType.PLAYER) {

            Player player = (Player) event.getEntity();

            if (event.getCause().equals(EntityDamageEvent.DamageCause.LAVA)) {

                player.damage(1000000);

                if (event.getCause().equals(EntityDamageEvent.DamageCause.FIRE)) {
                    player.setFireTicks(1000000000);
                } // permanently sets a person on fire unless they're extinguished

            }

        }

    }

}

