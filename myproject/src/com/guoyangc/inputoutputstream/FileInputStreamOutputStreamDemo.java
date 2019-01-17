package com.guoyangc.inputoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamOutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileCopyUtil.copyFile(new File("E:\\360downloads\\198667.jpg"), new File("E:\\rrr.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class FileCopyUtil {
	public static void copyFile(File src,File dst) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		long start = System.currentTimeMillis();
		//不带缓冲区复制文件
//		int data = -1;
//		while((data=fis.read()) != -1) {
//			fos.write(data);
//		}
//		long end = System.currentTimeMillis();
//		fos.close();
//		fis.close();
//		System.out.println("复制结束:" + (end - start));
		//带缓冲区复制文件
		byte[] buf = new byte[1024*1024];
		int len = 0;//用来保存实际读到的字节数
		while((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		fos.close();
		fis.close();
		long end = System.currentTimeMillis();
		System.out.println("复制结束:" + (end - start));
	}
}