package com.guoyangc.inputoutputstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputStreamDemo {

	public static void main(String[] args) throws IOException {
//		String str = "hello world";
//		ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
//		int data = -1;
//		while((data = bis.read()) != -1) {
//			System.out.print((char)data);
//		}
//		bis.close();
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(97);
		bos.write(65);
		bos.write("hello world".getBytes());
		byte[] byteArray = bos.toByteArray();
		for (byte b : byteArray) {
			System.out.print((char)b);
		}
		
		FileOutputStream fos = new FileOutputStream(new File("e:\\sherlock.txt"),true);
		bos.writeTo(fos);//把ByteArrayOutputStream内部缓冲区的数据写到对应的文件输出流中
		fos.close();
	}

}
