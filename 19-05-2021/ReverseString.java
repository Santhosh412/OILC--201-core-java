package com.list;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = " Welcome to Java";
		
		str = str.toLowerCase();
		String arr[] = str.split(" ");
		String res = " ";
		for(String x : arr) {
			StringBuffer sb = new StringBuffer(x);
           String obj = sb.reverse().toString() ;
           res += obj.substring(0,1).toUpperCase() + obj.substring(1) + " ";
	}
		System.out.println(res);
	}
}
