package com.java.practise.lock;

public class Thread1 extends Thread {
	Multipler mu;
	
	public Thread1() {
		super();
	}

	public Thread1(Multipler mu) {
		this.mu = mu;
	}

	@Override
	public void run() {
      try
      {
    	  mu.getMultiples(3);
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
	}
	
}
