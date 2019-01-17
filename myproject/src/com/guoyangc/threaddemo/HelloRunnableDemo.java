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

//�Ƽ�ʹ��   1.���ⵥ�̳еľ��ޣ�һ�������ʵ�ֶ���ӿڣ���ֻ�ܼ̳�һ����
//2.�Ǻ���Դ����
class HelloRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0 ; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
}