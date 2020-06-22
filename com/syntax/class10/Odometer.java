package com.syntax.class10;

public class Odometer {

	public static void main(String[] args) {
		//We bought a new car
		//Mileage starts with 0000 and it increases
		//It goes 0001, 0002, 0003 ....9999
		//Hint: There are 4 inner loops
		
		for (int i = 0; i <=9; i++) {
			
			for (int j = 0; j <= 9; j++) {
				for (int d = 0; d <= 9; d++) {
					for (int k = 0; k <= 9; k++) {
						System.out.println(i+""+j+d+k);
					}
				}
				
			}
			
			System.out.println();
		}
		
	}
}
