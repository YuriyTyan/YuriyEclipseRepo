package com.syntax.class15;

public class HW1 {

	// Create a String and if the String is not empty perform the following: 
	// if the String has an odd number of characters and has 3 or more characters,
	// print the character in the middle of the String.

	public static void main(String[] args) {
		
		String myString = "Abrogast";
		
		int size = myString.length();
		
		if (!myString.isEmpty()) {
			if (size >=3) {
				if (size % 2 !=0) {
					int half = (size / 2);
					System.out.println(myString.charAt(half));
				
				} else {
					System.out.println("This string has an even number of characters");{
					}
					} else {
					System.out.println("This string has less than 3 characters");
				}
				
			}
			
		}
}