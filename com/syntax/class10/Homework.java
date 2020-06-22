package com.syntax.class10;

public class Homework {

	public static void main(String[] args) {
		// Let us print the following triangle
		// *
		// **
		// ***
		// ****
		// *****

		for (int r = 5; r > 0; r--) {

			for (int c = r; c >= 1; c--) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("===========================");
		// Let us add the second triangle
		// ****
		// ***
		// **
		// *
		for(int i = 1; i <= 4;i++) {
			
			for (int j = i; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
