package com.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {
	public static void main(String[] args) {

		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();

		c1.add(10);
		c1.add('b');
		c1.add('a');
		c2.add('b');
		c2.add('c');
		c2.add(10);

		System.out.println(c1);
		System.out.println(c2);

		c1.retainAll(c2);
		System.out.println("retain :" + c1);
		c2.removeAll(c1);
		System.out.println("Remove " + c1);
		System.out.println(c2);

	}
}
