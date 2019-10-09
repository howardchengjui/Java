package com.codingdojo.project;

public class Project {
	public String name;
	public String description;
	
	public String elevatorPitch() {
		return this.name+":"+this.description;
	}
	
	public Project() {};

	public Project(String name) {
		this.name=name;
	}

	public Project(String name, String description) {
		this.name=name;
		this.description=description;
	}
	
	public void setName(String name) {
		this.name= name;
	}
    // setter
	
	
	public String getName() {
		return name;
	}
    // getter
	
	
	public void setDescription(String description) {
		this.description= description;
	}
    // setter
	
	
	public String getDescription() {
		return description;
	}
    // getter
}
