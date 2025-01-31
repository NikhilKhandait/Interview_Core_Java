package com.Exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementExcpt {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		try {
			System.out.println(it.next());
		} catch (NoSuchElementException e) {
			//System.out.println(e);
			e.printStackTrace();
		}

	}

}
