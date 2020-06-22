package com.syntax.class02;

public class JavaClass2Homework {
	public static void main (String [] args) {
		// Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		// Your program should say. "The _______ of 2 numbers ___ and ___ is equal to _____"
		double num1 = 15.6;
		float num2 = 18.128f;
		double addn = num1 + num2, subs = num1 - num2, mult = num1 * num2, divn = num1 / num2;
		String add = "addition", sub = "substraction", mlt = "multiplication", div = "division";
				
		System.out.println("The " + add + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + addn);
		System.out.println("The " + sub + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + subs);
		System.out.println("The " + mlt + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult);
		System.out.println("The " + div + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + divn);
		System.out.println("----------------------------------------------------------------");
		
		// Write a program to find the square of the number 3.9. You program should say "The square of the ____ is ____ "
		double num3 = 3.9;
		double sqr = num3 * num3;
		
		System.out.println("The square of the " + num3 +" is " + sqr);
		System.out.println("----------------------------------------------------------------");
		
		/* Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
		 * Your program should say. 
		 *"The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"*/
		int w = 5, h = 8;
		int prmtr = 2 * (w + h), area = w * h;
		System.out.println("The perimeter of a rectangle with width " + w + " and height " + h +
		" is equal to " + prmtr +" and the area is " + area);
				
		
	}

}
