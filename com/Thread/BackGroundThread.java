package com.thread;

public class BackGroundThread extends Thread {

	String name ;
	
	public BackGroundThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		while (true) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
		
	}
}
