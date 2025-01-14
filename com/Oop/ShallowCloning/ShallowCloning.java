package com.oop.ShallowCloning;

public class ShallowCloning implements Cloneable {

	public int balance;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
