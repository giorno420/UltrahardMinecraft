package com.giornosmp.ultrahardminecraft;

import com.giornosmp.ultrahardminecraft.Assistance.MobHints;
import com.giornosmp.ultrahardminecraft.ExplodingBeds.ExplodingBeds;
import com.giornosmp.ultrahardminecraft.HostileBlocks.Lava;
import com.giornosmp.ultrahardminecraft.HostileMobs.Creepers;
import com.giornosmp.ultrahardminecraft.HostileMobs.InstantlyExplodingCreepers;
import com.giornosmp.ultrahardminecraft.HostileMobs.UndeadMobs;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissEndermen;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissIronGolems;
import com.giornosmp.ultrahardminecraft.PassiveMobs.ReduceFoodSources;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


public final class UltrahardMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Creepers(), this); // charges all creepers
        getServer().getPluginManager().registerEvents(new UndeadMobs(), this); // gives all mobs better shit
        getServer().getPluginManager().registerEvents(new ReduceFoodSources(), this); // halves all livestock
        getServer().getPluginManager().registerEvents(new MobHints(), this); // gives hints to the player when the player encounters them
        getServer().getPluginManager().registerEvents(new PissIronGolems(), this); // pisses all iron golems in the vicinity
        getServer().getPluginManager().registerEvents(new ExplodingBeds(), this); // random chance of your bed just fucking exploding
        getServer().getPluginManager().registerEvents(new PissEndermen(), this); // pisses all endermen in the vicinity
        getServer().getPluginManager().registerEvents(new InstantlyExplodingCreepers(), this); // makes all creepers instantly explode in proximity
        getServer().getPluginManager().registerEvents(new Lava(), this); // fix entire event listener later

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
