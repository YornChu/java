package org.thread;
public class TestThread extends Thread
{
	public void run()
	{
		while(true){
		System.out.println(Thread.currentThread().getName()+"1 ");
		}

	}
}
