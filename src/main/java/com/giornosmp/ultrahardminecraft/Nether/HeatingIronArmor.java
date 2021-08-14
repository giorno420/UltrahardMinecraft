package com.giornosmp.ultrahardminecraft.Nether;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class HeatingIronArmor implements Listener {

    @EventHandler
    public void burnPlayerIfIronArmor(PlayerMoveEvent event) {

        Player player = (Player) event.getPlayer();

        if (player.getWorld().getEnvironment().equals(World.Environment.NETHER)){
            EntityEquipment equipment = player.getEquipment();
            if (equipment.getHelmet() == null || equipment.getChestplate() == null || equipment.getLeggings() == null || equipment.getBoots() == null) return;
            if (equipment.getHelmet().equals(new ItemStack(Material.IRON_HELMET)) && equipment.getChestplate().equals(new ItemStack(Material.IRON_CHESTPLATE)) && equipment.getLeggings().equals(new ItemStack(Material.IRON_LEGGINGS)) && equipment.getBoots().equals(new ItemStack(Material.IRON_BOOTS))) {
                player.damage(2);
                this.showMessage(player, "You're melting in your armor");
            }
        }
    }
    @SuppressWarnings("Deprecated")
    private void showMessage(Player player, String message) {
        player.sendTitle("", message, 2, 5, 20);
    }
}
