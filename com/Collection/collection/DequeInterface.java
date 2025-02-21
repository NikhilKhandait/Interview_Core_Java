package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
	public static void main(String[] args) {

		Deque<Integer> dq = new ArrayDeque<Integer>();

		dq.add(11);
		dq.add(12);
		dq.add(13);
		dq.add(14);
		dq.add(15);

		// Skip/Similar method--> for NoSuchElementException

		/* Similar to getFirst but return null if empty */
		
		System.out.println("peek_first  :" + dq.peekFirst());
		
		/* Similar to getLast but return null if empty */
		System.out.println("peek_last :" + dq.peekLast());

		/* Similar to addFirst but return true/false */
		System.out.println("offerFirst :" + dq.offerFirst(19));
		/* Similar to addLast but return true/false */
		System.out.println("offerLast :" + dq.offerLast(9));
		System.out.println(dq);

		//Similar to remove() but not throw exception return nulllll 
		
		/* return and remove first otherwise null */
		System.out.println(dq.pollFirst());
		/* return and remove last otherwise null */
		System.out.println(dq.pollLast());

	}
}
