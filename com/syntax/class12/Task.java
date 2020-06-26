package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		/*
		 * create a 2D that will store food of different kinds and retrieve all values
		 * from that array using 2 different loops
		 */

		String[][] food = { { "indian", "mediterranian", "chinese", "irish" }, { "italian", "georgian" },
				{ "scandinavian", "jordanian", "seafood" } };
		for (int r = 0; r < food.length; r++) {// loops over rows or 1d arrays

			for (int c = 0; c < food[r].length; c++) {// iterating over columns
				String animal = food[r][c];
				System.out.print(animal + " ");
			}
			System.out.println();
		}
		System.out.println("=================================");

		for (String[] cuisine : food) {

			for (String kitchen : cuisine) {
				System.out.print(kitchen + " ");
			}
			System.out.println();
		}
		/*
		 * lets create a 2D array of int and calculate sum of all odd numbers
		 */
		int[][] numbers = { { 10, 23, 56, 47 }, { 33, 668, 89 }, { 1, 9, 0 } };
		// regular for loop

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				int element = numbers[i][j];
				if (element % 2 != 0) {
					sum += element;
				}
			}
			System.out.println(sum);
		}
	}

}
