package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		// if student completed the quiz, we'll check the score
		// if score > 90 --> A, Great job!
		// if score > 80 --> B, well done!
		// if score > 70 --> C, Just passed!
		// otherwise --> F, You failed!
		//
		// if student didn't complete the quiz, Please finish your quiz!

		boolean completed = true;
		int score = 71;

		if (completed) {
			// Let's check the score
			if (score >= 90) {
				System.out.println("A, Great job!");
			} else if (score >= 80) {
				System.out.println("B, well done!");
			} else if (score >= 70) {
				System.out.println("C, Just passed!");
			} else {
				System.out.println("You failed!");
			}
		} else {
			System.out.println("Please finish your quiz!");
		}

	}
}
