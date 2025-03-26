package com.thread;

public class JoinThreadTest {
public static void main(String[] args) {
	
	JoinThread t1 = new JoinThread("nikhil");
	JoinThread t2 = new JoinThread("lokesh");
	
	t1.start();
	
	try {
		t1.join();
	}catch (InterruptedException e) {
		
	}
	
	t2.start();
}
}
