package com.syntax.class15;

public class ReplaceFunction {
	
	public static void main(String[] args) {
		
		String me = "I am a good tester. I am agood person";
		
		String str = "Hello";
		
		str=str.replace('e', 'E');
		System.out.println(str);
		
		me=me.replace("good", "great");
		System.out.println(me);
		
		me=me.replace("we", "us"); //if it find it --> replace if it will not --> does nothing
		System.out.println(me);
		//replacing all characters from A-Z
		String fromApplication="Phone number 1234567890";
		fromApplication=fromApplication.replaceAll("[A-Z]", "");
		
		System.out.println(fromApplication);//phone number is 1234567890
		//replacing all characters from a-z
		fromApplication=fromApplication.replaceAll("[a-z]", "").trim();
		
		System.out.println("New String value is="+fromApplication);
		
		String another="Hello12345";
		another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);
		
		String anotherWay="HelloYiiGhFFj56578897";
		anotherWay=anotherWay.replaceAll("[A-Za-z]", ""); //1234
		System.out.println(anotherWay);
		
		//replacing all numbers [0-9] from the String, if specific [0-5]
		String mix="Hello45676 friends 978223";
		mix=mix.replaceAll("[0-9]", "");
		System.out.println(mix);
		
		String mix1="hello &*%#@";
		mix1=mix1.replaceAll("[^A-Za-z0-9]", "Syntax ");
		System.out.println(mix1);
	}

}
