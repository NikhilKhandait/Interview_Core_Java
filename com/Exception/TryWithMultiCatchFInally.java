package com.Exception;

public class TryWithMultiCatchFInally {
	/**
	 * in this class sir ask many cross question 
	 * like how we stop the execution of catch block and finally block
	 * some tricky question ok
	 */
	public static void main(String[] args) {
		int a=5;
		String s = null;
		try {
			System.out.println(a/0);
			System.out.println(s.length());
			//System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println(e);
			// System.exit(0);

		} catch (NullPointerException e) {
			System.out.println(e);
			 //System.exit(0);
		}finally {
			System.out.println("okok");
		}
	
	}
}