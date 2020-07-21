package com.syntax.class25;

public class Computer {
	
	String brand, model;
	int MemorySize, year;
	double cpuFrequency;
	
	public Computer(String brand, String model, int MemorySize, double cpuFrequency, int year) {
		this.brand=brand;
		this.model=model;
		this.MemorySize=MemorySize;
		this.cpuFrequency=cpuFrequency;
		this.year=year;
	}
	
	public void displayInfo (String brand, String model, int MemorySize, double cpuFrequency, int year) {
		System.out.println("First "+brand+" computer, model "+model+" with CPU frequency "+cpuFrequency+ "MHZ and memory size of "
				+MemorySize+" kB was developed in "+year);
	}
}

class Apple extends Computer {

	public Apple(String brand, String model, int MemorySize, double cpuFrequency, int year) {
		super(brand, model, MemorySize, cpuFrequency, year);
		// TODO Auto-generated constructor stub
	}
}
class Lenovo extends Computer {

	public Lenovo(String brand, String model, int MemorySize, double cpuFrequency, int year) {
		super(brand, model, MemorySize, cpuFrequency, year);
		// TODO Auto-generated constructor stub
	}
}
class HP extends Computer {

	public HP(String brand, String model, int MemorySize, double cpuFrequency, int year) {
		super(brand, model, MemorySize, cpuFrequency, year);
		// TODO Auto-generated constructor stub
	}
}
class Dell extends Computer {

	public Dell(String brand, String model, int MemorySize, double cpuFrequency, int year) {
		super(brand, model, MemorySize, cpuFrequency, year);
		// TODO Auto-generated constructor stub
	}
}
