package com.oop.AbstractClass;

/**
 * @author Nikhil
 *
 */
public abstract class Water {

	private int temp;
	private String state;
	

	public Water(int temp, String state) {
		this.temp = temp;
		this.state = state;
	}

	abstract void change();

	public void getInfo() {
		System.out.println("Water temp is : " + temp);
		System.out.println("Water(Ice) state is : " + state);
	}

}
