package com.guoyangc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AccountStringDemo {
	public static void main(String[] args) {
		String[] strs = {"zhangsan","zhangsan","lisi","zhangsan"};
		AccountUtil.printData(AccountUtil.account(strs));
	}
}

class AccountUtil{
	public static Map<String,Integer> account(String[] strs){
		Map<String,Integer> data = new HashMap<String, Integer>();
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			if(data.get(str) == null){
				data.put(str, 1);
			}else{
				//取出key所对应的值加1
				data.put(str, data.get(str) + 1);
			}
		}
		return data;
	}
	
	public static void printData(Map<String, Integer> data) {
		Set<Entry<String, Integer>> entrys = data.entrySet();
		for (Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}
}