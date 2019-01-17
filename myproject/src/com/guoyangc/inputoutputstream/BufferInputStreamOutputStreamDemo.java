package com.guoyangc.inputoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStreamOutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileUtil.copyFile(new File("E:\\360downloads\\198667.jpg"), new File("E:\\rrr.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class FileUtil {
	public static void copyFile(File src,File dst) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long start = System.currentTimeMillis();
		//byte[] buf = new byte[1024*1024];
		int data = 0;//用来保存实际读到的字节数
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bis.close();
		bos.close();
		long end = System.currentTimeMillis();
		System.out.println("复制结束:" + (end - start));
	}
}