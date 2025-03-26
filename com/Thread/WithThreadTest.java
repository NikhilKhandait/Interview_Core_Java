package com.thread;

public class WithThreadTest {
public static void main(String[] args) {
	
	WIthThread t1 = new WIthThread("abc");
	WIthThread t2 = new WIthThread("xyz");

	t1.start();
	t2.start();
	
}
}
