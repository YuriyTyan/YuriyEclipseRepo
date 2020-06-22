package com.syntax.class05;

import java.util.Scanner;

public class Task2pm {

	public static void main(String[] args) {

		// Prompt the user to enter person heights in inches. Person should be
		// classified
		// as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height in inches");

		int height = scan.nextInt();

		if (height >= 0 && height <= 59) {
			System.out.println("You are short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("You are medium");
		} else if (height >= 72) {
			System.out.println("You are tall");
		} else {
			System.out.println("Negative height is not possible!");

			System.out.println("-----------------------------------------"); 
			// Write a program that will print whether it is a weekend or weekday.
			// If any day from 1-5 → output "It is a weekday", any day from 6-7 → output "It
			// is a weekend", any other day → output "Invalid day"
			
			int day = 4;
			if (day >= 1 && day <= 5) {
				System.out.println("It is a weekday.");
			} else if (day >= 6 && day <= 7){
				System.out.println("It is a weekend");
			} else {
				System.out.println("Invalid day");
			}
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter day please!");
			int day1 = scan1.nextInt();
			if (day1 >=1 && day1<=5) {
				System.out.println("It is a weekday");
			} else if (day1 ==6 || day1 == 7) {
				System.out.println("It is weekend");
			} else {
				System.out.println("Wrong pattern");}
		}

	}

}
