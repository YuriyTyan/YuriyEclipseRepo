package com.syntax.class11;

public class Homework11 {
	
	public static void main(String[] args) {
		
		// Create an array of animals and store 6 elements into it.
		// Using 2 different loops print all elements from the array
		
		String[] animals = { "Horse", "Cat", "Dog", "Pig", "Cow", "Sheep" };
		
		for (int i = 0; i<(animals.length/2); i++) {
			System.out.print(animals[i] + ", ");
		}
		for  (int j = 5; j>=3; j--) {
			System.out.print(animals[j] + ", ");
		}
		System.out.println();
		System.out.println("===========================================");
		
		// Create an array of integers and calculate the sum of all integer elements in an array
		
		int[] intArray = { 10, 25, 31, 47, 89, 91, 167, 938, 13917 };
		int total = 0;
		for (int i = 0; i < intArray.length; i++) {
			total += intArray[i];
		}
		System.out.println(total);
		System.out.println("===========================================");
		
	}


}
