package com.prakharjain.ThreadConcept;

public class VolatileEx extends Thread{

	private boolean counting = true;
	private int counter =1;
	
	public void run()
	{
		while(counting)
		{
			System.out.println(counter);
			counter++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void stopCounting()
	{
		counting = false;
	}
}
