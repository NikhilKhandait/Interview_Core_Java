package com.collection;

public class AutoBoxUnBoxing {
	public static void main(String[] args) {

		/* AutoBoxing Example............ */
		/* primitive( int,double) convert into Object(WraperClass) Integer,Double */
		
		int c = 11;
		Integer d = c;
		System.out.println(d);

		/* UnBoxing Example.......... */
		/* Object(WraperClass) convert into primitive type(int double) */
		
		Integer a = new Integer(10);
		//Integer a = Integer.valueOf(10);
		int b = a;
		System.out.println(b);
	}
}
