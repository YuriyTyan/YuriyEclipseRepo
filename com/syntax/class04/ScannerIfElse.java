package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		// Mac: command + shift + o'
		// Windows: ctrl + shift + o
		Scanner scan = new Scanner(System.in);

		// Ask the user to enter two numbers
		// Compare the number and print which one is larger

		System.out.println("Please enter your 1st number");
		int num1 = scan.nextInt();
		System.out.println("Please enter your 2nd number");
		int num2 = scan.nextInt();

		System.out.println("Numbers are " + num1 + " and " + num2);

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

	}

}
