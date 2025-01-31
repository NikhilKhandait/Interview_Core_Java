package com.Exception;

public class ArrayIndexOutOfBoundExceptionnn {
	public static void main(String[] args) {

		int[] i = { 3, 4, 2, 5 };

		try {
			System.out.println(i[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
