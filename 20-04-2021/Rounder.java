package com.ass2;

public class Rounder {
	
	static String round(int num) {
		if(num % 2 == 0) {
			num = (num / 10 + 1) * 10;
			return "" + num;
		}
		else 
			return "" + num;
	}

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if(num < 0) {
				System.out.println(10/0);
			}
			System.out.println(round(num));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
