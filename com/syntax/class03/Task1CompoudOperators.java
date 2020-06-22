package com.syntax.class03;

public class Task1CompoudOperators {
	public static void main(String[] args) {
		
		//1. Declare variable and increase by 100 using shorthand operator
		int num = 123;
		num += 100;
		System.out.println(num);

		//2. Declare variable and decrease by 67 using shorthand operator
		int num1 = 23;
		num1 -= 67;
		System.out.println(num1);
		
		//3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
		// each person should get an equal piece of cake
		double cakePiece = 11; 
		cakePiece /= 4;
		System.out.println(cakePiece);
		
		//4. Declare variable cakePiece=25 and divide cakePiece between 7 people . Using shorthand operator find 
		// out how many pieces of cake left after it was distributed equally among 7 people
		cakePiece = 25;
		cakePiece %= 7;
		System.out.println("Pieces of cake left after equal distribution " + cakePiece);
	}

}
