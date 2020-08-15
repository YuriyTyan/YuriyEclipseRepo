package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hw3 {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("DC");
		cities.add("Tashkent");
		cities.add("Oslo");
		cities.add("Reyjavik");
		cities.add("Prague");
		cities.add("Hararre");
		
		Map<String, Integer> citiesMap = new TreeMap<>();
		for(int i = 0; i < cities.size(); i++) {
			citiesMap.put(cities.get(i), cities.get(i).length());
		}
		System.out.println(citiesMap);
		
		Set<String> citiesSet = citiesMap.keySet();
		Iterator<String> it = citiesSet.iterator();
		while(it.hasNext()) {
			String city = it.next();
			if(city.length() > 7) {
				it.remove();
			}
		}
		System.out.println(citiesMap);
	}
}
