package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {

		// Create an arraylist of cars and retrieve all the values using 3 different
		// ways.

		ArrayList<String> carList = new ArrayList<>();
		carList.add("Chevrolet Tahoe");
		carList.add("Mercedes-Benz AMG G 63");
		carList.add("BMW X5 M");
		carList.add("Toyota RAV4");
		carList.add("Honda CR-V");
		
		System.out.println("using enhanced for loop");
		for (String makeMod : carList) {
			System.out.println(makeMod);
		}
		System.out.println("using for loop");
		for (int i = 0; i < carList.size(); i++) {
			String str = carList.get(i);
			System.out.println(str);
		}
		System.out.println("using iterator");
		Iterator<String> myIt = carList.iterator();
		while (myIt.hasNext()) {
			String str1 = myIt.next();
			System.out.println(str1);

		}
		// Create an arrayList of words. Remove every word that ends with "e".
		ArrayList<String> words = new ArrayList<>();
		words.add("Chevrolet Tahoe");
		words.add("Mercedes-Benz AMG G 63");
		words.add("BMW X5 M");
		words.add("Toyota RAV4");
		words.add("Honda CR-V");
		
		
	}
	
}
