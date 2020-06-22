package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		boolean b1 = !true;
		System.out.println(b1);// --> false
		
		boolean b2 = !false;
		System.out.println(b2);// --> true
		
		boolean cold = true;
		
		if (!cold) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		System.out.println("----------------------------");
		// If it is not Monday or Friday we have a class
		
		int day = 5;
		if (day != 1 && day != 5) {
			System.out.println("We have a class");
		} else {
			System.out.println("We are sleeping");
		}
		
	}
	
}
