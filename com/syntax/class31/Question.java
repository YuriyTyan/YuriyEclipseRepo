package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question {
	
	public static void main(String[] args) {
		// How you can remove all duplicates from ArrayList
		
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> set = new LinkedHashSet<>();
		//set.addAll(aList);
		
		System.out.println(set);
		
		//how to get only 1 specific element?
		Set<String> lList = new LinkedHashSet<>();
		lList.add("Kazakhstan");
		lList.add("USA");
		lList.add("Germany");
		lList.add("England");
		lList.add("Italy");
		
		List<String> list = new ArrayList<>();
		String country = list.get(2);
		System.out.println(country);
		
	}

}
