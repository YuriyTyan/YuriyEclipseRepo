package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		//to add values to the arraylist
		arrayList.add("Hello");// stored with index 0
		arrayList.add("Welcome"); // stored with index 1
		arrayList.add("How are you"); // stored with index 2
		
		System.out.println("Original arrayList "+arrayList);
		
		//how many elements inside my ArrayList
		int arrayListSize=arrayList.size();
		System.out.println(arrayListSize);
		
		//how to access elements from ArrayList
		
		String element=arrayList.get(2);
		System.out.println(element);
		
		//I would like to add more Objects into ArrayList
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		
		System.out.println("Size of ArrayList after adding more String Objects = "+arrayList.size());
		
		// Let's remove "Hello";
		arrayList.remove(0);
		System.out.println("Size of ArrayList after removing Object = "+arrayList.size());
		
		//I want to update value "Good Bye" --> "Bye"
		arrayList.set(2, "Bye" );
		System.out.println(arrayList);
		
	}

}
