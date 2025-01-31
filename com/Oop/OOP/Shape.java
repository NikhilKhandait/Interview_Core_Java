package com.oop.OOP;

public class Shape {

	public double border;
	public String colour;

	public double getBorder() {
		return border;
	}

	public void setBorder(double border) {
		this.border = border;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public static void main(String[] args) {

		Shape s = new Shape();
		s.setBorder(2);
		s.setColour("Blue");
		System.out.println(s.getBorder());
		System.out.println(s.getColour());
	}
}
