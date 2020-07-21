package com.syntax.class20;

public class Task20 {
	
	Task20(){
		System.out.println("I am constructor with no parameters");
	}
	
	String name;
	int num1, num2;
	Task20(String str, int a, int b) {
		System.out.println("I am constructor with parameters, "
				+ "call me sum and give two int numbers:");
		name = str;
		num1=a;
		num2=b;
		System.out.println(name+" of "+ num1+ " and " + num2 + " is "+(num1+num2));
	}

}
