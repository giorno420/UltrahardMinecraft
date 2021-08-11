package com.giornosmp.ultrahardminecraft.HostileMobs;

// this class allows skeletons, wither skeletons and strays (skeleton type mobs) to give the user a withering effect when they are attacked

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SkeletonTypeMobs implements Listener {

    String[] _SkeletonMobs = {
            EntityType.SKELETON.name(),
            EntityType.STRAY.name()
    };
    Set<String> SkeletonMobs = new HashSet<>(Arrays.asList(_SkeletonMobs));

    @EventHandler
    public void onAttackEvent(EntityDamageByEntityEvent event) {

        if (event.getEntityType() == EntityType.PLAYER){
            Player player = (Player) event.getEntity();
            if (SkeletonMobs.contains(event.getDamager().getName())){
                player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 5, 1, true, true));
            }
        }
    }
}
