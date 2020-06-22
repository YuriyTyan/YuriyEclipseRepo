package com.syntax.class05;

import java.util.Scanner;

public class TaskGrade {

	public static void main(String [] args) {
		// Write a program that will read three inputs of scores (quiz, mid term, and final scores)
		// and determine the grade based on the following rules:
		// o if the average score >=90 --> grade=A
		// o if the average score >=70 and <90 --> grade=B
		// o if the average score >50 and <70 --> grade=C
		// o if the average score <50 --> grade=F
		
		Scanner uInput = new Scanner(System.in);
		System.out.println("Please enter your quiz score in whole numbers");
		int quiz = uInput.nextInt();
		System.out.println("Please enter your mid term score in whole numbers");
		int midTerm = uInput.nextInt();
		System.out.println("Please enter your final score");
		int fScore = uInput.nextInt();
		System.out.println("Please wait, grading your scores");
		int avgScore = (quiz+midTerm+fScore)/3;
		if (avgScore >= 90) {
			System.out.println("Your grade is A");
		} else if (avgScore >= 70 && avgScore < 90) {
			System.out.println("Your grade is B");
		} else if (avgScore > 50 && avgScore < 70) {
			System.out.println("Your grade is B");
		} else {
			System.out.println("Your grade is F");
		}
		
	}

}
