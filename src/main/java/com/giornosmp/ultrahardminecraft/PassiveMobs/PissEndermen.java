package com.giornosmp.ultrahardminecraft.PassiveMobs;

import org.bukkit.GameMode;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;

public class PissEndermen implements Listener {

    @EventHandler
    public void pissAllEndermen(PlayerMoveEvent event){

        Player player = event.getPlayer();

            for (Entity entity : player.getNearbyEntities(9, 9, 9)){

                if (!(player.getGameMode().equals(GameMode.SURVIVAL))) break;
                if (player.hasPotionEffect(PotionEffectType.INVISIBILITY)) break;

                if (entity instanceof Enderman) {
                    Enderman enderman = (Enderman) entity;
                    if (enderman.getTarget() == null){
                        enderman.setTarget(player);
                }
            }
        }
    }
}
