package com.guoyangc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Persons> data = new ArrayList<Persons>();
		data.add(new Persons("jack", 20 , 9));
		data.add(new Persons("rose", 18 , 8));
		data.add(new Persons("mary", 28, 15));
		Collections.sort(data, new Comparator<Persons>() {

			@Override
			public int compare(Persons o1, Persons o2) {
				if(o1.getAge() - o2.getAge() > 0) {
					return 1;
				}else if(o1.getAge() - o2.getAge() < 0) {
					return -1;
				}
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		for (Persons persons : data) {
			System.out.println(persons);
		}
	}
	
}

class Persons{
	private String name;
	private int age;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Persons(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
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
		Persons other = (Persons) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}