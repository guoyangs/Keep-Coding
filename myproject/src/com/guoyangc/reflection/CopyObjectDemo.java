package com.guoyangc.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//通过反射机制来复制一个对象
public class CopyObjectDemo {

	public static void main(String[] args) {
		//2生成一个学生对象（被复制的对象称为源对象）
		Student stu = new Student(1,"张三",30);
	    try {
			Student stu2 =(Student) ObjectCopyUtil.copyObj(stu);
			System.out.println("复制成功");
			System.out.println(stu2.toString());
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
/**
 *这是一个Copy对象的工具类，内部提供了一个Copy对象的方法，接收源对象。
 *
*/
class ObjectCopyUtil {
	public static Object copyObj(Object obj) throws Exception{
		//3.获取student对象所对应类型的Class是对象（也就是Student这个类所对应的Class对象）
		Class<?> classType = obj.getClass();
		//4.通过Class对象newInstance方法来构建一个目标对象.
		Object objRes = classType.newInstance();
		//5.获取class对象的get和set方法
		for (Field field : classType.getDeclaredFields()) {

			//直接获取源对象属性的值
			field.setAccessible(true);
			Object vlaue = field.get(obj);
			field.set(objRes, vlaue);
		}
		return objRes;
	}
}


//1声明一个学生类
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
