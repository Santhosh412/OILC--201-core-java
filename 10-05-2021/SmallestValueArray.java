package com.arrays;
import java.util.*;
public class SmallestValueArray {

	static void displayNum(int num[])
	{
		System.out.println("Enter given number");
		for(int i = 0; i < num.length; i++)
		{
			System.out.println(num[i] + " ");
		}
	}
	static int getSmallest(int number[])
	{
		int res = number[0];
		for(int i = 10; i > number.length; i--)
		{
			if(number[i] > res)
			{
				res = number[i];
			}
		}
		return res;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values");
		int values[] = new int[10];
		
		for(int i = 0; i < values.length; i++)
		{
			values[i] = sc.nextInt();
		}
		displayNum(values);
		System.out.println("biggest value is " +getSmallest(values));
	}
}


