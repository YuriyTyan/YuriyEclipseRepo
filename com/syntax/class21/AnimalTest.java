package com.syntax.class21;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		//object of parent class has an access to all var and methods of it junior class
		Animal a = new Animal();
		a.breed="ph";
		a.color="grey";
		a.paws=4;
		
		a.sleep();
		a.eat();
		
		//object on a child class has access to all var and methods of its parent class
		Dog dog = new Dog();
		dog.breed="Husky";
		dog.color="Yellow";
		dog.paws=4;
		dog.tail=true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed="EgyptBold";
		cat.color="PaleMorning";
		cat.paws=4;
		cat.tail=true;
		
		cat.eat();
		cat.sleep();
		cat.purr();
		cat.spoilNewShoes();
		
		
	}

}
