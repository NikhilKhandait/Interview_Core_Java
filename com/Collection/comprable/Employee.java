package com.comprable;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// we use this method but sir says give with another type so try below method
	@Override
	public int compareTo(Employee o) {
		if (this.id > o.getId()) {
			return -1;
		}
		if (this.id < o.getId()) {
			return 1;
		}

		return 0;
	}

	@Override
	public String toString() {
		
		return id + ":" + name;
	}

//	@Override
//	public int compareTo(Employee o) {
//		return Integer.compare(this.id, o.getId());
//	}

}