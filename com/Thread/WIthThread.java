package com.thread;

public class WIthThread extends Thread {

	String  name = null;
	
	public WIthThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + name);
		}
	}
}
