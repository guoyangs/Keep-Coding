package com.guoyangc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> nList = new ArrayList<String>();
		nList.add("superman");
		nList.add("airman");
		nList.add("spiderman");
		nList.add("deadpool");
		System.out.println(nList);
		for (String string : nList) {
			System.out.println(string);
		}
		Collections.swap(nList, 1, 2);
		System.out.println(nList);
		for (String string : nList) {
			System.out.println(string);
		}
		Collections.sort(nList);
		System.out.println(nList);
		for (String string : nList) {
			System.out.println(string);
		}
		
		int num = Collections.binarySearch(nList, "superman");
		System.out.println(num);
		System.out.println("---------");
		Collections.shuffle(nList);
		for (String string : nList) {
			System.out.println(string);
		}
		System.out.println("---------");
		Collections.fill(nList, "joker");
		for (String string : nList) {
			System.out.println(string);
		}
	}

}
