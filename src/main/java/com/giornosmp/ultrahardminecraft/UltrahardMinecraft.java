package com.giornosmp.ultrahardminecraft;

import com.giornosmp.ultrahardminecraft.Admin.NetheriteKit;
import com.giornosmp.ultrahardminecraft.Experience.ToolsRequireExperience;
import com.giornosmp.ultrahardminecraft.ExplodingBeds.ExplodingBeds;
import com.giornosmp.ultrahardminecraft.ExplodingBeds.Hungery;
import com.giornosmp.ultrahardminecraft.HostileBlocks.Lava;
import com.giornosmp.ultrahardminecraft.HostileMobs.*;
import com.giornosmp.ultrahardminecraft.Nether.GoldArmorMelts;
import com.giornosmp.ultrahardminecraft.Nether.NetherBurnsYou;
import com.giornosmp.ultrahardminecraft.Nether.PissZombiePigmen;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissEndermen;
import com.giornosmp.ultrahardminecraft.PassiveMobs.PissIronGolems;
import com.giornosmp.ultrahardminecraft.PassiveMobs.ReduceFoodSources;
import com.giornosmp.ultrahardminecraft.Versions.CheckLatestVersion;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class UltrahardMinecraft extends JavaPlugin {

    private final String pluginPrefix = ChatColor.WHITE + "[" + ChatColor.DARK_RED + "Ultrahard Minecraft" + ChatColor.WHITE + "] ";


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

        pluginmanager.registerEvents(new AttackOnTitan(), this);
        // a zombie has a 1 in 50 chance of dying and becoming a titan (giant) I'm gonna work on the zombie AI soon fuck you

        pluginmanager.registerEvents(new NetherBurnsYou(), this);
        // 1 in 1000 chance of nether burning you

        pluginmanager.registerEvents(new PissZombiePigmen(), this);
        // pisses all zombie pigmen in a 3 block radius to you

        pluginmanager.registerEvents(new GoldArmorMelts(), this);
        // testing

        pluginmanager.registerEvents(new Hungery(), this);
        // makes you hungry after sleeping because that's how i woke up today

        if (pluginVersion.equals("beta")) {
            System.out.println(pluginPrefix + "UltrahardMinecraft beta is enabled!");
        }
        if (!(pluginVersion.equals("beta"))) {
            System.out.println(pluginPrefix + "You're running an old version of UltrahardMinecraft! Go to https://github.com/giorno420/UltrahardMinecraft and get the latest version!");
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
