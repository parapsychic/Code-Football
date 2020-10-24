package com.company;

public class Player {

    public String[] name = new String[2]; // This is an array with each element being first name, middle name and last name
    private int health, strength, skills, luckChance;

    // These are the worst way of doing this, but okay :)

    Player(){
        health = 1;
        strength = 1;
        skills = 1;
        luckChance = 1;
    }


    int setLuck(){
        // I am doing this because I have no idea on how to randomize numbers.
        return (int) (System.currentTimeMillis() % 10) / (10- luckChance);
    }

    // This will be used to calculate pass accuracy and goal chances
    int strike(int position) {
        // Assuming best position to be 5 and other attributes to have a max of 9 except health
        // MAX = 27
        // MIN = -96
        return position * ( ( setLuck() + skills ) + ( strength - (100 - health)));
    }

    int tackle(){
        return setLuck() * strength;
    }

    void setHealth(int damage){
        this.health= health - damage;
        this.strength = strength - ((100-health) / 10); // player strength decreases on health decrease
    }

    //SETTING PLAYER ATTRIBUTES WITH PLAYERS

    void Robin(){
        this.name[0] = "HOOD";
        this.name[1] = "Shield";
        this.health = 123;
        this.strength = 5;
        this.skills = 6;
        this.luckChance = 10;
    }

    void Tsukasa(){
        this.name[0] = "Tsukasa Andrew";
        this.name[1] = "Captain";
        this.health = 89;
        this.strength =6;
        this.skills = 8;
        this.luckChance = 5;
    }

    void Sathyan(){
        this.name[0] = "Jacoca";
        this.name[1] = "Captain";
        this.health = 95;
        this.strength = 2;
        this.skills = 5;
        this.luckChance = 3;
    }

}
