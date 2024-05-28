package com.sriindu.runningthreads;

public class Main {
	
	public static void main(String[] args) {
		ChildClass1 c1 = new ChildClass1();
		ChildClass2 c2 = new ChildClass2();
		ChildClass3 c3 = new ChildClass3();
		
		c1.start();
		c2.start();
		c3.start();
	}

}
