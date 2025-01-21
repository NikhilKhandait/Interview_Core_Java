package com.oop.DeepCloning;

public class Account implements Cloneable {

	public int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
