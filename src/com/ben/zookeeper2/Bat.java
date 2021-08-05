package com.ben.zookeeper2;

public class Bat extends Mammal {
	
	private int speed;
	
	// ---------- constructors ----------

	public Bat(String name) {
		super(name);
		setEnergyLevel(300);
		setSpeed(10000);
		
	}

	public Bat() {
		setEnergyLevel(300);
		setSpeed(10000);
	}
	
	// ---------- methods ----------
	
	public void fly() {
		System.out.println(getName() + " flies with the speed of " + this.getSpeed());
	}
	
	
	// ---------- getters and setters ----------
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
