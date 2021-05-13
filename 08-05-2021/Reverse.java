package com.sample;
import java.util.*;
public class Reverse {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ?");
		int num = sc.nextInt();
		System.out.println(getDigitCount(num));
	}	
	public static int getDigitCount(int num)
	{
		int rem,count = 0;
		while(num > 0)
		{
			rem = num % 10;
			count++;
			num = num / 10;
		}
		return count;
	}
}
