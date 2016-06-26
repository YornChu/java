package org.thread;
public class ThreadDemo3
{
	public static void main(String [] args)
	{
	TestThread tt=new TestThread();
	Thread t=new Thread(tt);
	t.start();
	while(true)
	{
		System.out.println("main thread is running");
	}
	}
}
