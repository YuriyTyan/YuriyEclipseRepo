package com.syntax.class09;

public class TaskTask {

	public static void main(String[] args) {
		// 1. Print the following pattern:
		// 54321
		// 54321
		// 54321
		// 54321
		
		for (int i = 1; i <=4; i++) {
			// how many columns?
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);	
			}
			System.out.println();
		}
		System.out.println("------Task2 -------");
		// Print the following pattern:
		// 55555
		// 44444
		// 33333
		// 22222
		// 11111
		
		for (int i = 5; i >=1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(i);	
			}
			System.out.println();
		}
			
			System.out.println("----Task 3---");
			//Print the following pattern:
			//*
			//**
			//***
			//****
			//*****
			for (int rows = 5; rows >=1; rows--) {
				for (int column = 5; column >= 1; column--) {
					System.out.print(rows);	
				}
				System.out.println();
	}
}
}
