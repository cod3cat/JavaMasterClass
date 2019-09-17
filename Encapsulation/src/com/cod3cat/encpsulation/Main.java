package com.cod3cat.encpsulation;

public class Main {

    public static void main(String[] args) {
	    /*Player player = new Player();
	    player.name = "cat";
	    player.health = 100;
	    player.weapon = "Magnum";

	    int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 92;
        player.loseHealth(damage);
		System.out.println("Remaining Health = " + player.healthRemaining());

		player.health = 1000;
		System.out.println("Player health = " + player.healthRemaining());
		damage = 100;
		player.loseHealth(damage);
		System.out.println("Remaining Health = " + player.healthRemaining());*/

	    EnhancedPlayer enhancedPlayer = new EnhancedPlayer("cat", 300, "Mangun");
		System.out.println("Player's initial health = " + enhancedPlayer.healthRemaining());
    }
}
