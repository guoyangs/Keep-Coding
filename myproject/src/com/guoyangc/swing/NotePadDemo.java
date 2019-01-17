package com.guoyangc.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePadDemo {

	public static void main(String[] args) {
		new MyFrame("���±�");
	}

}

class MyFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea tv_area = null;
	private JScrollPane s_pane = null;//�������������
	private JMenuBar mb =  null;//�˵���
	private JMenu m_file = null;//�ļ��˵�
	private JMenu m_help = null;//�����˵�
	private JMenuItem item_new = null;//�½�
	private JMenuItem item_open = null;//��
	private JMenuItem item_exit = null;//�˳�
	private JMenuItem item_about = null;//����
	
	public MyFrame(String title){
		super(title);
		init();
		registerListener();
	}
	//��ʼ��
	private void init() {
		tv_area = new JTextArea();
		s_pane = new JScrollPane(tv_area);
		s_pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		Container container = this.getContentPane();
		container.add(s_pane, BorderLayout.CENTER);
		this.setSize(500, 300);//���ô����С
		//��ʼ���˵��� 
		mb = new JMenuBar();//�˵���
		m_file = new JMenu("�ļ�");
		item_new = new JMenuItem("�½�");
		item_open = new JMenuItem("��");
		item_exit = new JMenuItem("�˳�");
		m_file.add(item_new);
		m_file.add(item_open);
		m_file.add(item_exit);
		
		m_help = new JMenu("����");
		item_about = new JMenuItem("����");
		m_help.add(item_about);
		
		mb.add(m_file);
		mb.add(m_help);
		//�Ѳ˵�����ӵ�������
		this.setJMenuBar(mb);
		
		this.setVisible(true);//��ʾ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ��ڵ�ʱ���˳�Ӧ��
		//���ô��ھ�����ʾ
		//����һ�����߰�
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		int windowWidth = this.getWidth();
		int windowHeight = this.getHeight();
		this.setLocation((screenWidth-windowWidth)/2, (screenHeight - windowHeight)/2);
		this.setVisible(true);
	}
	//����ص�������ؼ��������¼�������
	private void registerListener() {
		item_new.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				newFile();
			}
		});
		item_open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		
		item_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		
		
		item_about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AboutDialog(MyFrame.this, "����", true);
			}
		});
		
	}
	//�½��Ĺ���
	private void newFile() {
		if(!tv_area.getText().equals("")){
			int res = JOptionPane.showConfirmDialog(null, "�Ƿ񱣴�?", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
			if(res == JOptionPane.YES_OPTION) {
				//�ļ�����Ի���
				FileDialog fd = new FileDialog(this, "�����ļ�", FileDialog.SAVE);
				fd.setVisible(true);
			}else{
				tv_area.setText("");//��նԻ���
			}
		}
	}
	//���ļ�
	private void openFile() {
		FileDialog fd = new FileDialog(this, "���ļ�", FileDialog.SAVE);
		fd.setVisible(true);
	} 
	//�˳�����
	private void exit() {
		newFile();
		System.exit(0);
	}
}


class AboutDialog extends JDialog {
	private JLabel desc = null;
	private JPanel panel = null;
	private JButton btn = null;
	
	
	public AboutDialog(Frame frame, String title, boolean modal) {
		super(frame, title, modal);
		init();
		registerListener();
	}
	
	private void init() {
		desc = new JLabel();
		desc.setText("<html>����һ���Զ���ļ��±�</html>");
		desc.setHorizontalAlignment(JLabel.CENTER);
		panel = new JPanel();
		btn = new JButton("OK");
		panel.add(btn);
		this.add(desc);//Ĭ�Ϸ��ڱ߽粼�ֹ��������м�
		this.add(panel, BorderLayout.SOUTH);
		this.setSize(300,300);
		
	}
	
	private void registerListener() {
		btn.addActionListener(new ActionListener() {
			
			 @Override
			public void actionPerformed(ActionEvent e) {
				AboutDialog.this.dispose();//�˳��Ի���
			}
		});
		
		this.setVisible(true);
	}
	
}


