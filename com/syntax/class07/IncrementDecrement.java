package com.syntax.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x = 10;
		x = x + 1;
		x += 1;
		// another way to add 1 into the variable
		x++; // post-increment
		++x; // pre-increment
		
		System.out.println(x);
		
		int y = 50;
		y = y - 1;
		y -= 1;
		y--;
		System.out.println(y);
		
		
		// 3++; //compiler error
		// 3--; //compiler error



	}

}
