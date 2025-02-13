package com.Collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestAddOffer {
	public static void main(String[] args) {

		Queue<Integer> of = new ArrayBlockingQueue(2);

//		of.offer(10);
//		of.offer(11);
//		of.offer(12);
//		of.offer(13);
//		System.out.println(of);
		
		Queue<Integer> ad = new ArrayBlockingQueue(2);
		
		System.out.println(ad.add(10));
		System.out.println(ad.add(20));
		System.out.println(ad.add(30));
		ad.add(40);
		System.out.println(ad);
//		
		Queue<Integer> of1 = new LinkedBlockingDeque(2);
		
//		of1.offer(100);
//		of1.offer(200);
//		of1.offer(300);
//		of1.offer(400);
//		System.out.println(of1);
		
		Queue<Integer> ad1 = new LinkedBlockingDeque<Integer>(2);
		
//		ad1.add(111);
//		ad1.add(112);
//		ad1.add(113);
//		ad1.add(114);
//		System.out.println(ad1);
	}
}
