package com.oop.ConstructorCall;

/**
 * in this class sir remove the super keyword and ask what happen or what will
 * be the output so it gives a compilation error if parent class does not have
 * default constructor then we must need to call atleast one Parameterized
 * constructor. so in this case we simply define the default constructor in
 * parent class
 */
public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(int id, String name, String address) {
		super(id, name, address);
		System.out.println("after execution sucess...3");
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling(1, "nikhil", "indore");
		System.out.println("complete ....4-" +" "+ t.id +" "+ t.name +" "+ t.address);
	}

}