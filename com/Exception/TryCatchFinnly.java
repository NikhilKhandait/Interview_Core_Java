package com.Exception;

public class TryCatchFinnly {
	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
			// System.exit(0);
		} finally {
			System.out.println("this is finnly block..");
			//System.exit(0);
		}
	}
}
