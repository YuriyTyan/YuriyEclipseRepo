package com.syntax.class02;

public class Variables {
	public static void main(String[] args) {
		/*
		 * name, lastName, grade, city, state, phoneNumber
		 * 
		 */
		
		String name = "Matthew";
		String lastName = "Sweeney";
		String grade = "A-";
		String city = "Winchester";
		String state = "VA";
		int phoneNumber1 = 1235678901;
		String phoneNumber2 = "(123) 567-8901";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(city);
		System.out.println(state);
		System.out.println(grade);
		System.out.println(phoneNumber2);
		
		System.out.println("-------------------------");
		// b)
		// Change student’s city, state, phone number and grade. And print those updated
		// values.

		// Not possible
		// String city = "Garfield";

		// Not good, because you're not re-assigning
		// String city2 = "Garfield";

		city = "Garfield";
		state = "NJ";
		phoneNumber2 = "(551) 567-8901";
		grade = "A+";
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber2);
		System.out.println(grade);

		System.out.println("-------------------------");
		
		String l1p1 = "1. My name is ";
		String l1p2 = " and my last name is ";
		String l2p1 = "2. I live in city of ";
		String l2p2 = " state ";
		String l2p3 = " and my phone number is ";
		String firstName = "John";
		String lastName5 = "Doe";
		String city5 = "Newark";
		String state5 = "NZ";
		String phoneNum = "(098) 333 2222";
				
		System.out.println(l1p1+firstName+l1p2+lastName5);
		System.out.println(l2p1+city5+l2p2+state5+l2p3+phoneNum+'!');
		
	}

}
