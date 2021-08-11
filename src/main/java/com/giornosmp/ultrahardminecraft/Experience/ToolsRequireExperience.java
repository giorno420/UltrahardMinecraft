package com.giornosmp.ultrahardminecraft.Experience;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ToolsRequireExperience implements Listener{

    Set<ItemStack> irontools = new HashSet<>(Arrays.asList(
            new ItemStack(Material.IRON_AXE),
            new ItemStack(Material.IRON_HOE),
            new ItemStack(Material.IRON_SHOVEL),
            new ItemStack(Material.IRON_SWORD),
            new ItemStack(Material.IRON_PICKAXE)
    ));
    Set<ItemStack> diamondtools = new HashSet<>(Arrays.asList(
            new ItemStack(Material.DIAMOND_AXE),
            new ItemStack(Material.DIAMOND_HOE),
            new ItemStack(Material.DIAMOND_SHOVEL),
            new ItemStack(Material.DIAMOND_SWORD),
            new ItemStack(Material.DIAMOND_PICKAXE)
    ));

    @EventHandler
    public void ironToolsRequireExperience(PlayerMoveEvent event){
        Player player = (Player) event.getPlayer();
        if (irontools.contains(player.getInventory().getItemInMainHand())){
            if (player.getLevel() < 5){
                player.sendTitle("", "You need to be more than Level 5 to use Iron tools", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
        if (diamondtools.contains(player.getInventory().getItemInMainHand())){
            if (player.getLevel() < 7){
                player.sendTitle("", "You need to be more than Level 7 to use Diamond tools", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }


        if (player.getEquipment().getHelmet().equals(new ItemStack(Material.IRON_HELMET))){
            if (player.getLevel() < 5){
                player.sendTitle("", "You need to be more than Level 5 to use Iron Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
        if (player.getEquipment().getChestplate().equals(new ItemStack(Material.IRON_CHESTPLATE))){
            if (player.getLevel() < 5){
                player.sendTitle("", "You need to be more than Level 5 to use Iron Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
        if (player.getEquipment().getLeggings().equals(new ItemStack(Material.IRON_LEGGINGS))){
            if (player.getLevel() < 5){
                player.sendTitle("", "You need to be more than Level 5 to use Iron Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
        if (player.getEquipment().getBoots().equals(new ItemStack(Material.IRON_BOOTS))){
            if (player.getLevel() < 5){
                player.sendTitle("", "You need to be more than Level 5 to use Iron Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }



        if (player.getEquipment().getHelmet().equals(new ItemStack(Material.DIAMOND_HELMET))){
            if (player.getLevel() < 7){
                player.sendTitle("", "You need to be more than Level 7 to use Diamond Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
        if (player.getEquipment().getChestplate().equals(new ItemStack(Material.DIAMOND_CHESTPLATE))){
            if (player.getLevel() < 7){
                player.sendTitle("", "You need to be more than Level 7 to use Diamond Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
        if (player.getEquipment().getLeggings().equals(new ItemStack(Material.DIAMOND_LEGGINGS))){
            if (player.getLevel() < 7){
                player.sendTitle("", "You need to be more than Level 7 to use Diamond Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
        if (player.getEquipment().getBoots().equals(new ItemStack(Material.DIAMOND_BOOTS))){
            if (player.getLevel() < 7){
                player.sendTitle("", "You need to be more than Level 7 to use Diamond Armor", 1, 2, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
            }
        }
    }
}
