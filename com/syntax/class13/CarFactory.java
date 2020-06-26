package com.syntax.class13;

public class CarFactory {
	
	public static void main(String[] args) {
		
		//building an object of the car
		Car car1 = new Car();
		car1.make="Tesla";
		car1.model="X";
		car1.color="Red";
		car1.year=2020;
		car1.speed=200;
		System.out.println("Make of 1 car is "+car1.make+" and model is "+car1.model+" and it is in "+car1.color+" color");
		
		//building an object of the car
		Car car2 = new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.color="Blue";
		car2.year=2018;
		car2.speed=240;
		System.out.println("Make od 2 car is "+car2.make);
		
		//new Bus(); compiler will give an error
		//because we never created Bus class
		
		Car car3 = new Car();
		car1.make="Honda";
		car1.model="CR-V";
		car1.color="Grey";
		car1.year=2019;
		car1.speed=140;
		System.out.println("Make of 3rd car is "+car1.make+" and model is "+car1.model+" and it is in "+car1.color+" color");
		
		Car car4 = new Car();
		car1.make="Fiat";
		car1.model="Uno";
		car1.color="White";
		car1.year=1960;
		car1.speed=60;
		System.out.println("Make of 4th car is "+car1.make+" and model is "+car1.model+" and it is in "+car1.color+" color");
		
		
	}

}
