package com.syntax.class19;

//1. Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
//Method should be visibly only within same package and accessible by the creating an instance of the class.
//2. Create a method that will take a String as a parameter and returns reversed String. 
//Method should be available to all classes within your project and accessible by class name.
public class Task {
	
	protected int sumAll(int[] array) {
		int result = 0;
		for(int i=0;i<=array.length; i++) {
			result = result + array[i];
		}
		return result;
	}

	public void sumAll() {
		// TODO Auto-generated method stub
		
	}
	

}
