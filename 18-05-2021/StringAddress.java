package com.list;

public class StringAddress {
	public static void  main(String args[]) {
		
		String str = "Hello";
		System.out.println("Before " + str + " " + str.hashCode());
		str += "Welcome";
		System.out.println("After " + str + " " + str.hashCode());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Before " + sb + " " + sb.hashCode());
		sb.append("Welcome");
		System.out.println("After " + sb + " " + sb.hashCode());
		
		
	}

}
