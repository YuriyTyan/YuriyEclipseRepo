package com.syntax.class01;

public class PracticeVariables {

	public static void main(String [] args) {
	
		// homework1 create variables for all 8 primitive data types, print each on sep line, test range
	
	byte num00 = 127; // 1 byte, stores whole numbers -128 to +127
	// test range -129, +128 cannot convert int to byte, tested cannot re-assign duplicate local variable
	char symbol ='$'; // 2 bytes, stores a single character/letter or ASCII values
	// test range - single character only, cannot re-assign duplicate local variable
	short num01 = 32767; // tested range -32769, +32768 type mismatch: cannot convert int to short
	// cannot re-assign duplicate local variable
	int num02 = 2147483647; // 4 bytes, stores whole numbers -2,147,483,648 to +2,147,482,647 most used
	// test range +2147483648, -2147483649 the literal 214-x of type int is out of range, cannot re-assign duplicate local variable
	long num03 = 1234567890123456789L; // 8 bytes, stores whole numbers -2in63 to 2in63-1, L or l at the end
	// test range tested +-9999999999999999999 the literal 9-x of type long is out of range
	float num04 = 45.123456F; // 4 bytes, stores fractional numbers up to 6 or 7 decimal digits, F or f at the end
	// test range +-399999999999999999999999999999999999999.999999F the literal 39-.x of type float is out of range
	double num05 = 22.123456789010202; // 8 bytes, stores fractional numbers up to 15 decimal digits most used
	// test range 1+3.0E38 the literal 19-.x of type double is out of range, adding 9s after decimal has no effect
	boolean truefalse = true; // 1 bit, stores true or false value, only accepts true or false value
	
	System.out.print("byte: "); System.out.println(num00);
	System.out.print("char: "); System.out.println(symbol);
	System.out.print("short: "); System.out.println(num01);
	System.out.print("int: "); System.out.println(num02);
	System.out.print("long: ");System.out.println(num03);
	System.out.print("float: ");System.out.println(num04);
	System.out.print("double: ");System.out.println(num05);
	System.out.print("boolean: ");System.out.println(truefalse);
	}
	
	}
	