package com.guoyangc.synchronizeddemo;

public class BankDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		BankThread p1 = new BankThread(bank);
		p1.start();
		BankThread p2 = new BankThread(bank);
		p2.start();
	}

}

class BankThread extends Thread {
	private Bank bank = null;
	public BankThread(Bank bank){
		this.bank = bank;
	}
	@Override
	public void run() {
		System.out.println("ȡǮ: " + bank.getMoney(400));
	}
	
}


class Bank {
	private int money = 500;
	//ȡǮ���������ȡǮ����Ŀ
	//��һ���߳�ȥ����ͬ��������ʱ������߳̾ͻ�ȡ�˵�ǰ�������
	//�����̵߳�����ͬ��������ʱ��ֻ�ܵȴ�����Ϊ�޷���ȡ�������
	//ֻ�еȵ�һ���߳��ͷŶ�����������̷߳��ɽ���
	public synchronized int getMoney(int number) {
		if(number<0) {
			return -1;
		}else if(money<0) {
			return -2;
		}else if(number-money>0) {
			return -3;
		}else {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			money -= number;
			System.out.println("���: " + money);
		}
		return number;
	}
}