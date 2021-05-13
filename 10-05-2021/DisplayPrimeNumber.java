package com.arrays;
import java.util.*;
public class DisplayPrimeNumber {
	
	static String getPrimes(int[] arr)
	{
		String res = " ";
		for(int i = 0; i < arr.length; i++)
		{
			if(isPrime(arr[i]))
			{
				res += arr[i] + " ";
			}
		}
		return res;
	}
	static boolean isPrime(int arr)
	{
		boolean b = true;
		if (arr < 2)
		{
			 b= false;
		}
		for(int i = 2; i < arr; i++)
		{
			if(arr % i == 0)
			{
				b = false;
			}
		}
		return b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 number");
		for(int i = 0; i < arr.length; i++)
		{
			 arr[i] = sc.nextInt();
		}
		System.out.println(getPrimes(arr));
	}

}
