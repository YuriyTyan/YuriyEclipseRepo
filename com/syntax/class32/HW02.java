package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW02 {

	public static void main(String[] args) {
		
		Map<Integer,Person> staff = new TreeMap<>();
		staff.put(007, new Person("James", "Bond", 33, 1000000));
		staff.put(690, new Person("Mata", "Hari", 29, 2000000));
		staff.put(47, new Person("Tobias", "Rieper", 26, 800000));
		staff.put(999, new Person("Black", "Widow", 35, 3000000));
		staff.put(991, new Person("Johnny", "English", 48, 300000));
		
		System.out.println("--- using Entry Set ---");
		Set <Entry<Integer, Person>> entry = staff.entrySet();
		for (Entry<Integer, Person> agent:entry) {
			Person pers = agent.getValue();
			pers.displayInfo();
		}
		
		System.out.println("--- using Iterator ---");
		Iterator<Entry<Integer, Person>> it = entry.iterator();
		while(it.hasNext()) {
			Person pers = it.next().getValue();
			pers.displayInfo();
		}
		
		System.out.println("--- using values ---");
		
		Collection<Person> values = staff.values();
		for(Person pers:values) {
			pers.displayInfo();
		}
		
		System.out.println("--- using For Loop ---");
		Iterator<Person> it1 = values.iterator();
		while(it1.hasNext()) {
			it1.next().displayInfo();
		}
		
		System.out.println("--- using KeySet ---");
		
		Set<Integer> keys = staff.keySet();
		for(Integer key:keys) {
			Person pers = staff.get(key);
			pers.displayInfo();
		}
	}
}

class Person {
	
	private String name, lastName;
	private int age;
	private double salary;
	
	public Person(String name, String lastName, int age, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary=salary;
	}
	
	public void displayInfo() {
		System.out.println(name + " " + lastName + ", " + age + " years old. Salary: "+ salary);
	}
	
}
