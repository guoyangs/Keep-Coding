package com.guoyangc;

import java.awt.Color;
import java.awt.Frame;

public class FrameDemo {

	public static void main(String[] args) {
		MyFrame mf = new MyFrame("title");
		mf.init();
	}

}

class MyFrame extends Frame{
	public MyFrame(String title) {
		super(title);
	}
	
	public void init() {
//		this.setSize(300,300);
		this.setBounds(100,100,300,300);
		this.setBackground(Color.BLUE);
		this.setVisible(true);
	}
}