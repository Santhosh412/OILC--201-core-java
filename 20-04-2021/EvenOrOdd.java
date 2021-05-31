package com.ass2;

public class EvenOrOdd {
	
	static String isCheck(int n) {
		String res = " ";
		if(n % 2 == 0)
			res += "Even Number";
		else
			res += "Odd Number";
		return res;
	}
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(isCheck(n));
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}


}
