package com.zookeeper.mammal;

public class Mammal {
	public String name;
	public int energyLevel;
	public int displayEnergy() {
		return this.energyLevel;
	}
	
	public Mammal() {
		this.energyLevel = 100;
	};
	
	public void setEnergy(int level) {
		this.energyLevel= level;
	}
    // setter
	
	
	public int getEnergy() {
		return energyLevel;
	}
    // getter
	
	public void setName(String name) {
		this.name= name;
	}
    // setter
	
	
	public String getName() {
		return this.name;
	}
    // getter
}
