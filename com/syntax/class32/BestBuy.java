package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BestBuy {

	public static void main(String[] args) {
		Map<Integer,String> BestBuy = new TreeMap<>();
		BestBuy.put(11111, "MacBook Pro");
		BestBuy.put(22222, "iPhone12");
		BestBuy.put(33333, "Jabra Headphones");
		BestBuy.put(44444, "Printer/Scanner/Copier-3-in-1");
		BestBuy.put(55555, "Ultrawide Gaming Monitor 50-inch/240Hz");
		
		Set<Entry<Integer,String>> itemsKeysList = BestBuy.entrySet();
		System.out.println(itemsKeysList);
		
		System.out.println("--- using Enhanced For Loop ---");
		for(Entry<Integer,String> entry:itemsKeysList) {
			String value = entry.getValue();
			Integer key = entry.getKey();
			System.out.println("Key = "+key+" and value = "+value);
		}
		
		System.out.println("--- using Iterator ---");
		Iterator <Entry<Integer,String>> it = itemsKeysList.iterator();
		while(it.hasNext()) {
			Entry <Integer,String> entry = it.next();
			System.out.print("Key = "+entry.getKey()+" and value = "+entry.getValue());
			System.out.println();
		}
	}

}
