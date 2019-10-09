package com.zookeeper.mammal;

public class Bat extends Mammal {
	public Bat() {
		super();
	}
	
	public void eatHumans(int number) {
		this.energyLevel += 25 * number;
		System.out.println("Crunch");
		System.out.println(this.displayEnergy());

	}
	public void attackTown(int amount) {
		this.energyLevel -=100*amount;
		System.out.println("Boooom");
		System.out.println(this.displayEnergy());

	}
	public void fly(int times) {
		this.energyLevel -= 50 * times;
		System.out.println("phewwww");
		System.out.println(this.displayEnergy());

	}
}
