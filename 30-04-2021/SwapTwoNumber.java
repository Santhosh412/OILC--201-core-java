package com.basic;

public class SwapTwoNumber {
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("beforeSwaping :" + num1 + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.printf("AfterSwaping :" + num1 + num2);
	}

}
