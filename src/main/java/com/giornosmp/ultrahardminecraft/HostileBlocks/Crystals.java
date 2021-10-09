package com.giornosmp.ultrahardminecraft.HostileBlocks;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Crystals implements Listener {

    @EventHandler
    public void crystalBreakEvent(EntityDamageEvent event){

        if (event.getEntityType().equals(EntityType.ENDER_CRYSTAL) && event.getEntity().getWorld().getEnvironment().equals(World.Environment.THE_END)){

            EnderCrystal crystal = (EnderCrystal) event.getEntity();
            Location crystalLocation = crystal.getLocation();
            crystalLocation.setY(crystalLocation.getY() + 2);

            crystalLocation.getWorld().spawnEntity(crystalLocation, EntityType.WITHER_SKELETON); // TODO add loop to do this 30 ish times
        }
    }
}
