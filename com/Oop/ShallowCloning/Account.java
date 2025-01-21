package com.oop.ShallowCloning;

public class Account implements Cloneable {

	public int balance;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	}
