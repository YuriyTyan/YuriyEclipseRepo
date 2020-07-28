package com.syntax.class27;

public interface Driveable {//interface is a collection of abstract methods and public final static variables
	
	String DRIVE = "Drive safe";// by default compiler adds public static final to variables
	
	//int maxSpeed; cannot have instance variables because compiler adds PSF
	
	void driving();//by default compiler adds public abstract to methods
	
	void breaking();
}
//we can extend ONLY 1 class but we can implement multiple interfaces
abstract class Motorcycle extends Vehicle implements Driveable{//abstract class

	@Override
	public void driving() {
		System.out.println("Motorcycle is driving");
	}
}

class Harley extends Motorcycle{//concrete class
	
	public void breaking() {
		System.out.println("All bikes can break");
	}
}

class Vehicle{
	
	public void operateVehicle() {
		System.out.println("To operate any vehicle we need to have driver licence");
	}
}
