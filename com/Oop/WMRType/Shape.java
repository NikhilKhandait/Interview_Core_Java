package com.oop.WMRType;

public class Shape {

	public double area() {
		return 0;
	}

	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle(10);

		}if (i == 2) {
			return new Rectangle(2,5);
		}
		
		return new Shape();
	}
}
