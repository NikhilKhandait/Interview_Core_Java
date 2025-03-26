package com.thread;

public class Account {

	public int balance;

	public void setBalance(int balance)  {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {

		try {
		Thread.sleep(200);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}
	
	/* here synchronized keyword remove and see output */
	
	public synchronized void deposit(String name,int amount) {
		setBalance(getBalance() + amount);
		System.out.println(name + " : " +getBalance());
		
	}
	

}
