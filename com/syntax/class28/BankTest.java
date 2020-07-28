package com.syntax.class28;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.setAccountNumber(12345678l);
		System.out.println(bank.getAccountNumber());
		
		bank.setBalance(10000);
		System.out.println(bank.getBalance());
	}
}
