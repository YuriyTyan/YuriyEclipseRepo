package com.syntax.class07;

public class WhileLoopDemo {
	public static void main(String[] args) {
//		int time = 10;
//
//		if (time > 12) {
//			System.out.println("Good Morning!");
//		}
//		System.out.println("-------While Loop------");
//
//		// This code will execute indefinitely
//		while (time < 12) {
//			System.out.println("Good Morning!");
//			time++; // But then we fixed it by adding time++
//		}
//
//		// This code will never execute
//		while (time > 12) {
//			System.out.println("Good Morning!");
//			time--;
//		}
//		System.out.println("-------While Loop------");
//		// how to print number from 1 to 50?
//		int x = 1;
//		while (x <= 50) {
//			System.out.println(x);
//			x++;
//		}
//		System.out.println("-------While Loop------");
//		// how to print number from 20 to 30?
//		int y = 20;
//		while (y <= 30) {
//			System.out.println(x);
//			y++;
//		}
//		System.out.println("-------While Loop------");
//		// how to print number from 5 to 15 at the same line
//		int z = 5;
//		while (z <= 15) {
//			System.out.print(z + " ");
//			z++;
//		}
//
//		System.out.println();
//
//		System.out.println("----------------------------------");
//		System.out.println("how to print numbers from 50 to 1");
//		int q = 50;
//		while (q > 0) {
//			System.out.println(q);
//			q--;

//		}
		System.out.println("----------------------------------");
		System.out.println("how to print odd numbers from 1 to 20");
		// 1 way, using mod
		int g = 1;
		while (g < 20) {
			if (g % 2 == 1) {
				System.out.println(g);
			}
			g++;
		}
		// 2nd way, increasing by 2
		int h = 1;
		while (h < 20) { // <= also works
			System.out.println(h);
			h += 2;
		}
		// 3rd way
		int k = 0;
		while (k < 20) {
			k++;
			System.out.println(k);
			k++;
		}
		// 4th way
		int l = 0;
		while (l < 20) {
			System.out.println(++l);
			l++;
		}
	}
}
