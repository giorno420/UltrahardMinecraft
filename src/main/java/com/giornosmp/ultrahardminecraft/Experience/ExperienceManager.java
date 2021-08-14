package com.giornosmp.ultrahardminecraft.Experience;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ExperienceManager {

    public static void ironTools(Player player){
        showMessage(player, "You need to be more than Level 5 to use Iron tools");
    }

    public static void ironArmor(Player player) {
        showMessage(player, "You need to be more than Level 5 to use Iron Armor");
    }

    public static void diamondTools(Player player){
        showMessage(player, "You need to be more than Level 7 to use Diamond tools");
    }

    public static void diamondArmor(Player player){
        showMessage(player, "You need to be more than Level 7 to use Diamond armor");
    }
    @SuppressWarnings("Deprecated")
    public static void showMessage(Player player, String message) {
        player.sendTitle("", message, 2, 5, 20);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
    }
}
