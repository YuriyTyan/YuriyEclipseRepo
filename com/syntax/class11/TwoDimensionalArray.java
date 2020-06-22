package com.syntax.class11;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		int[][] numbers = new int[3][4]; // [rows][columns]
		//1st row
		numbers[0][0] = 10;
		numbers[0][1] = 15;
		numbers[0][2] = 20;
		numbers[0][3] = 25;
		
		//2nd row, row with index 1
		numbers[1][0] = 32;
		numbers[1][1] = 36;
		numbers[1][2] = 40;
		numbers[1][3] = 44;
//		numbers[1][3] = 32; // runtime error, OutOfBounds Exception
		
		
		// 2D arrays are arrays of arrays
		//if we know the values upfront
		int[][] nums = {
				{ 10, 15, 20, 25},
				{ 32, 36, 40, 44},
				{ 63, 66, 69, 72}
		};
		
		System.out.println(nums[2][0]); // 63
		System.out.println(nums[1][3]); // 44
	}

}
