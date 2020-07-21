package com.syntax.class24;

public class Parent {
	
	private void hello() {//private methods do not participate in inheritance --> no overriding
		System.out.println("Hello from parent class");
	}
}

class Child extends Parent{
	//creating own private method inside child class
	private void hello() {
		System.out.println("Hello from parent class");
	}
}
