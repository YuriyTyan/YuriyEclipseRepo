package com.syntax.class04;

import java.util.Scanner;

public class TaskCC {
	public static void main(String[] args) {

		// Create a Java program that will ask if user has a credit card or not.
		// If user does not have a credit card then offer them. If they do have one
		// ask what is balance on the card? If balance of the card is larger than 1000,
		// tell them
		// to pay off immediately, otherwise you can tell them that they can spend more

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? (Yes/No)");
		String answer1 = input.nextLine();
		if (answer1.equals("Yes")) {
			System.out.println("Please enter current balance on the card in whole numbers");
			int maxBalance = 1000;
			int currentBalance = input.nextInt();
			if (currentBalance < maxBalance) {
				System.out.println("You can spend "+(maxBalance-currentBalance)+" more");
			} else {
				System.out.println("Please pay off your card balance immediately!");
			}
		} else {
			System.out.println("We can offer you a credit card");
		}

	}

}
