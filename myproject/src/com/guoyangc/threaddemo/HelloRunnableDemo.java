package com.guoyangc.threaddemo;

public class HelloRunnableDemo {

	public static void main(String[] args) {
		HelloRunnable h1 = new HelloRunnable();
		Thread t1 = new Thread(h1,"A");
		t1.start();
		Thread t2 = new Thread(h1,"B");
		t2.start();
	}

}

//推荐使用   1.避免单继承的局限，一个类可以实现多个接口，但只能继承一个类
//2.是和资源共享
class HelloRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0 ; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
}