package com.objectmaster.human;

public class HumanTest {
	public static void main(String [] args) {
		Human enemy= new Human();
		Human me=new Human();
		me.attack(enemy);
		enemy.attack(me);
		System.out.print(me.displayHealth());
		System.out.print(enemy.displayHealth());
		
		Wizard kevin= new Wizard();
		Ninja michael =new Ninja();
		Samurai justin= new Samurai();
		
		justin.meditate();
		System.out.println(justin.displayHealth());
		
		kevin.fireball(justin);
		System.out.println(justin.displayHealth());
		System.out.println(justin.howMany());

		
		
	}
}