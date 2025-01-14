package com.oop.Explicit;

public class TestExplicit extends Explicit {

	public TestExplicit(String name) {
		super(name);
		System.out.println("After const..call ");
	}

	public static void main(String[] args) {
		TestExplicit tx = new TestExplicit("nikhil");
	}
}
