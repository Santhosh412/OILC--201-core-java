package com.ass2;

public class EvenFinder {
	
	static String isCheck(int num) {
		return "" + (num % 2 == 0);
	}
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println(isCheck(num));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
