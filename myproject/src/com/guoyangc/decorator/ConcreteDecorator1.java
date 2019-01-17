package com.guoyangc.decorator;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}

	@Override
	public void doThingA() {
		super.doThingA();
		doThingB();
	}
	
	private void doThingB() {
		System.out.println("do B thing");
	}
}
