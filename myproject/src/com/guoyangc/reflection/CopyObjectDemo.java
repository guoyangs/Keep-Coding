package com.guoyangc.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//ͨ���������������һ������
public class CopyObjectDemo {

	public static void main(String[] args) {
		//2����һ��ѧ�����󣨱����ƵĶ����ΪԴ����
		Student stu = new Student(1,"����",30);
	    try {
			Student stu2 =(Student) ObjectCopyUtil.copyObj(stu);
			System.out.println("���Ƴɹ�");
			System.out.println(stu2.toString());
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
/**
 *����һ��Copy����Ĺ����࣬�ڲ��ṩ��һ��Copy����ķ���������Դ����
 *
*/
class ObjectCopyUtil {
	public static Object copyObj(Object obj) throws Exception{
		//3.��ȡstudent��������Ӧ���͵�Class�Ƕ���Ҳ����Student���������Ӧ��Class����
		Class<?> classType = obj.getClass();
		//4.ͨ��Class����newInstance����������һ��Ŀ�����.
		Object objRes = classType.newInstance();
		//5.��ȡclass�����get��set����
		for (Field field : classType.getDeclaredFields()) {

			//ֱ�ӻ�ȡԴ�������Ե�ֵ
			field.setAccessible(true);
			Object vlaue = field.get(obj);
			field.set(objRes, vlaue);
		}
		return objRes;
	}
}


//1����һ��ѧ����
class Student {
	private int id;
	private String name;
	private int age;
	
	
	
	public Student() {
		super();
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
