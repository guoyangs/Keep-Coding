package com.guoyangc.threaddemo;

public class SharedDataThreadDemo {

	public static void main(String[] args) {
//		TicketThread s1 = new TicketThread("һ��");
//		s1.start();
//		TicketThread s2 = new TicketThread("һ��");
//		s2.start();
		
		TicketRunnable ticketRunnable = new TicketRunnable();
		Thread t1 = new Thread(ticketRunnable,"һ��");
		t1.start();
		Thread t2 = new Thread(ticketRunnable,"����");
		t2.start();
	}

}

//class TicketThread extends Thread {
//	private int ticket = 5;
//	public TicketThread(String name) {
//		super(name);
//	}
//
//	@Override
//	public void run() {
//		while(true) {
//			System.out.println(this.getName() + ":" + (ticket--));
//			if(ticket<1) {
//				break;
//			}
//		}
//	}
//}

class TicketRunnable implements Runnable {
	private int ticket = 5;
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + ":" + (ticket--));
			if(ticket<1) {
				break;
			}
		}
	}
	
}
