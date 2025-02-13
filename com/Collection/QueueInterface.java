package com.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {

		Queue qu = new PriorityQueue();
//		Queue qu = new LinkedList();

		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		qu.offer(40);

		// return first element otherwise it return NoSuchElementException
		// System.out.println(qu.element());

		// peek return head element and if list empty its also return null
		// System.out.println(qu.peek());

		// poll return and remove the elements otherwise return nulllll
		// System.out.println(qu.poll());

		// TRUE/FALSE --> if exist return true otherwise false
		System.out.println(qu.remove(20));
		System.out.println(qu);

	}
}
