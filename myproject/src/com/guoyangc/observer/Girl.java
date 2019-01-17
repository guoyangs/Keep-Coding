package com.guoyangc.observer;

import java.util.ArrayList;
import java.util.List;

public class Girl implements IGirl {
	private List<IBoy> boyList = new ArrayList<IBoy>();
	private String msg = "sick";
	
	@Override
	public void attachBf(IBoy boy) {
		boyList.add(boy);
	}

	@Override
	public void detachBoy(IBoy boy) {
		if(boyList.size() > 0){
			boyList.remove(boy);
		}
	}

	@Override
	public void notifyBoy() {
		for (int i = 0; i < boyList.size(); i++) {
			IBoy boy = boyList.get(i);
			boy.update(msg);
		}
	}

}
