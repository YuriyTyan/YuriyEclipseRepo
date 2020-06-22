package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {

		// Capture the name from te user and print
		// Your name is ____

		// Ask the user to enter the age and print
		// Your name is ___ and age is ___

		// 1. We bring the Scanner Class to our program
		// System.in --> read from keyboard/console
		Scanner input = new Scanner(System.in);

		// We are instructing the user what to enter
		System.out.println("Please enter your full name");

		// We are capturing the whole line into a text variable
		String name = input.nextLine();
		System.out.println("Your name is " + name);

		// We are instructing the user what to enter
		System.out.println("Please enter your age as double!");
		// We are capturing the text as a double
		// If it is not a double an error/exception will be thrown
		double yourAge = input.nextDouble();
		System.out.println("Your name is " + name + " and your age is " + yourAge);

	}

}
