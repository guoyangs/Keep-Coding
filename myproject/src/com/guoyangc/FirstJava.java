package com.guoyangc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstJava {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("1");
		arrayList.add("3");
		arrayList.set(1, "2");
		
		System.out.println("ʹ�õ���������������ͳһ����");
		Iterator<String> it = arrayList.iterator();
		while(it.hasNext()){
			String name = it.next();
			System.out.println(name);
		}
		
		System.out.println("ʹ����ǿforѭ��������ͳһ����");
		for (String str : arrayList) {
			System.out.println(str);
		}
		
		
		System.out.println(arrayList.contains("2"));
		System.out.println(arrayList.remove(1));
		System.out.println(arrayList.remove("2"));
		System.out.println(arrayList.indexOf("a"));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.toArray().length);
		
		
	}

}
