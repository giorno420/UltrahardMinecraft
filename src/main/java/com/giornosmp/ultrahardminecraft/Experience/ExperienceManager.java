package com.giornosmp.ultrahardminecraft.Experience;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ExperienceManager {

    public static void ironTools(Player player){
        player.sendTitle("", "You need to be more than Level 5 to use Iron tools", 1, 2, 1);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
    }

    public static void ironArmor(Player player){
        player.sendTitle("", "You need to be more than Level 5 to use Iron Armor", 1, 2, 1);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
    }


    public static void diamondTools(Player player){
        player.sendTitle("", "You need to be more than Level 7 to use Diamond tools", 1, 2, 1);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
    }

    public static void diamondArmor(Player player){
        player.sendTitle("", "You need to be more than Level 7 to use Diamond armor", 1, 2, 1);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3, 100, true, true));
    }
}
