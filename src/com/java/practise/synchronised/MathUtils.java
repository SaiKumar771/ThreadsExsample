package com.java.practise.synchronised;

public class MathUtils {

	 void getMultiples(int n) {
		 synchronized(this) {
		for (int i = 1; i <= 6; i++) {
			System.out.println("Multiplication of "+n+"*"+i+":"+(n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}

}
