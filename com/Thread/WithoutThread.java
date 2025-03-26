package com.thread;

public class WithoutThread {

	String name;

	public WithoutThread(String name) {
		this.name = name;
	}

	public void run() {

		for (int i = 1; i <= 4; i++) {
			System.out.println(name);
		}
	}

}
