package com.sriindu.extendingthredingclas;

//Main Class
public class Multithread {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}
}

/*
 * We create a class that extends the java.lang.Thread class. This class
 * overrides the run() method available in the Thread class. A thread begins its
 * life inside run() method. We create an object of our new class and call
 * start() method to start the execution of a thread. Start() invokes the run()
 * method on the Thread object.
 */