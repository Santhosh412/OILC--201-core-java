package com.sample;
import java.util.*;
public class FibnocciSeries {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ?");
		int num = sc.nextInt();
		System.out.println(getFibnocci(num));
	}
	public static String getFibnocci(int num)
	{
		String res = "";
		int sum =0;
		int num1 = 0, num2 = 1;
		
		res += num1+" "+ num2+" ";
		for(int i = 0; i<=num; i++)
		{
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			res += sum+" ";
		}
		return res;
	}
}
