package com.ass2;

public class GreatestNumber {
	
	static String greatestFind(int num1,int num2) {
		if(num1 > num2)
			return "" + num1;
		else
			return "" + num2;
	}
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(greatestFind(num1 , num2));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
