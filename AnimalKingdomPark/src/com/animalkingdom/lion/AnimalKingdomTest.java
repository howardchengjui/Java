package com.animalkingdom.lion;

public class AnimalKingdomTest {
	public static void main(String [] args) {
		Lion simba= new Lion(5,500,"Simba");

		System.out.println(simba.name);
		System.out.println(simba.weight);
		System.out.println(Lion.numOfLions);

	}
}
