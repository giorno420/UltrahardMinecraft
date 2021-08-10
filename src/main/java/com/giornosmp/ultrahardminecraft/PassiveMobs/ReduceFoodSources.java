package com.giornosmp.ultrahardminecraft.PassiveMobs;

import java.util.Random;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;


public class ReduceFoodSources implements Listener {

    Random randint = new Random();

    @EventHandler
    public void onCowSpawn(CreatureSpawnEvent passivemobspawn){

        if (passivemobspawn.getEntityType() == EntityType.COW) {
            int cowroulette = randint.nextInt(2); // if the integer is 0, the cow dies. If its 1, the cow lives another day
            // also this is called whenever a new cow spawns

            if (cowroulette == 0){
                Cow cow = (Cow) passivemobspawn.getEntity();
                cow.damage(14);
            }
            else {
                System.out.print(""); // again I absolutely hate the fact that I can't write an empty else
                // statement without getting an error
            }
        }
        if (passivemobspawn.getEntityType() == EntityType.SHEEP){

            int sheepRoulette = randint.nextInt(2);

            if (sheepRoulette == 0){
                Sheep sheep = (Sheep) passivemobspawn.getEntity();
                sheep.damage(14);
            }
            else {
                System.out.print("");
            }
        }
        if (passivemobspawn.getEntityType() == EntityType.PIG){

            int pigRoulette = randint.nextInt(2);

            if (pigRoulette == 0){
                Pig pig = (Pig) passivemobspawn.getEntity();
                pig.damage(14);
            }
            else {
                System.out.print("");
            }
        }
    }
}
