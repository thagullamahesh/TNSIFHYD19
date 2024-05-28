package com.sriindu.implementingrunnable;

public class Multithread {
	
	public static void main(String[] args) {
		int n=8;
		 for (int i = 0; i < n; i++) {
	            Thread object
	                = new Thread(new MultithreadingDemo());
	            object.start();
	        }
	}

}

/*
 * We create a new class which implements java.lang.Runnable interface and
 * override run() method. Then we instantiate a Thread object and call start()
 * method on this object.
 */


/*
 * Thread Class vs Runnable Interface
 * 
 * 1 If we extend the Thread class, our class cannot extend any other class
 * because Java doesn’t support multiple inheritance. But, if we implement the
 * Runnable interface, our class can still extend other base classes.
 * 
 * 2 We can achieve basic functionality of a thread by extending Thread class
 * because it provides some inbuilt methods like yield(), interrupt() etc. that
 * are not available in Runnable interface.
 */