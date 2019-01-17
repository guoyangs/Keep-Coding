package com.guoyangc.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectInputOutputDemo {

	public static void main(String[] args){
//		Student stu = new Student("sherlock",27);
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\guoyangc.txt"));
//		oos.writeObject(stu);
//		oos.close();
		
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("e:\\guoyangc.txt"));
			Student stu;
			try {
				stu = (Student) ois.readObject();
				System.out.println(stu.toString());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7558721077843818850L;
	private String name;
	private int age;
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
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
	
}
