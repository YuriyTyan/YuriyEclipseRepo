package com.syntax.class21;

public class PianoTeacher extends Teacher {
	
	//Write a Java program called Teacher. Identify features and behavior of that Class.
	//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have 
	//it their own features and behavior. Test all 4 classes 
		
	static String position = "PianoTeacher";
	boolean experienced = false;
	boolean popular = true;
	String subject = "Piano";
	
	void does() {
		System.out.println(" teaches "+subject+" classes");
	}
	void givesHW() {
		System.out.println(" gives homework for "+subject+" classes");
	}
}
