package com.zookeeper.mammal;

public class GorillaTest {
	public static void main(String [] args) {
		Gorilla harambe= new Gorilla();
		harambe.getName();
		harambe.throwSomething(3);
		harambe.eatBananas(2);
		harambe.climb(1);
		
		Gorilla silverback= new Gorilla();
		silverback.getName();
		silverback.throwSomething(1);
		silverback.eatBananas(1);
		silverback.climb(1);
		
	
	}
}