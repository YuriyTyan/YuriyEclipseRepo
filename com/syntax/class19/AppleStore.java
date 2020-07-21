package com.syntax.class19;

public class AppleStore {
	
	public static void main(String[] args) {
		
		//iPhone.touchScreen=false;
		
		iPhone phone1 = new iPhone();
		phone1.model="11 Pro";
		phone1.memory=256;
		phone1.color="White";
		phone1.price=1000;
//		phone1.displayDetails(); --> possible, not preferred
		iPhone.displayInfo();// preferred way
		
		iPhone.touchScreen = false;
		
		System.out.println("---2nd iPhone object---");
		iPhone phone2 = new iPhone();
		phone2.model="11";
		phone2.memory=64;
		phone2.color="Pink";
		phone2.price=900;
		phone2.displayDetails();
		iPhone.displayInfo();
		
		System.out.println("--- Calling info method again ---");
		phone1.displayInfo();
	}

}
