package com.guoyangc.inputoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamDemo {

	public static void main(String[] args) throws IOException {
//		String name = "sherlock";
//		int age = 27;
//		boolean flag = true;
//		char sex = 'ÄÐ';
//		double money = 100.55;
//		
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e:\\shr.txt"));
//		dos.writeUTF(name);
//		dos.writeInt(age);
//		dos.writeBoolean(flag);
//		dos.writeChar(sex);
//		dos.writeDouble(money);
//		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("e:\\shr.txt"));
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		dis.close();
	}

}
