package com.syntax.class15;

public class Task {

	public static void main(String[] args) {

		String mystr = "Today is Sunday, so we have a Java class";

		String output = mystr.replace(" ", "");

		System.out.println(output);

		System.out.println("----------------------------");

		String str1 = "Sardines Go Like @1!2#3$4%5&6*";

		str1 = str1.replaceAll("[^A-Za-z]", "");

		System.out.println(str1.length());

		System.out.println("----------------------------");
		
		String a = "Is it Saturday? Is it raining? Do we have a Java class today?";
		
		

	}

}
