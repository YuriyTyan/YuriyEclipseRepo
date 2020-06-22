package com.syntax.class03;

public class Task2DoubleComparison {
	
	public static void main(String[] args) {
		/*Create a Java program and name it Double Comparison. Declare 2 double values and if value of first variable
		 *  is higher then the second, print "Double value __ is larger than __ ." Otherwise print...
		 */
		double d1 = 234.5668, d2 = 876.9876;
		if(d1>d2) {
			System.out.println("Double value " + d1 + " is larger than " +d2);
		} else if (d1==d2) {
			System.out.println("Double value " + d1 + " equals to " +d2);
		} else {
			System.out.println("Double value " + d1 + " is smaller than " +d2);
		}
		
	}

}
