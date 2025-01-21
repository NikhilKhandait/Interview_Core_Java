package com.oop.WMRType;

public class TestShape {
	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);

		System.out.println("Area of circle :" + s[0].area());
		System.out.println("Area of rectangle :" + s[1].area());

		System.out.println("TotalArea : " + Area(s));
	}

	public static double Area(Shape[] s) {
		double totalArea = 0;
		for (Shape ss : s) {
			totalArea = totalArea + ss.area();
		}
		return totalArea;
	}
}
