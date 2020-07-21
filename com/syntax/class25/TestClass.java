package com.syntax.class25;

public class TestClass {
	
	public static void main(String[] args) {
		
		SuperClass c = new SubClass();
		c.enjoy();//not right way to call static method see below. enjoy from child class will be hidden
		
		SuperClass.enjoy();
		SubClass.enjoy();//don't see parent static method, only own static method
	}
}
