package com.oop.Overiding;

public class Circle extends Shape {

	@Override
	public void area() {
		System.out.println("Dog is here..!!");
	}
	
	public static void main(String[] args) {
		Shape a = new Shape();
		a.area();
		
	}
}
