package com.guoyangc.decorator;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}

	@Override
	public void doThingA() {
		super.doThingA();
		doThingC();
	}
	
	private void doThingC() {
		System.out.println("do C thing");
	}
}
