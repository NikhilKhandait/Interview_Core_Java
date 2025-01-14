package com.oop.MWConstructor;

public class Circle extends Shape {

	public double radius;
	public static final double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI * radius * radius;
	}
}
