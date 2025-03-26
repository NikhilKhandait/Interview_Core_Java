package com.thread;

public class AccountRecing extends Thread {

	String name;
	
	/* here static keyword remove and see output ...... */
	public static Account account = new Account();
	
	public AccountRecing(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			account.deposit(name, 1000);
		}
	}
}
