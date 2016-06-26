package org.thread;
public class ThreadDemo2
{
	public static void main(String [] args)
	{
		new TestThread().start();
		while(true)
			{
				System.out.println("main thread is running");
			}
	}
}
