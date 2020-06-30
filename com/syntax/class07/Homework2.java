package com.syntax.class07;

import java.util.Scanner;

public class Homework2 {
	// We are playing a lottery game and the lucky number is 17;
	// We want to keep asking the user to enter any numbers from 1-20; until he
	// guesses the lucky number
	// --> In that case we print "Congrats, you won!"
	// You can try to solve it with do-while or while, whichever is the best
	// choice...
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// option 1 using while
		int userInput = 0; // initialization of variable
		do {
			System.out.println("Please enter any number from 1 to 20");
			userInput = scan.nextInt();
		} while (userInput == 17);
		{
			System.out.println("Congrats, you won!");
			return;
		}
	}
		System.out.println("Please enter any number from 1 to 20");
		userInput = scan.nextInt();
		while (userInput != 17) {
			System.out.println("Congrats, you won!");
			{
				System.out.println("Please try one more time");
			}
		}
	}
