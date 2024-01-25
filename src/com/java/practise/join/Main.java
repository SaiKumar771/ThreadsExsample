package com.java.practise.join;

public class Main {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread(), "thread1");
		Thread thread2 = new Thread(new MyThread(), "thread2");
		Thread thread3 = new Thread(new MyThread(), "thread3");

		thread1.start();

		try {
			thread1.join();  // here main thread pauses and thread1 do rest of execution and die.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		thread2.start();

		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		thread3.start();

		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("All threads finished");
	}

}
