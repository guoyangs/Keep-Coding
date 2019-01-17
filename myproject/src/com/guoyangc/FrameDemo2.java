package com.guoyangc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameDemo2 {

	public static void main(String[] args) {
		MyFrame2 myFrame2 = new MyFrame2("sheolock");
		myFrame2.init();
	}

}

class MyFrame2 extends Frame {
	public MyFrame2(String title) {
		super(title);
	}
	public void init() {
		this.setSize(300,300);
		this.setBackground(Color.BLUE);
		this.setLayout(null);//去掉窗体的默认布局管理器
		Panel panel = new Panel();
		panel.setLayout(null);//去掉panel容器的默认布局管理器
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 200, 200);
		Button btn = new Button("click");
		btn.setBounds(0, 0, 100, 100);
		btn.setBackground(Color.CYAN);
		panel.add(btn);//添加按钮到面板中
		this.add(panel);//把panel加到窗体中
		this.setVisible(true);
	}
}