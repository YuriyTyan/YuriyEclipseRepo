package com.syntax.class32;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {

		// Create a map of countries with its capital that will store countries in
		// alphabetical order.
		// Print all keys and values from a country map using for each loop and
		// iterator.
		// Print all values from a country map using for each loop and iterator.

		TreeMap<String, String> countryCapitalMap = new TreeMap<>();
		countryCapitalMap.put("Austria", "Vienna");
		countryCapitalMap.put("Belarus", "Minsk");
		countryCapitalMap.put("Czech Repuiblic", "Prague");
		countryCapitalMap.put("Luxemburg", "Luxemburg");
		countryCapitalMap.put("South Korea", "Seoul");
		countryCapitalMap.put("Uzbekistan", "Tashken");

		Set<String> keys = countryCapitalMap.keySet();
		for (String key : keys) {
			System.out.println("The capital of " + key + " is " + countryCapitalMap.get(key));
		}
		System.out.println("= = = = = = = = = = = = =");
		Collection<String> values = countryCapitalMap.values();
		for (String val : values) {
			System.out.println(val);
		}
	}
}
