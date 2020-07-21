package com.syntax.class24;

public class BirdTest {

	public static void main(String[] args) {

		Bird bird = new BabyBird();// upcasting-->object of sub class is referring to super class, implicitly
		//achieving runtime polymorphism
		bird.fly();
		bird.eat();
		bird.sleep();
		//bird.cry(); not available
		//during compilation compiler gives an access based on reference type
		
		BabyBird bb = new BabyBird();
		bb.cry();
		bb.eat();
	}
}
