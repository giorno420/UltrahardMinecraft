package com.giornosmp.ultrahardminecraft.Beds;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import java.util.Random;

public class ExplodingBeds implements Listener {

    private final Random random = new Random();
    @EventHandler
    public void onSleep(PlayerBedEnterEvent event) {

        int randint = random.nextInt(100);

        Player player = (Player) event.getPlayer();
        Block bed = event.getBed();

        if (randint == 1){
            player.sendRawMessage("\nThat might not have been a good idea...\n");
            createExplosions(player, bed);
        }
    }

    private void createExplosions(Player player, Block block){

        float explosionPower = 5.0F;
        World world = player.getWorld();

        if (world.getEnvironment().equals(World.Environment.NORMAL)){
            world.createExplosion(block.getLocation(), explosionPower, false);
        }
    }
}
