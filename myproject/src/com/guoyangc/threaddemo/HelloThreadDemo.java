package com.guoyangc.threaddemo;

public class HelloThreadDemo {

	public static void main(String[] args) {
//		HelloThread h1 = new HelloThread();
//		h1.setName("线程1");
//		h1.start();
//		HelloThread h2 = new HelloThread();
//		h2.setName("线程2");
//		h2.start();
		
		HelloThread h3 = new HelloThread("线程3");
		h3.start();
		HelloThread h4 = new HelloThread("线程4");
		h4.start();
	}

}

class HelloThread extends Thread {
	

	public HelloThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0 ; i<5; i++) {
			System.out.println(this.getName() + ":" + i);
		}
	}
	
}