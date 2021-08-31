package com.giornosmp.ultrahardminecraft.Beds;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.World;

public class BedManager {

    public static void createExplosions(Player player, Block bed){

        float explosionPower = 5.0F;
        World world = player.getWorld();

        if (world.getEnvironment().equals(World.Environment.NORMAL)){
            world.createExplosion(bed.getLocation(), explosionPower, false);
        }
    }
}
