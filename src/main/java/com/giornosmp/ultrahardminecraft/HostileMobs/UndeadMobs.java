package com.giornosmp.ultrahardminecraft.HostileMobs;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class UndeadMobs implements Listener {

    private void noDrops(LivingEntity entity){
        entity.getEquipment().setHelmetDropChance(0);
        entity.getEquipment().setChestplateDropChance(0);
        entity.getEquipment().setLeggingsDropChance(0);
        entity.getEquipment().setBootsDropChance(0);
        entity.getEquipment().setItemInMainHandDropChance(0);
        entity.getEquipment().setItemInOffHandDropChance(0);
    }

    @EventHandler
    public void undeadMobSpawn(CreatureSpawnEvent event) {

        ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack boots = new ItemStack(Material.IRON_BOOTS);

        if (event.getEntityType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();

            zombie.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            zombie.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            zombie.getEquipment().setBoots(boots);
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 1, false, false));

            noDrops(zombie);
        }

        if (event.getEntityType() == EntityType.HUSK) {

            Husk husk = (Husk) event.getEntity();
            EntityEquipment huskEquipment = husk.getEquipment();

            huskEquipment.setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
            huskEquipment.setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            huskEquipment.setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
            huskEquipment.setItemInMainHand(new ItemStack(Material.WOODEN_AXE));

            noDrops(husk);
        }

        if (event.getEntityType() == EntityType.WITHER_SKELETON) {
            WitherSkeleton witherskeleton = (WitherSkeleton) event.getEntity();

            witherskeleton.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            witherskeleton.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            witherskeleton.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
            witherskeleton.getEquipment().setItemInOffHand(new ItemStack(Material.SHIELD));

            noDrops(witherskeleton);
        }

        if (event.getEntityType() == EntityType.DROWNED) {
            Drowned drowned = (Drowned) event.getEntity();
            drowned.getEquipment().setChestplate(chestplate);
            drowned.getEquipment().setItemInMainHand(new ItemStack(Material.TRIDENT));

            noDrops(drowned);
        }

        if (event.getEntityType() == EntityType.STRAY) {
            Stray stray = (Stray) event.getEntity();

            ItemStack enchantedBow = new ItemStack(Material.BOW);
            enchantedBow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 3);
            stray.getEquipment().setItemInMainHand(enchantedBow);

            noDrops(stray);
        }
        if (event.getEntityType() == EntityType.SKELETON) {
            Skeleton skeleton = (Skeleton) event.getEntity();
            skeleton.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));

            ItemStack enchantedBow = new ItemStack(Material.BOW);
            enchantedBow.addEnchantment(Enchantment.ARROW_FIRE, 1);
            enchantedBow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 3);
            skeleton.getEquipment().setItemInMainHand(enchantedBow);

            noDrops(skeleton);

        }

        if (event.getEntityType() == EntityType.SPIDER) {
            Spider spider = (Spider) event.getEntity();
            spider.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 2, false, false));
        }

        if (event.getEntityType() == EntityType.CAVE_SPIDER){
            CaveSpider cavespider = (CaveSpider) event.getEntity();
            cavespider.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 2, false, false));
        }

    }

}
