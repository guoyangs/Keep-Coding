package com.guoyangc.observer;

public class BoyLi implements IBoy {

	@Override
	public void update(String msg) {
		if(msg.equals("sick")) {
			System.out.println("on the way");
		}
	}

}
