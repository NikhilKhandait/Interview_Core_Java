package com.comprator;

public class Employee {
	
	/* common class of all Tests */

	private String name;
	private int id;
	private int salary;
	
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {

		return name + ": " + id + ": " + salary;
	}
}
