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
		//���������������ļ�
//		int data = -1;
//		while((data=fis.read()) != -1) {
//			fos.write(data);
//		}
//		long end = System.currentTimeMillis();
//		fos.close();
//		fis.close();
//		System.out.println("���ƽ���:" + (end - start));
		//�������������ļ�
		byte[] buf = new byte[1024*1024];
		int len = 0;//��������ʵ�ʶ������ֽ���
		while((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		fos.close();
		fis.close();
		long end = System.currentTimeMillis();
		System.out.println("���ƽ���:" + (end - start));
	}
}