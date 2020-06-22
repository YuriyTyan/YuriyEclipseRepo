package com.syntax.class04;

import java.util.Scanner;

public class CityTemp {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature.
		// Your program should convert Fahrenheight into Celsius and print
		// "The temperature in the city __ is _"
		Scanner myscan = new Scanner(System.in);
		System.out.println("Please enter your city name");
		String city = myscan.nextLine();
		System.out.println("Please enter city temperature in Fahrenheight");
		double tempF = myscan.nextDouble();
		System.out.println("The temperature in the city " + city + " is " + (tempF-32)*5/9);
	}

}
