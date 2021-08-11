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

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

import com.giornosmp.ultrahardminecraft.Experience.ExperienceManager;

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
    public void shitRequiresExperience(PlayerMoveEvent event){
        Player player = (Player) event.getPlayer();
        if (irontools.contains(player.getInventory().getItemInMainHand())){
            if (player.getLevel() < 5){
                ExperienceManager.ironTools(player);
            }
        }

        if (diamondtools.contains(player.getInventory().getItemInMainHand())){
            if (player.getLevel() < 7){
                ExperienceManager.diamondTools(player);
            }
        }


        if (Objects.equals(Objects.requireNonNull(player.getEquipment()).getHelmet(), new ItemStack(Material.IRON_HELMET))){
            if (player.getLevel() < 5){
                ExperienceManager.ironArmor(player);
            }
        }
        if (Objects.equals(player.getEquipment().getChestplate(), new ItemStack(Material.IRON_CHESTPLATE))){
            if (player.getLevel() < 5){
                ExperienceManager.ironArmor(player);
            }
        }
        if (Objects.equals(player.getEquipment().getLeggings(), new ItemStack(Material.IRON_LEGGINGS))){
            if (player.getLevel() < 5){
                ExperienceManager.ironArmor(player);
            }
        }
        if (Objects.equals(player.getEquipment().getBoots(), new ItemStack(Material.IRON_BOOTS))){
            if (player.getLevel() < 5){
                ExperienceManager.ironArmor(player);
            }
        }



        if (Objects.equals(player.getEquipment().getHelmet(), new ItemStack(Material.DIAMOND_HELMET))){
            if (player.getLevel() < 7){
                ExperienceManager.diamondArmor(player);
            }
        }
        if (player.getEquipment().getChestplate() == null) {
            return;
        }
        if (player.getEquipment().getChestplate().equals(new ItemStack(Material.DIAMOND_CHESTPLATE))){

            if (player.getLevel() < 7){
                ExperienceManager.diamondArmor(player);
            }
        }
        if (player.getEquipment().getLeggings() == null) {
            return;
        }
        if (player.getEquipment().getLeggings().equals(new ItemStack(Material.DIAMOND_LEGGINGS))){
            if (player.getLevel() < 7){
                ExperienceManager.diamondArmor(player);
            }
        }
        if (player.getEquipment().getBoots() == null){
            return;
        }
        if (player.getEquipment().getBoots().equals(new ItemStack(Material.DIAMOND_BOOTS))){
            if (player.getLevel() < 7){
                ExperienceManager.diamondArmor(player);
            }
        }
    }
}
