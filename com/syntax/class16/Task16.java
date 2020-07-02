package com.syntax.class16;

public class Task16 {

	// Create a method that will take 2 parameters as a numbers and prints
	// which number is larger.

	void biggerNum(int a, int b) {
		if (a > b) {
			System.out.println("Number" + a + " is bigger than " + b);
		} else {
			System.out.println("Number" + b + " is bigger than " + a);
		}
	}
	// Create a method that will take a number and prints whether the number
	// is even or odd.

	void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
	// Create a method that will print whether given String is palindrome or not.
	void palindrom(String word) {
		String b = "";
		for (int i = word.length()-1; i>=0; i--) {
			b +=word.charAt(i);
		}
		if (b.contentEquals(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " isn't palindrome");
		}
	}
	void sayHello (String country) {
		
		country = country.toLowerCase();
		
		switch (country) {
		
		case "usa":
			System.out.println("Hello");
			break;
		
		case "turkey":
			System.out.println("Merhaba");
			break;
			
		case "egypt":
			System.out.println("Ehlen wa Sahlen");
			break;
			
		case "russia":
			System.out.println("Zdravstvuite");
			break;
		default:
			System.out.println("Hi");
		}
	}
}
