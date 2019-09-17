package com.cod3cat.encpsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
            //Reduce the number of remaining lives for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
