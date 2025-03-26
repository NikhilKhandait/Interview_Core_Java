package com.thread;

public class ThreadTest extends Thread {

	String name;

	private ThreadTest(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {

		ThreadTest t1 = new ThreadTest("nikhil");
		ThreadTest t2 = new ThreadTest("khandait..");

		t1.start();
		t2.start();
	}
}
