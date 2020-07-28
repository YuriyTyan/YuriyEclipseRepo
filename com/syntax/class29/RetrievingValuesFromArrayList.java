package com.syntax.class29;

import java.util.ArrayList;

import java.util.Iterator;

public class RetrievingValuesFromArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ahmet");
		names.add("John");
		names.add("Will");
		names.add("Bruce");
		names.add("Leonardo");
		
		//how to retrieve a value
		String str=names.get(3);
		System.out.println(str);
		
		System.out.println("---Retrieveing values from ArrayList using for loop-----");
		//how to retrieve values 1 by 1
		System.out.println("---Retrieveing values from ArrayList using enhanced for loop-----");
		for(String name:names) {
			System.out.println(name);
			if(name.contentEquals("Ahmet")) {
				System.out.println("Ahmet you are awesome");
			}
		}
		
		System.out.println("---Retrieveing values from ArrayList using for loop-----");
		
		for(int i=0; i<names.size(); i++) {
			String s=names.get(i);
			System.out.println(s);
		}
		
		System.out.println("---- Retrieveing values from ArrayList using Iterator -----");
		
		Iterator<String> it = names.iterator();
		
		while (it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
	}

}
