package com.syntax.class11;

public class TwoDArrayHomework {

	public static void main(String[] args) {

		String[][] titleNames = { { "Mr", "Mrs", "Ms", "Miss" }, 
								{ "Smith", "Obama", "Jackson", "Jordan" } };
		
		for (int i = 0; i<1; i++) {
			
			for (int j = 0; (j<titleNames[i].length); j++) {
				
				String title = titleNames[i][j];
				String name = titleNames[1][j];
				
				System.out.print(title + " "+ name +", ");
			}
		}
		
	}
}
