package com.giornosmp.ultrahardminecraft.Admin;

import com.sun.tools.javac.jvm.Items;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class NetheriteKit implements CommandExecutor {

    private final String pluginPrefix = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Ultrahard Minecraft" + ChatColor.WHITE + "] ";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (sender.isOp()) {
                player.getInventory().clear();
                ItemStack netheriteHelmet = new ItemStack(Material.NETHERITE_HELMET);
                netheriteHelmet.addEnchantment(Enchantment.DURABILITY, 3);
                netheriteHelmet.addEnchantment(Enchantment.MENDING, 1);
                netheriteHelmet.addEnchantment(Enchantment.THORNS, 3);
                netheriteHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                ItemStack netheriteChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
                netheriteChestplate.addEnchantment(Enchantment.DURABILITY, 3);
                netheriteChestplate.addEnchantment(Enchantment.MENDING, 1);
                netheriteChestplate.addEnchantment(Enchantment.THORNS, 3);
                netheriteChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                ItemStack netheriteLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
                netheriteLeggings.addEnchantment(Enchantment.DURABILITY, 3);
                netheriteLeggings.addEnchantment(Enchantment.MENDING, 1);
                netheriteLeggings.addEnchantment(Enchantment.THORNS, 3);
                netheriteLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                ItemStack netheriteBoots = new ItemStack(Material.NETHERITE_BOOTS);
                netheriteBoots.addEnchantment(Enchantment.DURABILITY, 3);
                netheriteBoots.addEnchantment(Enchantment.MENDING, 1);
                netheriteBoots.addEnchantment(Enchantment.THORNS, 3);
                netheriteBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                player.getEquipment().setHelmet(netheriteHelmet, true);
                player.getEquipment().setChestplate(netheriteChestplate, true);
                player.getEquipment().setLeggings(netheriteLeggings, true);
                player.getEquipment().setBoots(netheriteBoots, true);

                ItemStack godNetheriteSword = new ItemStack(Material.NETHERITE_SWORD);
                godNetheriteSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                godNetheriteSword.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                godNetheriteSword.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);

                ItemStack godNetheritePickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
                godNetheritePickaxe.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                godNetheritePickaxe.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                godNetheritePickaxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);

                ItemStack godShield = new ItemStack(Material.SHIELD);
                godShield.addUnsafeEnchantment(Enchantment.DURABILITY, 100);

                player.getEquipment().setItemInOffHand(godShield, true);
                player.getInventory().addItem(godNetheriteSword);
                player.getInventory().addItem(godNetheritePickaxe);
                player.getInventory().addItem(new ItemStack(Material.COOKED_PORKCHOP, 128));
                return true;
            }
            if (!(player.isOp())){
                player.sendRawMessage(pluginPrefix + "Sorry, this command is only for server operators");
            }
        }
        if (!(sender instanceof Player)){sender.sendMessage(pluginPrefix + "Only players are allowed to run this command!"); return false;}
        return true;
    }
}
