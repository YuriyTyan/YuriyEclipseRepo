package com.syntax.class17;

public class Student {
	
	char grade(int a) {
		if (a > 50 && a <= 70) {
			return 'D';
		} else if (a > 70 && a <= 80) {
			return 'C';
		}  else if (a > 80 && a <= 90) {
			return 'B';
		}  else if (a > 90) {
			return 'A';
		}  else {
			return 'F';
		}
	}

}
