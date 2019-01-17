package com.guoyangc.inputoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirDemo {

	public static void main(String[] args) {
		try {
			CopyDirUtil.copyDir(new File("e:\\360downloads"), new File("d:\\copy360"));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("success");
		}
	}

}

class CopyDirUtil {
	public static void copyDir(File src,File dst) throws IOException {
		dst.mkdirs();
		if(src != null) {
			File[] files = src.listFiles();//遍历源文件夹中所有的文件或者目录
			if(files != null) {
				for (File f : files) {
					if(f.isFile()) {
						FileInputStream fis = new FileInputStream(f);
						FileOutputStream fos =new FileOutputStream(dst.getAbsolutePath() + "\\" + f.getName());
						byte[] buf = new byte[1204*1024];
						int len = 0;//保存读到的字节个数
						while((len = fis.read(buf))!= -1) {
							fos.write(buf, 0, len);
						}
						fis.close();
						fos.close();
					}else {
						copyDir(f,new File(dst.getAbsolutePath() + "\\" + f.getName()));
					}
				}
			}
		}
		
	}
}