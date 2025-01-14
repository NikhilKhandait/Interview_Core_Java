package com.oop.AbstractClass;

public class CarTest extends Vehicle {

	public CarTest(int speed, String name) {
		super(speed, name);

	}

	@Override
	void start() {
		System.out.println("engine start..gar.gar.gar.gar...");

	}

	public static void main(String[] args) {

		CarTest t = new CarTest(22, "Tarzen");
		t.getInfo();
		t.start();
		

	}
}
