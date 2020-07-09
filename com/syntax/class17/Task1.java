package com.syntax.class17;

public class Task1 {

	String createEmail(String name, String lastName, String email) {

		String mail = name + lastName + "@" + email + ".com";

		return mail.toLowerCase();
	}
	
	boolean isPrime (int a) {
		boolean prime = true;
		if (a>1) {
			for (int i = 2; i <=a / i; i++) {
				if (a % i == 0) {
					prime = false;
					break;
				}
			}
		}else {
			prime = false;
		}
		return prime;
	}
	
	

}
