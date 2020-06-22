package com.syntax.class04;

import java.util.Scanner;

public class TaskDMV {

	public static void main(String[] args) {
		// You are DMV rep and need to ask customer their age. If they are 18 and older
		// you will issue a driver license to them, otherwise you will offer them
		// to get a learners permit.
		Scanner myscan = new Scanner(System.in);
		System.out.println("Please enter your age in whole numbers");
		int custAge = myscan.nextInt();
		if (custAge >= 18) {
			System.out.println("You can get a driver license");
		} else {
			System.out.println("You can get a learners permit");
		}
	}

}
