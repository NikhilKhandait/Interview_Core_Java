package com.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratonExample {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
