package com.codingdojo.project;

public class ProjectTest {
	public static void main(String [] args) {
		Project fb= new Project("Facebook","Socialmedia");
		System.out.println(fb.getName());
		System.out.println(fb.getDescription());
		System.out.println(fb.elevatorPitch());

	}
}
