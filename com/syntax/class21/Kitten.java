package com.syntax.class21;

//Create a Kitten class that will be extending Cat class and see which 
//features will be available to the object of the Kitten class.

public class Kitten extends Cat{
	
	public static void main(String[] args) {
		
		Kitten kit = new Kitten();
		kit.breed="Greyhound";
		kit.color="JustLikeThatRug";
		kit.paws=4;
		kit.tail=true;
		Cat.eyes=true;
		kit.tail = true;
		kit.fur = "small";
		
		kit.eat();
		kit.sleep();
		kit.purr();
		kit.spoilNewShoes();
//		kit.bark(); not available
	}
}
