package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		//let's create an ArrayList that will store numbers
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(100);
		alist.add(200);
		alist.add(300);
		//alist.add("400"); we cannot store String Objects into ArrayList of Integer Objects
		
		System.out.println("Size of alist = "+alist.size());
		System.out.println(alist);
		
		alist.add(1);
		alist.add(2);
		alist.add(2);
		alist.add(2);
		alist.add(2);
		
		System.out.println(alist);
		
		alist.remove(2);//specifying index
		
		System.out.println(alist);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Jane");
		names.add("Tom");
		names.add("Jessie");
		names.add("Bob");
		
		System.out.println(names);
		names.clear();
		System.out.println("collection after clear "+names);
		
		ArrayList<String> list = new ArrayList<>();
		names.add("John");
		names.add("Jane");
		names.add("Tom");
		names.add("Jessie");
		names.add("Bob");
		System.out.println(list);
		
		names.addAll(list);
		System.out.println("Names after adding all objects from list collection "+names);
		
		System.out.println("Objects inside list collection "+list);
		
		names.remove("Bob");
		System.out.println("Names after removing Arthur "+names);
		
		System.out.println("array names is empty ="+names.isEmpty());
		System.out.println("array names contains Bob ="+names.contains("Bob"));;
		System.out.println("size of array names is: "+names.size());
		System.out.println(names);
		
		ArrayList<String> arrayName = new ArrayList<>(4);
		arrayName.add("Igor");
		arrayName.add("Ivan");
		arrayName.add("Olga");
		
		names.addAll(arrayName);
		System.out.println(names);
		
		names.removeAll(arrayName);
		System.out.println(names);
		
		//generic collection
		ArrayList<String> myList = new ArrayList<>(arrayName);
		System.out.println(myList);
		
		//before java 1.5 collections were not Generic
		//non generic
		ArrayList blist = new ArrayList();
		blist.add("String");
		blist.add(100);
		blist.add(10.99);
		blist.add('c');
		
		System.out.println("Non generic ArrayList collection "+blist);
		
	}
}
