package com.syntax.class09;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// White a program that reads a range of integers (start and end poit)
		// provided by a user and then from that range
		// prints the sum of the even and odd integers.
		// print also the sum of all the numbers

		Scanner scan = new Scanner(System.in);
		int start, end; // I don't need to initialize because I will read from input
		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;

		System.out.println("Please enter a starting number:");
		start = scan.nextInt();

		System.out.println("Please enter an ending number:");
		end = scan.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) { // even number
				sumEven += i;
			} else { // odd number
				sumOdd += i;
			}
			// 1st way
			total += 1;
		}

		System.out.println("Sum of even numbers is " + sumEven);
		System.out.println("Sum of even numbers is " + sumOdd);
		// total = sumEven + sumOdd; // second way
		System.out.println("Sum of even numbers is " + total);

	}

}
