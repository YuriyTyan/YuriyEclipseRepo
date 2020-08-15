package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task {
	
	/* Create a Set collection in which you need to add names of the countries.
	 * In this set we want all objects to be sorted in alphabetical order.
	 * Using 2 different ways retrieve all elements from set.
	 */

	public static void main(String[] args) {
		
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Thailand");
		countries.add("Poland");
		countries.add("Norway");
		System.out.println("--- Retrieving elements using iterator ---");
		Iterator<String> it = countries.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println();
		System.out.println("--- Retrieving elements using enhanced for loop ---");
		for(String str1:countries) {
			System.out.println(str1);
		}
		//2. Create a Set of cities in which you want to make sure that insertion order  
		// is maintained. Using Iterator remove any city that starts with “A”;
		
		Set<String> cities = new LinkedHashSet<>();
		cities.add("Washington DC");
		cities.add("Taipei");
		cities.add("Tegucigalpa");
		cities.add("Bangkok");
		cities.add("Munich");

	}

}
