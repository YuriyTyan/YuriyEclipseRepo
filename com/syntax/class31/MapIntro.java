package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		//storing objects inside map as a Key and value pair
		hmap.put(10, "John");
		hmap.put(11, "Jane");
		hmap.put(12, "James");
		
		System.out.println(hmap);
		//cannot have duplicate keys
		hmap.put(12, "Gozde");
		hmap.put(13, "Olga");
		//can have duplicate values
		hmap.put(1, "Olga");
		
		System.out.println(hmap);
		
		//how many objects inside the map
		int entryObjects=hmap.size();
		System.out.println(entryObjects);
		
		//how to check if map has any elements?
		boolean isEmpty=hmap.isEmpty();
		System.out.println(isEmpty);
		
		//check if map has a specific key or value?
		boolean hasKey=hmap.containsKey(12);
		System.out.println("Map contains key object 12 = "+hasKey);
		
		boolean hasValue=hmap.containsValue("John");
		System.out.println("Map has value John = "+hasValue);
		
		//how to retrieve 1 value from the Map?
		String singleValue=hmap.get(13); //gets the value of specified key
		System.out.println(singleValue);
		
		//how to remove a key from a map
		hmap.remove(10);
		
		System.out.println(hmap);
		
	}
}
