package com.java.practise.synchronised;

public class Thread2 extends Thread {
	MathUtils mu;

	public Thread2() {
		super();
	}
	public Thread2(MathUtils mu) {
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
