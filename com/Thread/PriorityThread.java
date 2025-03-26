package com.thread;

public class PriorityThread extends Thread {

	private String name;

	public PriorityThread(String name) {
		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : " + name);

		}
	}
}
