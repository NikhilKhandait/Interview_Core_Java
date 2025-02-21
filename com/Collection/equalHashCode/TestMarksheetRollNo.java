package com.equalHashCode;

public class TestMarksheetRollNo {
	public static void main(String[] args) {

		// here we test only based on rollNo HashCode not all field...
		MarksheetEx2SingleField e = new MarksheetEx2SingleField("ABC122", "abdssd", 19887825);
		MarksheetEx2SingleField e1 = new MarksheetEx2SingleField("ABC122", "cdhfhg", 12554);

		if (e.equals(e1)) {
			if (e.hashCode() == e1.hashCode()) {
				System.out.println("equal hashcode");
			}
			System.out.println("obj are equal");
		} else {
			System.out.println("not equal...");
		}
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
	}
}
