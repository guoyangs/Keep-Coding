package com.guoyangc.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("E:\\360downloads");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.delete());
		
		File myFile = new File("E:\\guoguoc");
		System.out.println(myFile.mkdir());
		File myFile2 = new File("E:\\guoguoc\\hello.txt");
		try {
			System.out.println(myFile2.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String[] list = file.list();
//		for (String string : list) {
//			System.out.println(string);
//		}
		
//		String[] list = file.list(new FilenameFilter(){
//			@Override
//			public boolean accept(File dir, String name) {
//				
//				return name.endsWith(".jpg");
//			}
//			
//		});
//		
//		for (String string : list) {
//			System.out.println(string);
//		}
		
//		File[] listFiles = file.listFiles();
//		for (File f : listFiles) {
//			System.out.println(f.getName() + "--" + f.length());
//		}
		
//		File[] listFiles = file.listFiles(new FilenameFilter() {
//			
//			@Override
//			public boolean accept(File dir, String name) {
//				return name.endsWith(".jpg");
//			}
//		});
//		for (File f : listFiles) {
//			System.out.println(f.getName() + "--" +f.length());
//		}
	
		File[] listFiles = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File arg0) {
				return arg0.getName().endsWith(".jpg");
			}
		});
		
		for (File f : listFiles) {
			System.out.println(f.getName() + "--" +f.length());
		}
	}

}
