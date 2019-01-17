package com.guoyangc.decorator;

public class Test {

	public static void main(String[] args) {
		ConcreteComponent com = new ConcreteComponent();
//		com.doThingA();
		ConcreteDecorator1 dec1 = new ConcreteDecorator1(com);
//		dec1.doThingA();
		ConcreteDecorator2 dec2 = new ConcreteDecorator2(dec1);
		dec2.doThingA();
	}

}
