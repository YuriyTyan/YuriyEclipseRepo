package com.syntax.class21;

public class ChemistryTeacher extends Teacher {
	
	//Write a Java program called Teacher. Identify features and behavior of that Class.
	//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have 
	//it their own features and behavior. Test all 4 classes 
		
	static String position = "ChemistryTeacher";
	boolean experienced = false;
	boolean popular = false;
	String subject = "Chemistry";
	
	void does() {
		System.out.println(" teaches "+subject);
	}
	void givesHW() {
		System.out.println(" gives homework for "+subject+" classes");
	}
	
}
