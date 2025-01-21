package com.oop.DeepCloning;

public class Customer implements Cloneable {

	public String name;

	public Account no;

	public Customer(String name) {
		this.name = name;
		no = new Account(1000);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer)super.clone();
		c.no = (Account) no;
		return c;
	}

}
