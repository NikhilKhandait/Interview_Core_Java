package com.equalHashCode;

public class Employee {

	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public int hashCode() {

		String s = this.id + this.name + this.salary;
		return s.hashCode();
	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee e = (Employee) obj;

		String s1 = this.id + this.name + this.salary;
		String s2 = e.id + e.name + e.salary;
		return s1.equals(s2);

	}

	@Override
	public String toString() {
		String s = this.id + this.name + this.salary;
		return s;
	}
}
