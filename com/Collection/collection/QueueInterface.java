package com.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {

		Queue qu = new PriorityQueue();// follow sorted order
//		Queue qu = new LinkedList(); // 

		qu.add(10);// add method throw exception if bounded queue when limit
		qu.add(20);
		qu.add(30);
		qu.add(40);
		qu.add(5);

		// return first element otherwise it return NoSuchElementException
		System.out.println(qu.element());

		// peek return first element and if list empty its also return null
		System.out.println(qu.peek());
		System.out.println(qu);
		// poll return and remove the first elements otherwise return null....
		System.out.println(qu.poll());

		// TRUE/FALSE --> if exist return true otherwise throws exception
		System.out.println(qu.remove(20));

		// add element otherwise return false
		System.out.println(qu.offer(50));
		System.out.println(qu);

	}
}
