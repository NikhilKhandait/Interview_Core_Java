
package com.oop.ConstructorCalling;

public class ConstructorCalling {

	int id;
	String name;
	String address;

	public ConstructorCalling(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("two param. const. call...1");
	}

	public ConstructorCalling(int id, String name, String address) {
		this(id, name);

		this.address = address;
		System.out.println("three param. const. call...2");
	}
}
