package com.giornosmp.ultrahardminecraft.HostileMobs;

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

    Set<String> SkeletonMobs = new HashSet<>(
            Arrays.asList(
                    EntityType.SKELETON.name(),
                    EntityType.STRAY.name()
            )
    );

    @EventHandler
    public void onAttackEvent(EntityDamageByEntityEvent event) {

        if (event.getEntityType() == EntityType.PLAYER){
            if (SkeletonMobs.contains(event.getDamager().getName())){
                ((Player)event.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 5, 1, true, true));
            }
        }
    }
}
