package com.ass2;

public class OddRounder {
	static String oddRound(int num) {
		if(num < 0) {
			return "Error";
		}
		if(num % 2 == 0)
			return "Even Number";
		else {
			num = (num / 10 +1) * 10;
			return "" + num;
		}
	}
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println(oddRound(num));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
