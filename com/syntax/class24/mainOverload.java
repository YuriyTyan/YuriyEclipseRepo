package com.syntax.class24;

public class mainOverload {

	public static void main(String str) {
		System.out.println("I am a main method with String");
	}

	public static void main(String str, int num) {
		System.out.println("I am a main method with two parameters");
	}

	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		main("main");
		main("main", 2);
	}

}
