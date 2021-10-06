package com.giornosmp.ultrahardminecraft;

import com.giornosmp.ultrahardminecraft.Admin.NetheriteKit;
import com.giornosmp.ultrahardminecraft.Experience.ToolsRequireExperience;
import com.giornosmp.ultrahardminecraft.Beds.ExplodingBeds;
import com.giornosmp.ultrahardminecraft.Beds.Hungery;
import com.giornosmp.ultrahardminecraft.HostileBlocks.Crystals;
import com.giornosmp.ultrahardminecraft.HostileBlocks.Lava;
import com.giornosmp.ultrahardminecraft.HostileMobs.*;
import com.giornosmp.ultrahardminecraft.Nether.*;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissZombiePigmen;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissEndermen;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissIronGolems;
import com.giornosmp.ultrahardminecraft.PassiveMobs.ReduceFoodSources;
import com.giornosmp.ultrahardminecraft.Versions.CheckLatestVersion;
import com.giornosmp.ultrahardminecraft.HostileBlocks.Fire;
import com.giornosmp.ultrahardminecraft.HostileBlocks.Splinters;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class UltrahardMinecraft extends JavaPlugin {

    private final String pluginPrefix = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Ultrahard Minecraft" + ChatColor.WHITE + "] ";
    private final String version = "beta";


    @Override
    public void onEnable() {

        PluginManager pluginmanager = getServer().getPluginManager();
        this.getCommand("godkit").setExecutor(new NetheriteKit());

        Bukkit.getWorld("world").setDifficulty(Difficulty.HARD);
        Bukkit.getWorld("world_nether").setDifficulty(Difficulty.HARD);
        Bukkit.getWorld("world_the_end").setDifficulty(Difficulty.HARD);
        String pluginVersion = CheckLatestVersion.checkLatestVersion(); // version check



        pluginmanager.registerEvents(new Creepers(), this);
        // charges all creepers

        pluginmanager.registerEvents(new UndeadMobs(), this);
        // gives all mobs better shit

        pluginmanager.registerEvents(new ReduceFoodSources(), this);
        // halves all livestock and fish

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

        pluginmanager.registerEvents(new NetherBurnsYou(), this);
        // 1 in 1000 chance of nether burning you

        pluginmanager.registerEvents(new PissZombiePigmen(), this);
        // pisses all zombie pigmen

        pluginmanager.registerEvents(new GoldArmorMelts(), this);
        // gold armor melts in nether because it has a low melting point

        pluginmanager.registerEvents(new Hungery(), this);
        // makes you hungry after sleeping because that's how i woke up today

        pluginmanager.registerEvents(new Fire(), this);
        // fire always stays

        pluginmanager.registerEvents(new Splinters(), this);
        // you get a splinter when you break wood

        pluginmanager.registerEvents(new LesserPiglins(), this);
        // decreases piglin spawn rate for the people with "dream luck"

        pluginmanager.registerEvents(new IncreaseMobs(), this);
        // increases the deadly nether mobs

        pluginmanager.registerEvents(new Blazes(), this);
        // stuff related to blazes

        pluginmanager.registerEvents(new Skeletons(), this);
        // aim bot

        pluginmanager.registerEvents(new Crystals(), this);
        // spawns tnt when end crystals are broken

    }

}
