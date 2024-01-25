package com.java.practise;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread1 t1 = new Thread1();
			t1.start();
			try {
				Thread1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Thread t2 = new Thread(new Thread2());
			t2.start();

		}

	}

}
