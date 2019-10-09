package com.objectmaster.human;

public class Ninja extends Human {
	public Ninja () {
		this.stealth=10;
	}
	
	public void steal(Human enemy) {
		enemy.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		this.health -= 10;
	}
	
	public int displayHealth() {
		return this.health;
	}

}

