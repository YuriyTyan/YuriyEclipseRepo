package com.syntax.class15;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer strBuffer=new StringBuffer("Hello");//is a mutable object = changeable
		strBuffer.append(" friends"); // when we perform operation it happens on same Object and No NEW OBject is created
		
		System.out.println(strBuffer);//Hello friends
		
		String str2="Hello"; // String is immutable object = not changeable
		str2.concat(" friends"); //new Object gets created that will have value "Hello friends" --> no one takes it
		
		System.out.println(str2); // Hello
		
	}

}
