package com.syntax.class27;

public class MotorcycleTest {
	
	public static void main(String[] args) {
		
		//new Drivable(); CE: cannot instantiate
		
		//new Motorcycle();CE: cannot instantiate
		
		System.out.println("------Object of Motorcycle type-------");
		Motorcycle m=new Harley();
		m.driving();
		m.breaking();
		m.operateVehicle();
		//Motorcycle.DRIVE="not safe";CE: cannot change the value of final variable
		System.out.println(Motorcycle.DRIVE);//static variable accessible by class name
		
		System.out.println("------Object of Driveable type-------");
		Driveable d=new Harley();
		d.driving();
		d.breaking();
		System.out.println(Driveable.DRIVE);
		
		Vehicle a = new Harley();
		a.operateVehicle();
	}
}
