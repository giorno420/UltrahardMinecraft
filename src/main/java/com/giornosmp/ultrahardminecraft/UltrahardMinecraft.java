package com.giornosmp.ultrahardminecraft;

import com.giornosmp.ultrahardminecraft.Admin.NetheriteKit;
import com.giornosmp.ultrahardminecraft.Experience.ToolsRequireExperience;
import com.giornosmp.ultrahardminecraft.Beds.*;
import com.giornosmp.ultrahardminecraft.HostileBlocks.*;
import com.giornosmp.ultrahardminecraft.HostileMobs.*;
import com.giornosmp.ultrahardminecraft.Nether.*;
import com.giornosmp.ultrahardminecraft.PassiveMobs.*;
import com.giornosmp.ultrahardminecraft.Versions.CheckLatestVersion;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class UltrahardMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager pm = getServer().getPluginManager();
        this.getCommand("godkit").setExecutor(new NetheriteKit());

        Bukkit.getWorld("world").setDifficulty(Difficulty.HARD);
        Bukkit.getWorld("world_nether").setDifficulty(Difficulty.HARD);
        Bukkit.getWorld("world_the_end").setDifficulty(Difficulty.HARD);
        String pluginVersion = CheckLatestVersion.checkLatestVersion(); // version check



        pm.registerEvents(new Creepers(), this);
        // charges all creepers and makes them instantly explode in proximity

        pm.registerEvents(new UndeadMobs(), this);
        // gives all mobs better shit

        pm.registerEvents(new ReduceFoodSources(), this);
        // halves all livestock and fish

        pm.registerEvents(new PissIronGolems(), this);
        // pisses all iron golems in the vicinity

        pm.registerEvents(new ExplodingBeds(), this);
        // random chance of your bed just fucking exploding

        pm.registerEvents(new PissEndermen(), this);
        // pisses all endermen in the vicinity

        pm.registerEvents(new Lava(), this);
        // fix entire event listener later

        pm.registerEvents(new SkeletonTypeMobs(), this);
        // gives you a withering effect when attacked by skeletons and strays

        pm.registerEvents(new ToolsRequireExperience(), this);
        // all iron and diamond tools require experience levels to be used

        pm.registerEvents(new NetherBurnsYou(), this);
        // 1 in 1000 chance of nether burning you

        pm.registerEvents(new PissZombiePigmen(), this);
        // pisses all zombie pigmen

        pm.registerEvents(new GoldArmorMelts(), this);
        // gold armor melts in nether because it has a low melting point

        pm.registerEvents(new Hungery(), this);
        // makes you hungry after sleeping because that's how i woke up today

        pm.registerEvents(new Splinters(), this);
        // you get a splinter when you break wood

        pm.registerEvents(new LesserPiglins(), this);
        // decreases piglin spawn rate for the people with "dream luck"

        pm.registerEvents(new IncreaseMobs(), this);
        // increases the deadly nether mobs

        pm.registerEvents(new Blazes(), this);
        // stuff related to blazes

        pm.registerEvents(new Skeletons(), this);
        // aim bot

        pm.registerEvents(new Crystals(), this);
        // spawns tnt when end crystals are broken

    }

}
