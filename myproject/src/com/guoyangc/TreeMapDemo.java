package com.guoyangc;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		//treemap 1
		//		TreeMap<String, String> tmap = new TreeMap<String, String>();
//		tmap.put("jack", "zhangsan");
//		tmap.put("mary", "xiaowei");
//		tmap.put("jack", "xiaoli");
//		tmap.put("mary", "mali");
//		System.out.println(tmap);
//		
//		Set<Entry<String, String>> entrys = tmap.entrySet();
//		for(Entry<String, String> entry: entrys){
//			System.out.println(entry.getKey() + "--" + entry.getValue());
//		}
		//treemap 2
		TreeMap<Person, String> treeMap = new TreeMap<Person, String>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
//				if(o1.getAge() - o2.getAge() >0){
//					return 1;
//				}else if(o1.getAge() - o2.getAge() < 0){
//					return -1;
//				}
				
//				return 0;
//				return o1.getName().compareTo(o2.getName());
				if(o1.getName().compareTo(o2.getName()) > 0){
				return 1;	
				}else if(o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}else{
					return o1.getAge() - o2.getAge();
				}
			}
		});
		treeMap.put(new Person("jack", 38), "小李子");
		treeMap.put(new Person("moker", 27), "张三");
		treeMap.put(new Person("cary", 38), "李四");
		treeMap.put(new Person("jack", 32), "小李子");
		System.out.println(treeMap);
	}
}

class Person /*implements Comparable<Person>*/{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public int compareTo(Person o) {
//		if(this.age-o.getAge()>0){
//			return 1;
//		}else if(this.age-o.getAge()<0){
//			return -1;
//		}
//		return 0;
//	}
	
}