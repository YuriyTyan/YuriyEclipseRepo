package com.syntax.class03;

public class TemperatureCheck {
	
	
	
	// Create a Java program and name it Temperature Check. Create variable to store temperature. 
	// Your program should check if temperature is below 32 then it should print 
	// "Water will freeze with temperature __", otherwise "Water will NOT freeze with temperature __".
	
	public static void main(String[] args) {
		int ctemp = 50;
		int ftemp = 32;
		if (ctemp <= ftemp) {
		System.out.println("Water will freeze with temperature " + ctemp);
		}else
		{
		System.out.println("Water will NOT freeze with temperature " + ctemp);
		}
			
	}

}
