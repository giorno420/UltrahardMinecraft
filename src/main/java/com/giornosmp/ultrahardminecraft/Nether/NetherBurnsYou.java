package com.giornosmp.ultrahardminecraft.Nether;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Random;

public class NetherBurnsYou implements Listener {

    @EventHandler
    public void netherBurnsYou(PlayerMoveEvent event) {

        Player player = (Player) event.getPlayer();
        int randint = new Random().nextInt(1000);

        if (randint == 420){
            if (player.getWorld().getEnvironment().equals(World.Environment.NETHER)) {
                player.setFireTicks(1000000000);
                displayTitle(player);
            }
            if (!(player.getWorld().getEnvironment().equals(World.Environment.NETHER))){
                System.out.print("");
            }
        }
    }

    private void displayTitle(Player player){
        player.sendTitle("", "The nether is too hot for you.", 2, 3, 20);
    }
}
