package com.thread;


public class RunnableTest implements Runnable {

	String name;

	public RunnableTest(String name) {
		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 2; i++) {
			System.out.println(name);
		}

	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new RunnableTest("Ram"));
		Thread t2 = new Thread(new RunnableTest("Shayam"));
		
		t1.start();
		t2.start();
	}

}
