package com.syntax.class10;

public class TaskUntil2_35 {
	
	public static void main(String[] args) {
		
		// 1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades = { 'A', 'B', 'C', 'D', 'E','F'};
		System.out.println("The grade is " + grades[1]);
		
		char[] grades1 = new char[6];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';
		System.out.println("The grade is " + grades1[1]);
		
		System.out.println("-----not enough time to complete the task----");
		
		// 1.Create an array of names and store all names of your group. Then print your name 
		// from that array. (use 2 different ways of creating an array).
		// Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using 
		// elements of array: �Saturday is Java coding Day�.
		
		String[] words = {"Java", "Saturday", "day", "coding", "is"};
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
				
		
		
	}

}
