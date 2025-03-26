package com.thread;

public class PriorityThreadTest {
	public static void main(String[] args) {

		/* priority is not follow here properly its based on our  OS */
		
		PriorityThread t1 = new PriorityThread("nikhil");
		PriorityThread t2 = new PriorityThread("lokesh");

		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();

	}
}
