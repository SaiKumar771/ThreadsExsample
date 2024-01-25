package com.java.practise.lock;

public class LockSample {

	public static void main(String[] args) {
		Multipler mu = new Multipler();

		Thread1 t1 = new Thread1(mu);
		Thread t2 = new Thread(new Thread2(mu));

		t1.start();
		t2.start();
	}

}
