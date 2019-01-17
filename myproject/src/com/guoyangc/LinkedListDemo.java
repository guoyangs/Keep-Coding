package com.guoyangc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
/*		List<String> sList = new LinkedList<String>();
		sList.add("c");
		Iterator<String> it = sList.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}*/
		
		MyStack<String> myStack = new MyStack<String>();
		
	}

}

class MyStack<T>{
	private LinkedList<T>  data = null;
	public MyStack() {
		data = new LinkedList<T>();
	}
	//»Î’ª
	public void push(T obj) {
		data.addFirst(obj);
	}
	//≥ˆ’ª
	public T pop() {
		return data.removeFirst();
	}
	
	public Iterator<T> iterator() {
		return data.iterator();
	}	
}

class MyQueue<T> {
	private LinkedList<T> data = null;
	public MyQueue() {
		data = new LinkedList<T>();
	}
	
	public void push(T obj) {
		data.addFirst(obj);
	}
	
	public T pop() {
		return data.removeLast();
	}
	
	public Iterator<T> iterator() {
		return data.iterator();
	}
}