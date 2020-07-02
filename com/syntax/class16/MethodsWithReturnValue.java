package com.syntax.class16;

public class MethodsWithReturnValue {

	public static void main(String[] args) {

		// create a String and based on the number of characters define whether String
		// is long
		// or short. Long > 10, short if less

		String str = "I love Java";

		int length = str.length();
		if (length >= 10) {
			System.out.println("Created String is long");
		} else {
			System.out.println("Created String is short");
		}

		// identify which number is the largest and then define whether this
		// largest number is even or odd
		Task16 obj = new Task16();
		obj.biggerNum(10, 20);
	}

	// create the mothod that will return the largest number
	int largest(int a, int b) {
		int largest;

		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}
}
