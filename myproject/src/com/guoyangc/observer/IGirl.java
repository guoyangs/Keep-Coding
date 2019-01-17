package com.guoyangc.observer;

public interface IGirl {
	public void attachBf(IBoy boy);
	public void detachBoy(IBoy boy);
	public void notifyBoy();
}
