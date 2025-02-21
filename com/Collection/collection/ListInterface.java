package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);

		System.out.println(list.get(1));
		list.set(2, 101);
		System.out.println(list.indexOf(400));
		System.out.println(list.subList(2, 4));
		list.remove(6);
		System.out.println(list);
		System.out.println(list.size());

		LinkedList<Integer> l = new LinkedList<Integer>();

		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);

//		System.out.println(l.size());
//		System.out.println(l.element());
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
//		System.out.println(l.peek());	
//		System.out.println(l.peekFirst());
//		System.out.println(l.peekLast());
//		System.out.println(l);
//		System.out.println(l.offerFirst(120));
//		System.out.println(l.offerLast(600));
//		System.out.println(l);
//		System.out.println(l.pollFirst());
//		System.out.println(l.pollLast());
//		System.out.println(l);
//		System.out.println(l.removeAll(l));
//		System.out.println(l);

		Stack s = new Stack();

		s.push(100);
		s.push(200);
		s.push(400);
		s.push(300);
		s.push(400);

//		System.out.println(s.isEmpty());
//		System.out.println("push/add element on last :" + s.push(600));
//		System.out.println(s);
//		System.out.println("pop remove elem for last :" + s.pop());
//		System.out.println("peek only last only  :" + s.peek());
//		System.out.println("search index of Obj/Elem :" + s.search(100));
//		System.out.println(s);
//		s.clear();

		Vector v = new Vector();

		v.add(10);
		v.add(5);
		v.add(20);
		v.add(30);

//		System.out.println(v.removeElement(5));
//		System.out.println(v.elementAt(2));
//		v.addElement(33);
//		v.insertElementAt(40, 1);// not remove only insert at given place....
//		System.out.println(v.subList(0, 5)); // means indexing 0-4 values retun
//		System.out.println(v.capacity());// default capacity of vector is [10] also increase as needed
//		System.out.println(v);

	}
}
