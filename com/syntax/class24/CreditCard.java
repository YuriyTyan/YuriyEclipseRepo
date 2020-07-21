package com.syntax.class24;
//Create a class CreditCard and define variable balance and interest. p
//Create an instance method that will calculate interest based on the given balance. 
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//Call the method by creating an object of each of the three classes.

public class CreditCard {

	double balance, interest;

	double chargeFee(double balance) {
		this.balance = balance;
		interest = balance * 0.02;
		return interest;
	}
}
class Visa extends CreditCard {
}

class AX extends CreditCard {

	double balance, interest;

	double chargeFee(double balance) {
		this.balance = balance;
		interest = balance * 0.04;
		return interest;
	}
}
