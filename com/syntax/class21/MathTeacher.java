package com.syntax.class21;

public class MathTeacher extends Teacher {
	
	void displayInfo() {
		super.displayInfo();
	
	name = "John Doe";
	position = "MathTeacher";
	experienced = true;
	popular = true;
	String subject="Math";
	}
	
	

	public static void main(String[] args) {
		
		MathTeacher a = new MathTeacher();
		a.name = "John Doe";
		a.position = "MathTeacher";
		a.experienced = true;
		a.popular = true;
		a.subject="Math";
		
		a.displayInfo();
		
		
	}
	
}
