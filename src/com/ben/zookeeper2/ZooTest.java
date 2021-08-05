package com.ben.zookeeper2;

public class ZooTest {

	public static void main(String[] args) {
		Mammal myMammal = new Mammal("Billy");
		String mammalName = myMammal.getName();
		System.out.println(mammalName);
		
		Mammal mammal2 = new Mammal();
		
		myMammal.displayEnergy();
		mammal2.displayEnergy();
		
		Gorilla koko = new Gorilla("Koko");
		koko.displayEnergy();
		koko.throwSomething();
		
		int whatCameBack = koko.eatBanana("hmmmm tasty");
		System.out.println(whatCameBack);
		
		Bat batman = new Bat("BATMAN");
		batman.displayEnergy();
		batman.fly();

	}

}
