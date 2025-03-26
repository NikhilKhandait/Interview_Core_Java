package com.thread;

public class AccountTest {

	public static void main(String[] args) {

		AccountRecing a1 = new AccountRecing("nikhil");
		AccountRecing a2 = new AccountRecing("khandait");

		a1.start();
		a2.start();
	}
}
