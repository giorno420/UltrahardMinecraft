package com.giornosmp.ultrahardminecraft.PassiveMobs;

import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;

public class PissIronGolems implements Listener {

    @EventHandler
    public void pissAllIronGolems(PlayerMoveEvent event){

        Player player = event.getPlayer();
        for (Entity entity : player.getNearbyEntities(10, 10, 10)){

            if (player.getGameMode() != GameMode.SURVIVAL) { break; }

            if (player.hasPotionEffect(PotionEffectType.INVISIBILITY)){ break; }

            if (entity.getType() == EntityType.IRON_GOLEM){
                IronGolem golem = (IronGolem) entity;
                golem.setTarget(player);
            }
        }
    }
}
