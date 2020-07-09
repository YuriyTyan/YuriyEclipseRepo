package com.syntax.class19;

public class iPhone {
	
	static String brand = "Apple";
	static String OS = "iOS";
	static boolean touchScreen = true;
	
	String model;
	int memory;
	double price;
	String color;
	
	static void displayInfo() {// static works only with static
		System.out.println("iPhone belongs to brand "+brand+
				" and it has operating system called "+OS+
				" and all iPhones have touchscreen = "+touchScreen);
	}
//	static void displayDetails() { //static methods cannot access instance/non-static members/variables
//		System.out.println("We buildn iPhone "+model+" with memory = "+memory+" in "+color+" for the price = "+price);
//	}
	
	 void displayDetails() { //static methods cannot access instance/non-static members/variables
		System.out.println("We build iPhone "+model+" with memory = "+memory+
				" in "+color+" for the price = "+price);
	}

}
