package com.giornosmp.ultrahardminecraft.Nether;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

public class GoldArmorMelts implements Listener {

    private final int randint = new Random().nextInt(50);
    private int damage = 1;

    @EventHandler
    public void goldArmorMelts(PlayerMoveEvent event){
        Player player = (Player) event.getPlayer();

        if (player.getWorld().getEnvironment().equals(World.Environment.NETHER)) {
            if (!(player.getInventory().getHelmet().equals(new ItemStack(Material.GOLDEN_HELMET)))) return;
            if (player.getInventory().getHelmet().equals(new ItemStack(Material.GOLDEN_HELMET))) {
                ItemStack helm = player.getInventory().getHelmet();
                ItemMeta helmMeta = helm.getItemMeta();
                Damageable helmet = (Damageable) helmMeta;

                if (randint == 14) {
                    if (helmet == null) return;
                    helmet.setDamage(damage);
                    damage++;
                }
                helm.setItemMeta((ItemMeta) helmet);
                // test plugin and fix this
            }
        }
        if (!(player.getWorld().getEnvironment().equals(World.Environment.NETHER))) return;
    }

}
