package com.syntax.class25;

public class Store {
	
	String name, location;
	
	public Store(String name, String location) {
		this.name=name;
		this.location=location;
	}
	
	public void openHours() {
		System.out.println(name+" are open 8 AM - 8 PM");
	}
	
	public void sell() {
		System.out.println(name+" sell items");
	}
}

class Macys extends Store{
	
	public Macys(String name, String location) {
		super(name, location);
	}
	public void openHours() {
		System.out.println(name+" are open 8 AM - 12 PM");
	}
}

class Starbucks extends Store{
	
	public Starbucks(String name, String location) {
		super(name, location);
	}
	public void openHours() {
		System.out.println(name+" are open 6 AM - 12 PM");
	}
	public void sellDrinks() {
		System.out.println(name+" sells different type of drinks");
	}
}

class Nike extends Store{
	
	public Nike(String name, String location) {
		super(name, location);
	}
}

