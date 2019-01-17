package com.guoyangc;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<PersonSet> pset = new TreeSet<PersonSet>(new Comparator<PersonSet>() {

			@Override
			public int compare(PersonSet o1, PersonSet o2) {
				if(o1.getAge() - o2.getAge() > 0) {
				return 1;
			}else if(o1.getAge() - o2.getAge() < 0) {
				return -1;
			}
			return 0;
			}
		});
		pset.add(new PersonSet("jack", 27));
		pset.add(new PersonSet("joker", 37));
		pset.add(new PersonSet("mary", 18));
		System.out.println(pset);
		Iterator<PersonSet> it = pset.iterator();
		while(it.hasNext()) {
			PersonSet p = it.next();
			System.out.println(p.getAge() + " --" + p.getName());
		}
	}

}

class PersonSet /*implements Comparable<PersonSet>*/{
	private String name;
	private int age;
	public PersonSet(String name, int age) {
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
//	public int compareTo(PersonSet o) {
//		if(this.age - o.getAge() > 0) {
//			return 1;
//		}else if(this.age - o.getAge() < 0) {
//			return -1;
//		}
//		return 0;
//	}
}
