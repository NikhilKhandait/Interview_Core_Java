package com.oop.MWOCounstructo;

public class Circle extends Shape {

	public double radius;
	public static final double PI = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return PI * (radius * radius);
	}
}
