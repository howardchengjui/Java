package com.objectmaster.human;

public class Samurai extends Human{
	public static int numberofSamurai =0;

	
	public Samurai() {
		this.health=200;
		numberofSamurai++;
	}
	public void deathBlow(Human person) {
		person.health =0;
		this.health = this.health/2;
	}
	
	public void meditate() {
		this.health = this.health*2;
	}
	
	public int howMany() {
		return numberofSamurai;
	}

	public int displayHealth() {
		return this.health;
		
	}
}
