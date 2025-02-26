package com.streamAPI;

public class EmployeSalary {

	Integer salary;
	String name;

	public EmployeSalary(Integer salary, String name) {

		this.salary = salary;
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

}
