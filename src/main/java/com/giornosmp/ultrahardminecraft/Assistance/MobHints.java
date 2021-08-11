package com.giornosmp.ultrahardminecraft.Assistance;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MobHints implements Listener {

    String[] hostiles_ = {
            EntityType.ZOMBIE.name(),
            EntityType.SKELETON.name(),
            EntityType.HUSK.name(),
            EntityType.SKELETON.name(),
            EntityType.WITHER_SKELETON.name(),
            EntityType.STRAY.name(),
            EntityType.SKELETON.name(),
            EntityType.SPIDER.name(),
            EntityType.CREEPER.name()
    };

    String[] livestock_ = {
            EntityType.SHEEP.name(),
            EntityType.COW.name(),
            EntityType.PIG.name(),
            EntityType.COD.name(),
            EntityType.SALMON.name()
    };

    Set<String> hostileMobs = new HashSet<>(Arrays.asList(hostiles_));
    Set<String> peacefulMobs = new HashSet<>(Arrays.asList(livestock_));
    int findingLivestock = 1;
    int findingHostiles = 1;
    int findingIronGolem = 1;
    int findingEnderMen = 1;
    private final String pluginPrefix = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Ultrahard Minecraft" + ChatColor.WHITE + "] ";

    @EventHandler
    public void hints(PlayerMoveEvent event) {

        Player player = (Player) event.getPlayer();
        for(Entity entity : player.getNearbyEntities(15, 15, 15)){
            if (player.isOp()){ break; }
            if (player.getGameMode() == GameMode.CREATIVE | player.getGameMode() == GameMode.SPECTATOR){ break; }

            if (findingHostiles <= 1) {
                if (hostileMobs.contains(entity.getType().name())) {
                    player.sendRawMessage(pluginPrefix + ChatColor.ITALIC + "The following is to help you out a bit, just to help you out:\n   - All zombies have better armor\n   - All skeletons and strays have stronger bows and give withering effects\n   - All spiders and cave spiders are faster\n   - All creepers are charged and instantly explode\n\nand more to come!");
                    findingHostiles++;
                }
            }
                if (findingLivestock <= 1) {
                    if (peacefulMobs.contains(entity.getType().name())) {
                        player.sendRawMessage(pluginPrefix + ChatColor.ITALIC + "Huh, you've done it! You've found a peaceful mob! But be careful with them, as the chances of them spawning are halved");
                        findingLivestock++;
                    }
                }
                if (findingIronGolem <= 1) {
                    if (entity.getType() == EntityType.IRON_GOLEM) {
                        player.sendRawMessage(pluginPrefix + ChatColor.ITALIC + "I see you found an Iron Golem, but be careful, don't enter a 10 block radius to it ;)");
                        findingIronGolem++;
                    }
                }
                if (findingEnderMen <= 1) {
                    if (entity.getType() == EntityType.ENDERMAN) {
                        player.sendRawMessage(pluginPrefix + ChatColor.ITALIC + "Ah! An enderman! Beware, for they are always pissed at you, so don't get close to them...");
                        findingEnderMen++;
                    }
                }
            if (findingHostiles > 1) { break; }
            if (findingLivestock > 1) { break ;}
            if (findingIronGolem > 1) { break; }
            if (findingEnderMen > 1) { break; }
        }
    }
}
