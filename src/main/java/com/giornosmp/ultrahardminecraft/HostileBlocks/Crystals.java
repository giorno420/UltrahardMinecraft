package com.giornosmp.ultrahardminecraft.HostileBlocks;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Crystals implements Listener {

    @EventHandler
    public void crystalBreakEvent(EntityDamageByEntityEvent event){

        if (event.getEntityType().equals(EntityType.ENDER_CRYSTAL) && event.getEntity().getWorld().getEnvironment().equals(World.Environment.THE_END)){

            EnderCrystal crystal = (EnderCrystal) event.getEntity();
            Player player = (Player) event.getDamager();
            Location crystalLocation = crystal.getLocation();
            crystalLocation.setY(crystalLocation.getY() + 2);

            TNTPrimed tnt = crystal.getWorld().spawn(crystalLocation, TNTPrimed.class);
            tnt.setFuseTicks(200);
        }
    }
}
