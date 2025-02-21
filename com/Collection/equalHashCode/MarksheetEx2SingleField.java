package com.equalHashCode;

public class MarksheetEx2SingleField {

	String rollNo;
	String name;
	int marks;

	public MarksheetEx2SingleField(String rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;

	}

	@Override
	public int hashCode() {

		return rollNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MarksheetEx2SingleField)) {
			return false;
		}

		MarksheetEx2SingleField e = (MarksheetEx2SingleField) obj;

		return this.rollNo.equals(e.rollNo);
	}

}
