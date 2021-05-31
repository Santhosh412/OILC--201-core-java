package com.ass2;

public class ThreeDPolindrome {
	static String polindrome(String s) {
		int num =Integer.parseInt(s);
		int x = num / 100;
		int y = num % 10;
		return "" + (x == y);
	}
	public static void main(String[] args) {
		System.out.println(polindrome(args[0]));
	}


}
