package com.java.practise.daemon.thread;

public class Main {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new SampleThread("thread1"));
		Thread thread2 = new Thread(new SampleThread("thread2"));
		Thread thread3 = new Thread(new SampleThread("thread3"));

		System.out.println("get thread1 priority: " + thread1.getPriority());
		System.out.println("get thread2 priority: " + thread2.getPriority());
		System.out.println("get thread3 priority: " + thread3.getPriority());

		thread1.setPriority(4);
		thread2.setPriority(1);
		thread3.setPriority(9);

		System.out.println("get new thread1 priority: " + thread1.getPriority());
		System.out.println("get new thread2 priority: " + thread2.getPriority());
		System.out.println("get new thread3 priority: " + thread3.getPriority());

		System.out.println("Currently running Thread : " + Thread.currentThread().getName());
		System.out.println("get current priority :" + Thread.currentThread().getPriority());
		thread1.setDaemon(true);
		System.out.println("getting priority after deamon thread setting :" + thread1.getPriority());

		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("getting priority after deamon thread setting :" + thread1.getPriority());

	}

}
