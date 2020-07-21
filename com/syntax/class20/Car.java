package com.syntax.class20;

public class Car {
	
	public static String make;
	protected String model, color;
	
	int year, door, speed;
	private double price;
	
	public void displayInfo() {
		System.out.println("We build "+year+" "+make+" "+model+" for price = $"+price);
	}
	
	Car() {
		System.out.println("I am a constructor. I have NO RETURN type and my NAME must be SAME AS CLASS");
		make = "Ford";
		model = "F1";
		year = 2019;
		price = 1000.00;
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		/*
		 Car --> class name
		 car --> reference variable
		 new --> keyword
		 Car(); --> calling Constructor --> block of code that initializes the object (instance variables)
		 */
		car.displayInfo();
		System.out.println(car.model);
		
//		String driver = "Joe";
//		System.out.println(driver);
		
	}

}
