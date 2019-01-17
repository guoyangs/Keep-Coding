package com.guoyangc.observer;

public class Test {

	public static void main(String[] args) {
		BoyZhang boyZhang = new BoyZhang();
		BoyGuo boyGuo = new BoyGuo();
		BoyLi boyLi = new BoyLi();
		Girl girl = new Girl();
		girl.attachBf(boyZhang);
		girl.attachBf(boyGuo);
		girl.attachBf(boyLi);
		girl.detachBoy(boyGuo);
		
		girl.notifyBoy();
		
	}

}
