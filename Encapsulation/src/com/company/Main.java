package com.company;

public class Main {

    public static void main(String[] args) {
	Player player=new Player();
	player.name="Akash";
	player.weapon="Sniper";
	player.health=20;

	int damage=15;
	player.health=(200);
	player.losehealth(damage);
        System.out.println("Health is " +player.remaininghealth());
    }
}

