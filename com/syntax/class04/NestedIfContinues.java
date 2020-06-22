package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies --> You're healthy
		// otherwise:
		// if peanut allergy: Don't eat peanut
		// Lactose allergy: Don't drink milk
		// bee allergy: Don't mess with bees

		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bees = true;

		if (!allergy) { // No allergy
			System.out.println("You're healthy");
		} else {
			// We have to check which allergy
			if (peanut) {
				System.out.println("Don't eat peanut");
			}
			if (lactose) {
				System.out.println("Don't drink milk");
			}
			if (bees) {
				System.out.println("Don't mess with bees");

			}
		}
		System.out.println("********************************************");
		int age = 12;
		if (age < 18) {
			System.out.println("You are a teenager, please don't work");
		} else {
			System.out.println("You are older than 18");
			if (age<64) {
				System.out.println("You are elidible to work");
			} else {
				System.out.println("Enjoy your life!");
			}
		}
	}
}
