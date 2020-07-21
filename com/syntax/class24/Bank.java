package com.syntax.class24;

public class Bank {

	double money, fee;

	public Bank(double money) {
		this.money = money;
	}

	double chargeFee() {
		if (money < 1000) {
			fee = money * 0.01;
		} else {
			fee = 0;
		}
		return fee;
	}
}

class BOA extends Bank {

	public BOA(double money) {
		super(money);
	}
}
class PNC extends Bank {

	public PNC(double money) {
		super(money);
	}
	double chargeFee() {
		if (money < 1000) {
			return money * 0.02;
		} else {
			return 0;
		}

	}
}