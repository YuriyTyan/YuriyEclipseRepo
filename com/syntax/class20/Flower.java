package com.syntax.class20;

public class Flower {
	
	String type;
	//if you are not going to create a constructor, --> Compiler WILL create one for you
	//Flower(){ // default non argument
	//}
	
//	Flower(){
//		System.out.println("I am a pointless constructor");
//	}
	//if you create a constructor, then Compiler WILL NOT CREATE any other constructor for you
	Flower(String flowerType){
		type=flowerType;
	}
	
	void Flower() {
		System.out.println("whatever");
	}
	public void display() {
		System.out.println("type");
	}
	
	
	public static void main(String[] args) {
		
		 //Flower flower = new Flower();CE: since we don't have non argument constructor
		 
//		 System.out.println(flower.type);
		 
		 Flower flower2 = new Flower("Tulip");
		 
		flower2.display();
		flower2.Flower();
				
	}

}
