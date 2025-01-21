package com.oop.AbstractClass;

public class TestIce extends Water {

	public TestIce(int temp, String state) {
		super(temp, state);

	}

	@Override
	void change() {
		System.out.println("State.change.process...");

	}

	public static void main(String[] args) {

		TestIce t = new TestIce(5, "Solid");

		t.getInfo();
		t.change();

	}
}
