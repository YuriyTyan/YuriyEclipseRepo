package com.syntax.class18;

public class Students {
	
//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.studentName = "John";
		s1.studentID = 12345;
		Students.numberOfStudents++;
		
		Students s2 = new Students();
		s2.studentName = "Jane";
		s2.studentID = 678910;
		Students.numberOfStudents++;
		
		Students s3 = new Students();
		s3.studentName = "Jane";
		s3.studentID = 34567;
		Students.numberOfStudents++;
		
		System.out.println(Students.numberOfStudents);
		
		
	}

}
