package com.oop.Abstractt;

public abstract class Vehicle {

	int speed;
	String name;

	public Vehicle(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	 abstract void start();
	
	 public void getInfo() {
		 System.out.println("Vehicle speed is : " + speed);
		 System.out.println("Vehicle name is : " + name);
	 }
	

}
