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

            if (player.getInventory().getHelmet().equals(new ItemStack(Material.GOLDEN_HELMET))) {
                ItemStack helm = player.getInventory().getHelmet();
                ItemMeta helmMeta = helm.getItemMeta();
                Damageable helmet = (Damageable) helmMeta;

                if (randint == 14) {
                    if (helmet == null) return;
                    helmet.setDamage(damage);
                    helm.setItemMeta((ItemMeta) helmet);
                    damage++;
                }
            }

            if (player.getInventory().getChestplate().equals(new ItemStack(Material.GOLDEN_CHESTPLATE))) {
                ItemStack chest = player.getInventory().getHelmet();
                ItemMeta chestMeta = chest.getItemMeta();
                Damageable chestplate = (Damageable) chestMeta;

                if (randint == 14) {
                    if (chestplate == null) return;
                    chestplate.setDamage(damage);
                    chest.setItemMeta((ItemMeta) chestplate);
                    damage++;
                }
            }

            if (player.getInventory().getLeggings().equals(new ItemStack(Material.GOLDEN_LEGGINGS))) {
                ItemStack leg = player.getInventory().getHelmet();
                ItemMeta legMeta = leg.getItemMeta();
                Damageable leggings = (Damageable) legMeta;

                if (randint == 14) {
                    if (leggings == null) return;
                    leggings.setDamage(damage);
                    leg.setItemMeta((ItemMeta) leggings);
                    damage++;
                }
            }

            if (player.getInventory().getBoots().equals(new ItemStack(Material.GOLDEN_BOOTS))) {
                ItemStack boot = player.getInventory().getHelmet();
                ItemMeta bootMeta = boot.getItemMeta();
                Damageable boots = (Damageable) bootMeta;

                if (randint == 14) {
                    if (boots == null) return;
                    boots.setDamage(damage);
                    boot.setItemMeta((ItemMeta) boots);
                    damage++;
                }

            }

        }

    }

}
