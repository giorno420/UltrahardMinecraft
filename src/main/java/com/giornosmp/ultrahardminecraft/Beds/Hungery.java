package com.giornosmp.ultrahardminecraft.Beds;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class Hungery implements Listener {

    @EventHandler
    public void hungerPlayer(PlayerBedLeaveEvent event){

        Player player = (Player) event.getPlayer();

        player.setSaturation(player.getSaturation() - 10F);
        player.setFoodLevel(player.getFoodLevel() - 10);
    }
}
