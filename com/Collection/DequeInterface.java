package com.Collection;

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

		// return only first elements //return 10 if empty->Excp NoSuchElementException
		//System.out.println(dq.getFirst());
		

		// it returns and removes the first element if empty-> Excp NosuchElemExcp
		//System.out.println(dq.pop());
		

		// return only first elements otherwise return null
//		System.out.println(dq.peek());
//		System.out.println(dq);

		// it returns and removes the first element otherwise return null.
//		System.out.println(dq.poll());
//		System.out.println(dq);

		System.out.println(dq);
		System.out.println(dq.pollLast());
		System.out.println(dq);

	}
}
