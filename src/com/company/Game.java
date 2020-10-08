package com.company;
import java.util.*;

import static java.lang.System.exit;

public class Game {


    public static void StartGame(Player player){

        Scanner scan = new Scanner(System.in);
        String choice;

        System.out.println("CODE ! FOOTBALL");
        sleep(5000);
        System.out.println("He was born to play");
        sleep(3000);
        System.out.println("It's his entire life");
        sleep(3000);
        System.out.println("His name is " + player.name[0]);
        sleep(3000);
        System.out.println("Go for it, " + player.name[0] + ". Beat the world's best players");
        sleep(3000);

        System.out.println("CODE! FOOTBALL");
        System.out.println("Kickoff? (yes/no) ");
        choice = scan.nextLine();

        switch (choice){
            case "yes" : break;
            case "no"  : exit(0);
            default: System.out.println("We don't do that here"); exit(1);

        }

        /* Start Game */

    }
    static void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

