package org.thread;
class ThreadDemo
{
public static void main(String [] args)
{
	new TestThread().run();
	while(true)
		{
			System.out.println("main thread is running");
		}

}
}
