package com.guoyangc.decorator;

public class Decorator implements Component {
	private Component component = null;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void doThingA() {
		component.doThingA();
	}

}
