package com.syntax.class15;

public class Hw3 {

	public static void main(String[] args) {

		String day = "Sunday";

		String myBucket="";

		for (int i = day.length() - 1; i >= 0; i--) {

			myBucket += day.charAt(i);

		}
		System.out.println(myBucket);
	}

}
