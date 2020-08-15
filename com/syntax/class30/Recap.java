package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	
	public static void main(String[] args) {
		
		//I need collection that can store double objects and can have duplicates and I'd loke to maintain the order
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(10.99);//boxing
		numbers.add(9.99);
		numbers.add(8.99);
		numbers.add(9.99);
		numbers.add(9.99);
		//numbers.add(7); CE: we cannot store Integer Objects into ArrayList of Double Objects
		
		Double num = numbers.get(2);
		double num1 = numbers.get(1);//unboxing
		
		System.out.println("---- Retrieving elements using advanced for loop ----");
		for(double n:numbers) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("---- Retrieving elements backwards ----");
		for(int i=numbers.size()-1; i>=0; i--) {
			double myNum = numbers.get(i);// can also store inside an object: Double myNum = numbers.get(i);
			System.out.print(myNum+" ");
		}
		
		System.out.println();
		System.out.println("---- Retrieving all values using iterator ----");
		
		Iterator<Double> it = numbers.iterator();
		//next(); --> gets next Object
		//hasNext(); - checks if there is next element
		//remove(); -- remove from the collection
		
		double d = it.next();
		double d1 = it.next();
		System.out.println(d1);
		
		System.out.println("---- Printing all values using iterator ----");
		
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		System.out.println("---- Printing all values using new iterator object ----");
		
		Iterator<Double> doubleIT = numbers.iterator();
		while (doubleIT.hasNext()) {
			double element = doubleIT.next();
			if (element < 10) {
				doubleIT.remove();
			}
			System.out.print(doubleIT.next()+" ");
		}
	}
}
