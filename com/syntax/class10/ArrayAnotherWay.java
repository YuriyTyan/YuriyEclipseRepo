package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {

		// we created an array and stored the initial values
		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursda", "Friday" };

		// Let us print the element with index 3
		System.out.println(weekdays[3]);
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);

		// Add more
		// 1st way
		double[] balances = { 10000, 23.50, 5540.0 };
		System.out.println("total money is " + (balances[0] + balances[1] + balances[2]));

		// 2nd way
		double total = balances[0] + balances[1] + balances[2];
		// casting
		int total1 = (int) balances[0] + (int) balances[1] + (int) balances[2];
		System.out.println("total is: " + total1);
		// 3rd way
		int total2 = (int) (balances[0] + balances[1] + balances[2]);

		System.out.println("total1 is: " + total2);
		
		//don't ever create an array with 0 elements
		//because you cannot add elements later
		int [] numbers1 = new int[0];
		
		int[] numbers2 = {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
	}

}
