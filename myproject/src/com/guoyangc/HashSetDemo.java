package com.guoyangc;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet<String> data = new HashSet<String>();
//		data.add("joker");
//		data.add("jay");
//		System.out.println(data.add("jack"));;
//		data.add("smith");
//		data.add("superman");
//		System.out.println(data);
		
		HashSet<StudentSet> stuSet = new HashSet<StudentSet>();
		System.out.println(stuSet.add(new StudentSet("jack", 27)));;
		System.out.println(stuSet.add(new StudentSet("jay", 27)));;
		System.out.println(stuSet.add(new StudentSet("jack", 27)));;
		System.out.println(stuSet.size());
	}

}

class StudentSet {
	private String name;
	private int age;
	
	public StudentSet(String name, int age) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentSet other = (StudentSet) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}