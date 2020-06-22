package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// we want to ask 5 times the users his/her and print Good Afternoon ___
		Scanner myScan = new Scanner(System.in);
		int num = 1;
		while (num <= 5);{
			System.out.println("Please enter your name:");
			String name = myScan.nextLine();

			System.out.println("Good Afternoon " + name);
			num++;
		}

	}
}
