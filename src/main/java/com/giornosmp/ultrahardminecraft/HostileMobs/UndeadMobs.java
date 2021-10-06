package com.giornosmp.ultrahardminecraft.HostileMobs;

import com.sun.tools.javac.jvm.Items;
import org.apache.commons.lang.ObjectUtils;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class UndeadMobs implements Listener {

    @EventHandler
    public void undeadMobSpawn(CreatureSpawnEvent undeadmobspawnevent) {

        // YEAH YEAH I know this is a very shit way to do it but
        // I'm not that experienced in Java
        // so I decided to just copy paste it
        // instead of using a function or an ArrayList

        ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack boots = new ItemStack(Material.IRON_BOOTS);

        if (undeadmobspawnevent.getEntityType() == EntityType.ZOMBIE) {

            Zombie zombie = (Zombie) undeadmobspawnevent.getEntity();

            zombie.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            zombie.getEquipment().setHelmetDropChance(0);
            zombie.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            zombie.getEquipment().setChestplateDropChance(0);
            zombie.getEquipment().setBoots(boots);
            zombie.getEquipment().setBootsDropChance(0);
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 1, false, false));
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.HUSK) {

            Husk husk = (Husk) undeadmobspawnevent.getEntity();

            husk.getEquipment().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
            husk.getEquipment().setHelmetDropChance(0);
            husk.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            husk.getEquipment().setChestplateDropChance(0);
            husk.getEquipment().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
            husk.getEquipment().setLeggingsDropChance(0);

            husk.getEquipment().setItemInMainHand(new ItemStack(Material.WOODEN_AXE));
            husk.getEquipment().setItemInMainHandDropChance(0);
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.WITHER_SKELETON) {

            WitherSkeleton witherskeleton = (WitherSkeleton) undeadmobspawnevent.getEntity();

            witherskeleton.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            witherskeleton.getEquipment().setHelmetDropChance(0);
            witherskeleton.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            witherskeleton.getEquipment().setChestplateDropChance(0);

            witherskeleton.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
            witherskeleton.getEquipment().setItemInMainHandDropChance(0);
            witherskeleton.getEquipment().setItemInOffHand(new ItemStack(Material.SHIELD));
            witherskeleton.getEquipment().setItemInOffHandDropChance(0);
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.DROWNED) {

            Drowned drowned = (Drowned) undeadmobspawnevent.getEntity();
            drowned.getEquipment().setChestplate(chestplate);
            drowned.getEquipment().setChestplateDropChance(0);
            drowned.getEquipment().setItemInMainHand(new ItemStack(Material.TRIDENT));
            drowned.getEquipment().setItemInMainHandDropChance(0);
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.STRAY) {

            Stray stray = (Stray) undeadmobspawnevent.getEntity();

            ItemStack enchantedBow = new ItemStack(Material.BOW);
            enchantedBow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 3);
            stray.getEquipment().setItemInMainHand(enchantedBow);
            stray.getEquipment().setItemInMainHandDropChance(0);
        }
        if (undeadmobspawnevent.getEntityType() == EntityType.SKELETON) {

            Skeleton skeleton = (Skeleton) undeadmobspawnevent.getEntity();
            skeleton.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
            skeleton.getEquipment().setHelmetDropChance(0);

            ItemStack enchantedBow = new ItemStack(Material.BOW);
            enchantedBow.addEnchantment(Enchantment.ARROW_FIRE, 1);
            enchantedBow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 3);
            skeleton.getEquipment().setItemInMainHand(enchantedBow);
            skeleton.getEquipment().setHelmetDropChance(0);
        }
        if (undeadmobspawnevent.getEntityType() == EntityType.SPIDER) {

            Spider spider = (Spider) undeadmobspawnevent.getEntity();

            spider.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 2, false, false));
        }
        if (undeadmobspawnevent.getEntityType() == EntityType.CAVE_SPIDER){

            CaveSpider cavespider = (CaveSpider) undeadmobspawnevent.getEntity();

            cavespider.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 2, false, false));
        }

    }
}
