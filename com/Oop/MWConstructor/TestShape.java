package com.oop.MWConstructor;

public class TestShape {
	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle(4);
		s[1] = new Rectangle(2, 4);

		System.out.println("AreaOf Circle :" + s[0].area());
		System.out.println("AreaOf Rectangle :" + s[1].area());

		System.out.println("TotalArea :" + areaa(s));

	}

	public static double areaa(Shape[] s) {

		double totalArea = 0;

		for (Shape ss : s) {
			totalArea = totalArea + ss.area();
		}

		return totalArea;
	}
}
