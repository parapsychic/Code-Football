package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice;
        Player player = new Player();


        System.out.println(" CODE !  FOOTBALL");
        System.out.println("> Press enter / return to start  <");
        scan.next();

        System.out.println("Select player: ");
        System.out.println(" 1. Robin Shield \n 2. Captain Tsukasa \n 3. A P Sathyan ");
        choice= scan.nextInt();

        switch (choice) {
            case 1 -> player.Robin();
            case 2 -> player.Tsukasa();
            case 3 -> player.Sathyan();
        }
        Game.StartGame();

    }
}
