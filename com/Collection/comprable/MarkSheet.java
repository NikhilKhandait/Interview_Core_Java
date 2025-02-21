package com.comprable;

public class MarkSheet implements Comparable<MarkSheet> {
	public String rollNo;
	public String name;
	public int marks;

	public MarkSheet(String rollNo, String name, int marks) {

		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(MarkSheet o) {

		return rollNo.compareTo(o.rollNo);
	}

	@Override
	public String toString() {

		return rollNo + ": " + name + ": " + marks;
	}
}
