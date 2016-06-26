package org.thread.ticket;
public class ThreadDemo4
{
	public static void main(String [] args)
	{
		TicketThread2 t=new TicketThread2();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}
