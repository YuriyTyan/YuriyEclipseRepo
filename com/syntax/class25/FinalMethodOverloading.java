package com.syntax.class25;

class Parent {
	
	final void method() {System.out.println("Parent class final method");}
	final static void method(String a) {System.out.println(a);}
}

class Child extends Parent{
	boolean b;
	final void method(boolean b) {this.b=b; System.out.println("Final method can be overloaded = "+b);}
}

class GrandChild extends Child {
	double c;
	final void method(double c) {this.c=c;System.out.println("same name final method from GrandChild class");}
}

public class FinalMethodOverloading {
	
	public static void main(String[] args) {

		GrandChild baby = new GrandChild();
		baby.method();
		Parent.method("Calling overloaded final method from Parent class");
		baby.method(true);
		baby.method(10.0);
		
	}
}
