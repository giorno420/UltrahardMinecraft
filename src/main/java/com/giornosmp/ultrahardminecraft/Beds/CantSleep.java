package com.giornosmp.ultrahardminecraft.Beds;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import java.util.Random;

public class CantSleep implements Listener {

    @EventHandler
    public void boredNess(PlayerBedEnterEvent event) {

        Player player = (Player) event.getPlayer();

        int random = new Random().nextInt(10);

        if (random == 5) {
            event.setCancelled(true);
            player.sendTitle("", "You don't feel like sleeping right now", 1, 1, 1);
        }

    }

}
