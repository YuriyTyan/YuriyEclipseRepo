package com.syntax.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		//Using scanner class create calculator.
		//Allow user to enter two numbers and operator (+,-,*,/)
		//Based on operator provide the result to the user
		Scanner input = new Scanner(System.in);
		double result = 0;
		
		System.out.println("Please enter the first number:");
		double num1 = input.nextDouble();
		
		System.out.println("Please enter the second number:");
		double num2 = input.nextDouble();
		
		System.out.println("Please enter the operator:");
		char operator = input.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			System.out.println("Invalid operator!");
		}
		if (operator =='+' || operator =='-' || operator =='*' || operator =='/') { 
		System.out.println("The result of ("+num1+" "+operator+" "+num2+") is: " + result);
		
		}
	}
	
}
