package com.guoyangc.observer;

public class BoyGuo implements IBoy {

	@Override
	public void update(String msg) {
		if(msg.equals("sick")) {
			System.out.println("hold on ");
		}
	}

}
