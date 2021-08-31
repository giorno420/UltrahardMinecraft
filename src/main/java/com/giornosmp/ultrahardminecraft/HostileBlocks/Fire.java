package com.giornosmp.ultrahardminecraft.HostileBlocks;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class Fire implements Listener {

    @EventHandler
    public void playerOnFireEvent(EntityDamageByBlockEvent event) {

        if (event.getEntityType().equals(EntityType.PLAYER)) {
            final Player player = (Player) event.getEntity();
            if (event.getCause().equals(EntityDamageByBlockEvent.DamageCause.FIRE)) {
                player.setFireTicks(1000000000);
            }
        }
        else if (!(event.getEntityType().equals(EntityType.PLAYER))) return;

    }
}
