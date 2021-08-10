package com.giornosmp.ultrahardminecraft.HostileMobs;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
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

        ItemStack mobhelmet = new ItemStack(Material.IRON_HELMET);
        ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
        ItemStack boots = new ItemStack(Material.IRON_BOOTS);

        if (undeadmobspawnevent.getEntityType() == EntityType.ZOMBIE) {

            Zombie zombie = (Zombie) undeadmobspawnevent.getEntity();

            zombie.getEquipment().setHelmet(mobhelmet);
            zombie.getEquipment().setChestplate(chestplate);
            zombie.getEquipment().setLeggings(leggings);
            zombie.getEquipment().setBoots(boots);
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.HUSK) {

            Husk husk = (Husk) undeadmobspawnevent.getEntity();

            husk.getEquipment().setHelmet(mobhelmet);
            husk.getEquipment().setChestplate(chestplate);
            husk.getEquipment().setLeggings(leggings);
            husk.getEquipment().setBoots(boots);

            husk.getEquipment().setItemInMainHand(new ItemStack(Material.NETHERITE_HOE));
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.WITHER_SKELETON) {

            WitherSkeleton witherskeleton = (WitherSkeleton) undeadmobspawnevent.getEntity();

            witherskeleton.getEquipment().setHelmet(mobhelmet);
            witherskeleton.getEquipment().setChestplate(chestplate);
            witherskeleton.getEquipment().setLeggings(leggings);
            witherskeleton.getEquipment().setBoots(boots);

            witherskeleton.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_HOE));
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.DROWNED) {

            Drowned drowned = (Drowned) undeadmobspawnevent.getEntity();

            drowned.getEquipment().setHelmet(mobhelmet);
            drowned.getEquipment().setChestplate(chestplate);
            drowned.getEquipment().setLeggings(leggings);
            drowned.getEquipment().setBoots(boots);
            drowned.getEquipment().setItemInMainHand(new ItemStack(Material.TRIDENT));
        }

        if (undeadmobspawnevent.getEntityType() == EntityType.STRAY) {

            Stray stray = (Stray) undeadmobspawnevent.getEntity();

            ItemStack enchantedBow = new ItemStack(Material.BOW);
            enchantedBow.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 10);
            stray.getEquipment().setItemInMainHand(enchantedBow);
        }
        if (undeadmobspawnevent.getEntityType() == EntityType.SKELETON) {

            Skeleton skeleton = (Skeleton) undeadmobspawnevent.getEntity();

            ItemStack enchantedBow = new ItemStack(Material.BOW);
            enchantedBow.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 10);
            skeleton.getEquipment().setItemInMainHand(enchantedBow);
        }
        if (undeadmobspawnevent.getEntityType() == EntityType.SPIDER) {

            Spider spider = (Spider) undeadmobspawnevent.getEntity();

            spider.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 2, false, false));
        }

    }
}
