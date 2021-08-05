package com.ben.zookeeper2;

public class Gorilla extends Mammal {

	
	// ---------- constructors ----------
	
	public Gorilla(String name) {
		super(name);
		
	}

	public Gorilla() {
		
	}
	
	// ---------- methods ----------
	
	public void throwSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println(getName() + " throws a rock and its energy is now " + getEnergyLevel());
	}
	
	public int eatBanana(String taste) {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println(getName() + " says the banana is " + taste);
		return getEnergyLevel();
	}
	
	public void climb() {
		
	}

}
