package com.thread;

public class DemonThreadTest {
public static void main(String[] args) throws InterruptedException {
	
	BackGroundThread t = new BackGroundThread("demon thred");
	
	t.setDaemon(true);
	
	t.start();
	
	for (int i = 1; i <= 5; i++) {
		
		Thread.sleep(1000);
		
		System.out.println("main");
	}
}
	
	
	
}
