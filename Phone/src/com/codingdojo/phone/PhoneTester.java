package com.codingdojo.phone;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9= new Galaxy( "S8",50,"Sprint","LALALA");
		Iphone iphoneTen= new Iphone("X plus",700,"T-mobile","Nihao");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());

		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}
}
