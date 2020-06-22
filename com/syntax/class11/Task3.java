package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {

		// Create an array of countries
		// While retrieving all values from an array print capital for each country.

		String[] countries = { "USA", "Germany", "Uzbekistan", "China", "Thailand" };
		String[] capitals = {"Washington DC", "Berlin", "Tashkent", "Beijing", "Bangkok" };
		// Elion way
		for (int i=0; i < countries.length; i++) {
			String country = countries[i];
			String city = capitals[i];
			System.out.println("The capital city of "+ country + " is "+ city);
		}
		System.out.println("----------------------------------------");
		// 1st way
		for (String country : countries) {
			if (country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("US")) {
				System.out.println("Washington DC");
			} else if (country.equalsIgnoreCase("Germany")) {
				System.out.println("Berlin");
			} else if (country.equalsIgnoreCase("Uzbekistan")) {
				System.out.println("Tashkent");
			} else if (country.equalsIgnoreCase("Thailand")) {
				System.out.println("Bangkok");
			} else if (country.equalsIgnoreCase("China")) {
				System.out.println("Beijing");
			} else {
				System.out.println("The country " + country + " is not on my list");
			}
			System.out.println("-------------2nd way------------");
			for (int i = 0; i < countries.length; i++) {

				switch (countries[i]) {
				case "USA":
					System.out.println("Washington DC");
					break;
				case "Germany":
					System.out.println("Berlin");
					break;
				case "Uzbekistan":
					System.out.println("Tashkent");
					break;
				case "Thailand":
					System.out.println("Bangkok");
					break;
				case "China":
					System.out.println("Beijing");
					break;
				default:
					System.out.println("Not in my list");

				}
			}
		}
// try with enhanced for loop
	}

}
