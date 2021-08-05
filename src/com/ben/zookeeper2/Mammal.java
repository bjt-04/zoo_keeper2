package com.ben.zookeeper2;

public class Mammal {

	// ---------- member variable ----------
	public int energyLevel;
	private String name;
	
	
	// ---------- constructor ----------
	public Mammal(String name) {
		this.setName(name);
		this.setEnergyLevel(100);
	}
	
	public Mammal() {
		this.setName("un-named");
		this.setEnergyLevel(9000);
	}
	
	// ---------- methods ----------
	
	public int displayEnergy() {
		System.out.println(this.getName() + " energy: " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}

	
	// ---------- getters and setters ----------

	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
