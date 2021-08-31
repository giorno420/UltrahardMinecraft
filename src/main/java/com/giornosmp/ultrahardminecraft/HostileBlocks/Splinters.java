package com.giornosmp.ultrahardminecraft.HostileBlocks;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Random;

public class Splinters implements Listener {

    final int randint = new Random().nextInt(20);

    @EventHandler
    public void onBreakWithHand(PlayerInteractEvent event) {

        if (event.getPlayer().getGameMode().equals((Object) GameMode.CREATIVE) || event.getPlayer().getGameMode().equals((Object)GameMode.SPECTATOR)) {
            return;
        }
        if (event.getAction().equals((Object) Action.LEFT_CLICK_BLOCK) && event.getPlayer().getEquipment().getItemInMainHand().getType().equals(Material.AIR)) {
            final String blockMaterial = event.getClickedBlock().getType().toString().toLowerCase();
            if (blockMaterial.contains("log") && randint == 10) {
                displayTitle(event.getPlayer());
                event.getPlayer().damage(1.5);
            }
        }

    }

    private void displayTitle(final Player player) {
        player.sendTitle("", "You got a splinter from breaking wood barehanded!", 2, 3, 20);
    }


}
