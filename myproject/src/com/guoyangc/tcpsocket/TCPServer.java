package com.guoyangc.tcpsocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException{
		//1.����һ��serverSocket����
		ServerSocket serverSocket = new ServerSocket(8888);
		//2.����accept()���������տͻ�������
		Socket socket = serverSocket.accept();
		System.out.println(socket.getInetAddress() + "has connected!");
		//3.��ȡsocket��������������
		 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		 String line = null;
		 //��ȡ�ͻ��˴�����������
		 while((line = br.readLine()) != null) {
			 if(line.equals("over")) {
				 break;
			 }
			 System.out.println(line);
			 bw.write(line.toUpperCase());
			 bw.newLine();
			 bw.flush();
		 }
		 bw.close();
		 br.close();
		 socket.close();
		 System.out.println(socket.getInetAddress() + "has disconnected!");
	}

}
