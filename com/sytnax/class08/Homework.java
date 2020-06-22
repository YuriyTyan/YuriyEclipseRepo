package com.sytnax.class08;

public class Homework {

	public static void main(String[] args) {

		// print numbers from 100 to 1
		// ____step 1____step 2___step4
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("----Print numbers 1,2,3,-----");
		for (int i = 1; i <= 3; i++) {
			System.out.print(i+", ");
		}
		System.out.println("\n----Print odd numbers between 20 and 50 (1st way)");// Print odd numbers between 20 and 50 (2 ways)
		for (int i = 20; i <= 50; i++) {
			if (i %2 == 1) {
			System.out.println(i);
			}
		}
		// Print odd numbers between 20 and 50 (2nd way)
		for (int i = 21; i <=50; i+=2) {
			System.out.println(i);
		}
		System.out.println("----Printing numbers between 5 and 1---");
		//  for (int j = 5; j >= 1; j--) {
			for (int j = 5; j > 0; j--) {
			System.out.println(j);
		}
			System.out.println("---What is the result----");
			int total = 1;
			for (int k = 1; k <= 4; k++) {
				total += k;
			}
			System.out.println(total);
	}
}
