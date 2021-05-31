package com.ass2;

public class SumOfDigits {
	static String sum(int num1, int num2) {
		return "" + (num1 + num2);
	}
	public static void main(String[] args) {
		String s = args[0];
		int num1 = Integer.parseInt(String.valueOf(s.charAt(0)));
		int num2 = Integer.parseInt(String.valueOf(s.charAt(1)));
		System.out.println( sum(num1,num2) );
	}
}
