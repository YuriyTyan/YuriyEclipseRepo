package com.syntax.class11;

public class RetrievingValuesFromTwoDArrays {
	
	public static void main(String[] args) {
		//Put the months for each season in one row
		String [][] months = { { "December", "January", "February" }, 
				{ "March", "April", "May" }, 
				{ "June", "July", "August" }, 
				{ "September", "October", "November" }
		
		};
				
		int rows = months.length; //how many arrays/rows are inside?
		System.out.println(rows + " rows");
		
		int winterLength = months[0].length; // how many elements/columns are in row with index 0?
		System.out.println(winterLength + " months in row with index 0");
		
		int lastRowSize = months[rows - 1].length;
		
		//Nested loops are married (joke) to 2D Arrays
		for (int i = 0; i < months.length; i++) { // iterating over rows
			
			for (int j = 0; j < months[i].length; j++) {// iterating over columns
				System.out.println(months[i][j]);
			}
			
		}
				
		}
		
		
	}


