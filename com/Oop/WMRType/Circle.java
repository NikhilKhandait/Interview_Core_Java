package com.oop.WMRType;

public class Circle extends Shape {

	private double radius;

	public static final double PI = 3.14;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double area() {
		return PI * (radius * radius);
	}
}
