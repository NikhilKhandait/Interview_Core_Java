package com.thread;

public class JoinThread extends Thread {

	 private String name;
	
	public JoinThread(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i +"=" + name);
		}
	}

}
