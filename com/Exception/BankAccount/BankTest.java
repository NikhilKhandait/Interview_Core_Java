package com.Exception.BankAccount;

public class BankTest {
	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		b.setBalance(100);
		b.deposit(150);
		try {
			System.out.println("After WithDrawl Bal :" + b.withdrawl(251));
			
		} catch (BankException e) {
			System.out.println(e);
			
		}
		
		b.setBalance(200);
		System.out.println(b.getBalance() + "OK");

	}
}
