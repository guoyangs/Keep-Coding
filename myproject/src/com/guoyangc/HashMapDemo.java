package com.guoyangc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
//		//map 1
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("joker", "1");
//		map.put("joker", "2");
//		map.put("jay", "3");
//		map.put("jiyker", "4");
//		System.out.println(map);
////		Set<String> keys = map.keySet();
////		for (String string : keys) {
////			System.out.println(string);
////		}
//		
//		Collection<String> values = map.values();
//		for (String string : values) {
//			System.out.println(string);
//		}
//		
//		Set<String> keys = map.keySet();
//		for (String string : keys) {
//			System.out.println(string + " ," + map.get(string));
//		}
//		
//		System.out.println(map.size());
//		System.out.println(map.isEmpty());
//		
//		Set<Entry<String, String>> entrySet = map.entrySet();
//		for (Entry<String, String> entry : entrySet) {
//			System.out.println(entry.getKey() + entry.getValue());
//		}
//		
//		String str = new String();
//		str = "3";
//		String str1 = new String();
//		str1 = "3";
//		System.out.println(str1.equals(str));
//		System.out.println(str.hashCode());
		
		
		
		
		//map 2
		Map<Student, String> hashMap = new HashMap<Student, String>();
		hashMap.put(new Student("jay",20), "小张");
		hashMap.put(new Student("lisi",21), "李四");
		hashMap.put(new Student("jack",20), "小李");
		hashMap.put(new Student("lisi",21), "好好");
		System.out.println(hashMap.size());
	}

}

class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
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
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;	
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	
}