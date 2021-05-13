package com.basic;
import java.util.*;
public class EvenOdd {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ?");
		int num = sc.nextInt();
		String result = " ";
		
		if ( num % 2 ==0)
		{
			result = num + "even";
		}
		else
		{
			result = num + "Odd";
		}
		System.out.println(result);
	}

}
