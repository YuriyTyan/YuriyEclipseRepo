package com.syntax.class11;

public class Task {
	public static void main(String[] args) {
		
		String[] carMakes = { "Hyundai", "BMW", "Toyota", "Ferrari", "Jaguar", "Mercedes" };
		// Print all fruits different ways
		// 1st way
		for (String make : carMakes) {
			System.out.print(make + " ");
		}
		System.out.println("-----------------------------");
		
		int[] integers = new int [4];
		int size = integers.length;
		
		integers[3] = 100;
		integers[2] = 150;
		integers[1] = 200;
		integers[0] = 250;
		
		int total = 0;
		for (int t1 : integers) {
		total += t1	;
		}
		System.out.println("Sum of integers in the array is: " + total));
		}
			
			
		for (int t = 0; t < size; t++) {
			total += integers[t];
		}
		System.out.println("Sum of integers in the array is: " + total);
		
		System.out.println("-----------------------------------");
		
		String[] countries = { "USA", "Germany", "Uzbekistan", "China", "Thailand" };
		// Print all fruits different ways
		// 1st way
		for (String fruit : countries) {
			System.out.print(fruit + ", ");
		}
		System.out.println();
		// old way
		for (int j = 0; j < countries.length; j++) {
			if (countries[j].equals("Grapes")) {
				System.out.println(countries[j] + " is my favorite fruit");
			} else {
				System.out.print(countries[j] + ", ");
			}
			
			
	}

}
