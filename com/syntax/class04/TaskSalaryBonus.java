package com.syntax.class04;

import java.util.Scanner;

public class TaskSalaryBonus {

	public static void main(String[] args) {
		//Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus,
		// otherwise he is not. Once user is eligible and salary is larger than 50000 then bonus = 5000,
		// otherwise bonus = 3000.
		
		Scanner myScan = new Scanner(System.in);
		System.out.println("Please number of years worked in whole numbers");
		int eSalary = 50000, eYears = 5, bonus1 = 5000, bonus2 = 3000;
		int worked = myScan.nextInt();
		if (worked >= eYears) {
			System.out.println("Please enter your salary");
			int salary = myScan.nextInt();
			if (salary > eSalary) {
				System.out.println("Your bonus is " + bonus1);
				
			} else {
				System.out.println("Your bonus is " + bonus2);
			}
			
		} else {
			System.out.println("You are not eligible for the bonus");
		}
		
		
	}
	
}
