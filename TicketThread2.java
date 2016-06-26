package org.thread.ticket;
public class TicketThread2 implements Runnable
{
	private int tickets=100;
	public void run()
	{
		while(true)
			{
				if(tickets>0)
					System.out.println(Thread.currentThread().getName()+"is selling ticket"+tickets--);
			}
	}
}
