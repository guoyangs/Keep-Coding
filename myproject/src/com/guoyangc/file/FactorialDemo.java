package com.guoyangc.file;

public class FactorialDemo {

	public static void main(String[] args) {
		System.out.println(getfac(5));
	}
	public static int getfac(int n){
		if(n == 1){
			return 1;
		}else{
			return n*getfac(n-1);
		}
	}
}
