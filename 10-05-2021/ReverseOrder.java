package com.arrays;
import java.util.*;
public class ReverseOrder {
	static void getReverseOder(int arr[])
	{
		for(int i = (arr.length - 1); i > 0; i--)
		{
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values");
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		getReverseOder(arr);
}
}