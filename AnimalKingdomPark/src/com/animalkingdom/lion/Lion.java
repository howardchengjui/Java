package com.animalkingdom.lion;

public class Lion {
	public int age;
	public int weight;
	public String name;
	public static int numOfLions;
	
	public Lion() {};

	public Lion(int age, int weight, String name) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
		
		numOfLions++;
	}
}
