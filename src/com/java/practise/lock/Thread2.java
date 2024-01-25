package com.java.practise.lock;

public class Thread2 extends Thread {
	Multipler mu;

	public Thread2() {
		super();
	}
	public Thread2(Multipler mu) {
		this.mu = mu;
	}

	@Override
	public void run() {
      try
      {
    	  mu.getMultiples(5);
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
	}
}
