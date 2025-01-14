package com.oop.AccountClass;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(int amount) {
		System.out.println("Total Balance : " + getBalance());
		System.out.println("Deposite Amount : " + amount);
		setBalance(getBalance() + amount);
		System.out.println("After Deposite :" + getBalance());
		System.out.println();
	}

	public void withdrawl(int amount) {
		if (getBalance() >= amount) {
			System.out.println("Total Balance : " + getBalance());
			System.out.println("Withdraw Amount :" + amount);
			setBalance(getBalance() - amount);
			System.out.println("After Withdrawl :" + getBalance());

		} else {
			System.out.println("Insufficent fund :" + amount);
		}

	}

	public static void main(String[] args) {

		Account ac = new Account();
		ac.setBalance(2000);
		ac.deposite(1000);
		ac.withdrawl(100);

	}
}
