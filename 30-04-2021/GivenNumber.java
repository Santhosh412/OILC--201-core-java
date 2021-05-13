package com.basic;

public class GivenNumber {
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		if (num > 0)
		{
			sum = num;
		}
		else if (num < 0)
		{
			sum = num * (-1);
		}
		System.out.println("Absoulte number is :" + sum);
	}

}
