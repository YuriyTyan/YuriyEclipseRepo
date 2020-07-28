package com.syntax.class27;

abstract class Mortgage{
	
	public abstract void giveMortgage();
}

public interface Trustable {

	void trust();
}

interface Bank extends Trustable {
	
	boolean MONEY=true;

	void deposit();
	void withdraw();
	
	//from java 8 inside interface we can have default methods and static
	default void transferMoney() {
		System.out.println("All banks must do transfer");
	}
	static void checkCreditScore() {
		System.out.println("All banks must check credit score");
	}
}


class PNC extends Mortgage implements Bank, Investments {

	public void trust() {
		System.out.println("You can trust PNC bank with your money");
	}

	public void deposit() {
		System.out.println("PNC bank takes deposits");
	}

	public void withdraw() {
		System.out.println("PNC bank gives you your money");
	}
	
	public void giveMortgage() {
		System.out.println("PNC gives mortgage");
	}
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}
}
