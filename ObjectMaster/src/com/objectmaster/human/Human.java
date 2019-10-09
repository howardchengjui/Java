package com.objectmaster.human;

public class Human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public void attack(Human enemy) {
		enemy.health -= this.strength;
	}
	
	public int displayHealth() {
		return this.health;
	}

}
