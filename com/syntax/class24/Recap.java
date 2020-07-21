package com.syntax.class24;

public class Recap {
	
	protected void test() {
		System.out.println("overloading a method");
	}
	protected void test(String a, int b) {
		System.out.println("overloading method by into params");
	}
	protected void test(int b, String a) {
		System.out.println("overloading private method");
	}

}
