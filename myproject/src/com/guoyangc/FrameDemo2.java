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
		this.setLayout(null);//ȥ�������Ĭ�ϲ��ֹ�����
		Panel panel = new Panel();
		panel.setLayout(null);//ȥ��panel������Ĭ�ϲ��ֹ�����
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 200, 200);
		Button btn = new Button("click");
		btn.setBounds(0, 0, 100, 100);
		btn.setBackground(Color.CYAN);
		panel.add(btn);//��Ӱ�ť�������
		this.add(panel);//��panel�ӵ�������
		this.setVisible(true);
	}
}