package com.syntax.class24;

public class Task1Test {
	
	public static void main(String[] args) {
		Degree obj = new Degree();
		Masters obj1 = new Masters();
		Bachelors obj2 = new Bachelors();
		obj.getPrerequisite();
		obj1.getPrerequisite();
		obj2.getPrerequisite();
		
		CreditCard obj3 = new CreditCard();
		System.out.println(obj3.chargeFee(1000));
		Visa obj4 = new Visa();
		System.out.println(obj4.chargeFee(1000));
		AX obj5 = new AX();
		System.out.println(obj5.chargeFee(1000));
	}

}
