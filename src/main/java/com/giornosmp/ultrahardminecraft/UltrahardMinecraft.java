package com.giornosmp.ultrahardminecraft;

import com.giornosmp.ultrahardminecraft.Assistance.MobHints;
import com.giornosmp.ultrahardminecraft.Experience.ToolsRequireExperience;
import com.giornosmp.ultrahardminecraft.ExplodingBeds.ExplodingBeds;
import com.giornosmp.ultrahardminecraft.HostileBlocks.Lava;
import com.giornosmp.ultrahardminecraft.HostileMobs.*;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissEndermen;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissIronGolems;
import com.giornosmp.ultrahardminecraft.PassiveMobs.ReduceFoodSources;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


public final class UltrahardMinecraft extends JavaPlugin {

    private final String pluginPrefix = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Ultrahard Minecraft" + ChatColor.WHITE + "] ";

    @Override
    public void onEnable() {
        PluginManager pluginmanager = getServer().getPluginManager();

        pluginmanager.registerEvents(new Creepers(), this);
        // charges all creepers

        pluginmanager.registerEvents(new UndeadMobs(), this);
        // gives all mobs better shit

        pluginmanager.registerEvents(new ReduceFoodSources(), this);
        // halves all livestock and fish

        pluginmanager.registerEvents(new MobHints(), this);
        // gives hints to the player when the player encounters them

        pluginmanager.registerEvents(new PissIronGolems(), this);
        // pisses all iron golems in the vicinity

        pluginmanager.registerEvents(new ExplodingBeds(), this);
        // random chance of your bed just fucking exploding

        pluginmanager.registerEvents(new PissEndermen(), this);
        // pisses all endermen in the vicinity

        pluginmanager.registerEvents(new InstantlyExplodingCreepers(), this);
        // makes all creepers instantly explode in proximity

        pluginmanager.registerEvents(new Lava(), this);
        // fix entire event listener later

        pluginmanager.registerEvents(new SkeletonTypeMobs(), this);
        // gives you a withering effect when attacked by skeletons and strays

        pluginmanager.registerEvents(new ToolsRequireExperience(), this);
        // all iron and diamond tools require experience levels to be used

        pluginmanager.registerEvents(new AttackOnTitan(), this);
        // a zombie has a 1 in 50 chance of dying and becoming a titan (giant) I'm gonna work on the zombie AI soon fuck you

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "difficulty hard"); // ligma balls

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    
}
