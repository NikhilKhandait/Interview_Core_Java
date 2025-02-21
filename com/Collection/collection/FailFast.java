package com.collection;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
	public static void main(String[] args) {

		 List list = new ArrayList();
		//ArrayBlockingQueue list = new ArrayBlockingQueue(5); // Exception Not raise
		list.add(10);
		list.add(20);
		list.add(30);

		Iterator it = list.listIterator();
		list.add(10);//ConcurrentModificationException throw
//		list.clear();
		while (it.hasNext()) {

			System.out.println(it.next());

		}
	}
}
