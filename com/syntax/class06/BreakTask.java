package com.syntax.class06;

import java.util.Scanner;

public class BreakTask {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. 
		// Once values are captured print which language user speaks.

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = input.nextLine();
		String language;
		
		switch (country) {
		case "Argentina":
		case "Bolivia":
		case "Chile":
		case "Colombia":
			language = "Spanish";
			break;
		case "Uzbekistan":
			language = "Uzbek";
			break;
		case "China":
			language = "Mandarin";
			break;
		default:
			language = "Unknown";
			break;
		}
		System.out.println("Your language is " + language);
	}

}
