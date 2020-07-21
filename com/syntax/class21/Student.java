package com.syntax.class21;

public class Student {

	String name, address;

	Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	void displayInfo () {
		System.out.println(name + ", " + address);;
	}

	public static void main(String[] args) {
	
	Student one = new Student("John Doe", "123 Main Street");
	one.displayInfo();
	
	}
}
