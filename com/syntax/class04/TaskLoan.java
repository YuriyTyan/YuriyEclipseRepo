package com.syntax.class04;

import java.util.Scanner;

public class TaskLoan {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan
		// is needed.
		// if loan is less than or equal to 200,000 then you would lend the money
		// otherwise you would reject the client.
		Scanner myscan = new Scanner(System.in);
		int loanLimit = 200000;
		System.out.println("Please enter loan amount you need in whole numbers (integer)" + ", and press Enter");
		int askLoan = myscan.nextInt();
		if (askLoan <= loanLimit) {
			System.out.println("Your loan is approved");
		} else {
			System.out.println("We are sorry, your loan is not approved");
		} 

	}
}
