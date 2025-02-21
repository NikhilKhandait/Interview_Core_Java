package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);

		Enumeration<Integer> e = v.elements();
		v.add(600);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
