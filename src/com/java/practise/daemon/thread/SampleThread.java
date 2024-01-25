package com.java.practise.daemon.thread;

public class SampleThread implements Runnable {

	private String name;

	public SampleThread(String name) {
		super();
		this.name = name;
	}

	public void run() {
		System.out.println("Inside run method: "+name);

	}

}
