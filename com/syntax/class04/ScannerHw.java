package com.syntax.class04;

import java.util.Scanner;

public class ScannerHw {

	public static void main(String[] args) {
		// 1. ask user, 2. if >= 200,000 --> lend, otherwise -->reject

		Scanner loanAsk = new Scanner(System.in);
		System.out.println("Please enter the amount of loan you are applying for (whole number): ");
		int uInput = loanAsk.nextInt();
		System.out.println("Please wait, checking....");
		int maxAmnt = 200000;

		if (uInput <= maxAmnt) {
			System.out.println("Your loan of " + uInput + " is APPROVED!");
		} else if (uInput > maxAmnt) {
			System.out.println("Your loan application is NOT Approved!");
			System.out.println("*****************************************************");

		}
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please write a long text");
		String text1 = myScanner.next();
		System.out.println(text1);
		
		System.out.println("Please write a long text");
		String text2 = myScanner.next();
		System.out.println(text2);
		
		System.out.println("Please write a long text");
		String text3 = myScanner.nextLine();
		System.out.println(text3);
		
		System.out.println("Please enter Aidana's age (int)!");
		int num = myScanner.nextInt();
		System.out.println(num);
		
		System.out.println("Please enter Aidana's age (double)!");
		double d = myScanner.nextDouble();
		System.out.println(d);

		System.out.println("Please enter if Aidana is happy (true/false)!");
		boolean b = myScanner.nextBoolean();
		System.out.println(b);

		System.out.println("Please enter Aidana's name!");
		char myChar = myScanner.next().charAt(0);
		System.out.println(myChar);

		System.out.println("*****************************************************");
		
		
	}
}
