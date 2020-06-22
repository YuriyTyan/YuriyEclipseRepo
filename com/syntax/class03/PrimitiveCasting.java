package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
		// widening, implicit casting, automatically
		double d = 7;
		System.out.println(d);
		
		// int i = 7.58; // compile time error: Type mismatch: cannot convert from double to int
		
		// narrowing, explicit casting, manually
		int i = (int) 7.58;
		System.out.println(i);
				
		// narrowing a large number into a byte
		// explicitly doing it, manually
		byte b = (byte) 123865;
		System.out.println(b);
		
		// narrowing/explicitly/manually
		// you are trying to fit smtng from a big box
		// into a small box
		long l1 = 45;
		int number1 = (int) l1;
		System.out.println("number1 = " + number1);
		
		long l2 = 123865L; //011011, 1101110
		int number2 = (int) l2;
		System.out.println("number2 = " + number2);
		
		
	}

}
