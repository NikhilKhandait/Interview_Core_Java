package com.Exception.BankAccount;

public class BankAccount {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposite amount :" + amount);
		System.out.println("After deposit total balance :" + balance);
	}

	public double withdrawl(double amount) throws BankException {
		
		if (balance > amount) {
			balance = balance - amount;
			
		} else {
			throw new BankException("Insufficent Fund : " + amount );
		}
		return balance;
	}
}
