package com.thread;

public class WithoutThreadTest {
public static void main(String[] args) {
	
	WithoutThread t1 = new WithoutThread("rays");
	WithoutThread t2 = new WithoutThread("tech");
	
	t1.run();
	t2.run();
}
}
