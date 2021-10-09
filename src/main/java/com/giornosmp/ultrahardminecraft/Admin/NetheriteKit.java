package com.giornosmp.ultrahardminecraft.Admin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.*;

public class NetheriteKit implements CommandExecutor {

    private final String pluginPrefix = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Ultrahard Minecraft" + ChatColor.WHITE + "] ";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){

            Player player = (Player) sender;

            if (sender.isOp()) {

                // initialising items
                ItemStack netheriteHelmet = new ItemStack(Material.NETHERITE_HELMET);
                ItemStack netheriteChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
                ItemStack netheriteLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
                ItemStack netheriteBoots = new ItemStack(Material.NETHERITE_BOOTS);
                EntityEquipment equipment = player.getEquipment();
                PlayerInventory inventory = player.getInventory();

                ItemStack godNetheriteSword = new ItemStack(Material.NETHERITE_SWORD);
                ItemStack godNetheritePickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
                ItemStack godShield = new ItemStack(Material.SHIELD);

                // clear player inventory
                player.getInventory().clear();

                // enchant all armor pieces
                enchantArmorPiece(netheriteHelmet);
                enchantArmorPiece(netheriteChestplate);
                enchantArmorPiece(netheriteLeggings);
                enchantArmorPiece(netheriteBoots);

                // enchant sword
                godNetheriteSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                godNetheriteSword.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                godNetheriteSword.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);

                // enchant pickaxe
                godNetheritePickaxe.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                godNetheritePickaxe.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                godNetheritePickaxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);

                // enchant shield
                godShield.addUnsafeEnchantment(Enchantment.DURABILITY, 100);

                // add items to player inventory
                equipment.setHelmet(netheriteHelmet, true);
                equipment.setChestplate(netheriteChestplate, true);
                equipment.setLeggings(netheriteLeggings, true);
                equipment.setBoots(netheriteBoots, true);
                equipment.setItemInOffHand(godShield, true);

                inventory.addItem(godNetheriteSword);
                inventory.addItem(godNetheritePickaxe);
                inventory.addItem(new ItemStack(Material.COOKED_PORKCHOP, 128));

                return true;

            }

            if (!(player.isOp())){
                player.sendRawMessage(pluginPrefix + "Sorry, this command is only for server operators");
            }
        }

        if (!(sender instanceof Player)){sender.sendMessage(pluginPrefix + "Only players are allowed to run this command!"); return false;}
        return true;
    }

    private void enchantArmorPiece(ItemStack item){
        item.addEnchantment(Enchantment.DURABILITY, 3);
        item.addEnchantment(Enchantment.MENDING, 1);
        item.addEnchantment(Enchantment.THORNS, 3);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
    }
}
