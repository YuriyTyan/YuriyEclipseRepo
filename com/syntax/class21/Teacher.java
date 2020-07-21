package com.syntax.class21;

public class Teacher {
//Write a Java program called Teacher. Identify features and behavior of that Class.
//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have 
//it their own features and behavior. Test all 4 classes 
	
	static String SchoolName = "Best School";
	static String name;
	static String position;
	boolean experienced;
	boolean popular;
	String subject;
	
	void displayInfo() {
		System.out.println(name+" is "+position+" and teaches "+subject+" at "+SchoolName);
		System.out.println(name+" is experienced = "+experienced+" and is popular = "+popular);
	}
}
