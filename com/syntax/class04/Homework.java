package com.syntax.class04;

public class Homework {
	
	public static void main(String[] args) {
		
		// 1st way
		int num = -4;
		if (num > 0) {
			System.out.println("Number is positive!");
		} else if (num < 0) {
			System.out.println("Number is negative!");
		} else {
			System.out.println("Number is zero!");
			
		// 2nd way, both ways are acceptable
		if (num > 0) {
			System.out.println("Number is positive!");
		} else if (num == 0) {
			System.out.println("Number is zero!");
		} else {
			System.out.println("Number is negative!");
		}
		}
		
		// task3 odd or even number check
		int num1 = 5;
		int remainder = num1 % 2;
		if (remainder == 0 ) {
			System.out.println(num1 + " is even");
		} else {
			System.out.println(num1 + " is odd");
		}
		
	}

}
