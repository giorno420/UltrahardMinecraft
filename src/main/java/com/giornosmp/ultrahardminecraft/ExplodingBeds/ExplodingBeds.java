package com.giornosmp.ultrahardminecraft.ExplodingBeds;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import java.util.Random;

public class ExplodingBeds implements Listener {

    int bedWarning = 1;
    private final String pluginPrefix = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Ultrahard Minecraft" + ChatColor.WHITE + "] ";

    @EventHandler
    public void onSleep(PlayerBedEnterEvent event) {


        int randint = new Random().nextInt(100);
        Player player = (Player) event.getPlayer();
        Block bed = event.getBed();

        if (randint == 1){
            player.sendRawMessage("\nThat might not have been a good idea...\n");
            event.setCancelled(true);
            if (event.isCancelled()){
                BedManager.createExplosions(player, bed);
            }

        }
        if (randint != 1){
            if (bedWarning == 1){
                bedWarning++;
                player.sendRawMessage(pluginPrefix + "The Nether is spreading into the overworld slowly, your bed might just explode ;)");
            }
        }

    }
}
