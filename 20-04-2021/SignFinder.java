package com.ass2;

public class SignFinder {
	static String signCheck(int num) {
		if(num > 0)
			return "Positive Value";
		else if(num < 0) 
			return "Negative Value";
		else
			return "Zero";
	}
	public static void main(String[] args) {
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(signCheck(num));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
