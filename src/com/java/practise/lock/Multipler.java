package com.java.practise.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Multipler{

	 void getMultiples(int n) {
		 Lock lock=new ReentrantLock();
		try
		{
			lock.lock();
		for (int i = 1; i <= 6; i++) {
			System.out.println("Multiplication of "+n+"*"+i+":"+(n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		finally
		{
			lock.unlock();
		}
		
	}

}
