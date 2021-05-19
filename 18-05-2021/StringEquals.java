package com.list;

public class StringEquals {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		if(str1 == str2)
		{
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		if(str1.equals(str2)){
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}

	}

}
