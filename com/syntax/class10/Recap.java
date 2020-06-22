package com.syntax.class10;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		System.out.println("----Task 3---");
		// Print the following pattern:
		// *
		// **
		// ***
		// ****
		// *****
		// If I want, I can read floors and rooms from a Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();
		System.out.println("How many rooms in each floor?");
		int rooms = scan.nextInt();
		
		for (int i = 1; i <= floors; i++) {
			// We just moved to a new floor
			System.out.print("We are in floor " + i + "--> ");
			
			//We are iterating the rooms
			for (int j = 1; j <= rooms; j++) {
				
				System.out.print(i + "." + j +" ");
			}
			//The stairs to the next floor
			System.out.println();
		}

	}
}
