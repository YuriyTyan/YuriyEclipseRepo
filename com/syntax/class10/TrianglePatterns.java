package com.syntax.class10;

public class TrianglePatterns {

	public static void main(String[] args) {
		//Let us print the following triangle
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int r = 1; r <=5; r++) {
			
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========================");
		//Let us add the second triangle
		// ****
		// ***
		// **
		// *
		for (int r = 1; r <=5; r++) {
			
			for (int c = 4; c >= r; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
