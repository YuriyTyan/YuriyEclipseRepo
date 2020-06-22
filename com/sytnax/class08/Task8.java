package com.sytnax.class08;

import java.util.Scanner;

public class Task8 {
	
	// 1.Print numbers from 1 to 50 except those that are divisible by 3
	
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) { // divisible by 3
				continue;
			}
			System.out.println(i);
		}
		// Create a program that will be asking user to apply for a credit card 10 times. 
		// As soon you get an “yes” from a user program should stop asking.
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 101; i <= 110; i++) {
			System.out.println("Do you want to apply for a credit card?");
			String answer = scan.next();
			
			if (answer.contentEquals("yes")) {
				System.out.println("Congrats. Now you are in debt!");
				break;
			}
			
		}
	}
	

}
