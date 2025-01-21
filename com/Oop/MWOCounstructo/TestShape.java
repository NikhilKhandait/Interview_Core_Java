package com.oop.MWOCounstructo;

public class TestShape {
	
	/* This is the test class of method without constructor 
	 * this class question is : Why us use typecasting here ?
	 * 
	 * */
	
	public static void main(String[] args) {

		Shape[] s = new Shape[2];
		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle)s[0];
		c.setRadius(5);

		Rectangle r = (Rectangle) s[1];
		r.setLength(4);
		r.setWidth(8);

		System.out.println("Area of Circle :" + s[0].area());
		System.out.println("Area of Rectangle :" + s[1].area());

		System.out.println("TotalArea :" + Area(s));
	}

	public static double Area(Shape[] s) {
		double totalArea = 0;
		for (Shape s1 : s) {
			totalArea += s1.area();
		}

		return totalArea;
	}
}