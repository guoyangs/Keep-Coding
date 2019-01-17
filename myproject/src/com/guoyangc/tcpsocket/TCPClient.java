package com.guoyangc.tcpsocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws IOException{
		Socket socket = new Socket("127.0.0.1", 8888);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		while(true) {
			String line = br.readLine();//��ȡ������������ַ���
			bw.write(line);
			bw.newLine();
			bw.flush();
			if(line.equals("over")) {
				break;
			}
			System.out.println(reader.readLine());//��ȡ����˴����Ĵ�д�ַ���
		}
		reader.close();
		br.close();
		bw.close();
		socket.close();
	}

}
