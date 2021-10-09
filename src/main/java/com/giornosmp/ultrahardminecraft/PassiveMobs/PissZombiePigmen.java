package com.giornosmp.ultrahardminecraft.PassiveMobs;

import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.PigZombie; // why the fuck did mojang rename "Zombie Pigman" from 1.15 to "Zombified Piglin" and in the docs its called "PigZombie"
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;

public class PissZombiePigmen implements Listener {

    @EventHandler
    public void pissAllZombiePigmen(PlayerMoveEvent event){
        Player player = event.getPlayer();

        for (Entity entity : player.getNearbyEntities(3, 3, 3)){

            if (!(player.getGameMode().equals(GameMode.SURVIVAL))){ break; }
            if (player.hasPotionEffect(PotionEffectType.INVISIBILITY)){ break; }

            if (entity.getType() == EntityType.ZOMBIFIED_PIGLIN){
                PigZombie zombiepigman = (PigZombie) entity;
                zombiepigman.setTarget(player);
            }
        }
    }
}
